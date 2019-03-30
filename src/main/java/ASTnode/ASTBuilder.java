package ASTnode;

import ASTnode.*;
import MStarTree.*;
import Error.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.lang.*;
import java.io.*;

public class ASTBuilder extends MStarTreeBaseVisitor<ASTNode> {

    SemanticError detectedError;



    @Override
    public ASTNode visitProgram(MStarTreeParser.ProgramContext context) {
        ProgramNode res = new ProgramNode();
        res.line = context.start.getLine();
        for (ParseTree item : context.children) {
            ASTNode node = visit(item);
            res.childrenList.add(node);
            if (item instanceof MStarTreeParser.ClassDefinitionContext)
                res.classDefinitionList.add((ClassDefinitionNode) node);
            else if (item instanceof MStarTreeParser.MethodDefinitionContext)
                res.methodDefinitionList.add((MethodDefinitionNode) node);
            else if(item instanceof MStarTreeParser.ExpressionDefinitionContext)
                res.variableDefinitionList.add((ExpressionDefinitionNode) node);
        }
        return res;
    }

    @Override
    public ASTNode visitClassDefinition(MStarTreeParser.ClassDefinitionContext context) {
        ClassDefinitionNode res = new ClassDefinitionNode();
        res.line = context.start.getLine();
        res.className = context.Identifier().getText();
        for (MStarTreeParser.MemberVariableContext item : context.memberVariable())
            res.memberVariableList.add((ExpressionDefinitionNode) visit(item));
        for (MStarTreeParser.MethodDefinitionContext item : context.methodDefinition())
            res.memberMethodList.add((MethodDefinitionNode) visit(item));
        for (MStarTreeParser.ConstructionMethodDefinitionContext item : context.constructionMethodDefinition())
            res.memberConstructionMethodList.add((MethodDefinitionNode) visit(item));
        return res;
    }

    @Override
    public ASTNode visitMemberVariable(MStarTreeParser.MemberVariableContext context) {
        ExpressionDefinitionNode res = new ExpressionDefinitionNode();
        res.line = context.start.getLine();
        res.variableType = (VariableTypeNode) visit(context.variableType());
        res.variableName = context.Identifier().getText();
        res.initValue = null;
        return res;
    }

    @Override
    public ASTNode visitConstructionMethodDefinition(MStarTreeParser.ConstructionMethodDefinitionContext context) {
        MethodDefinitionNode res = new MethodDefinitionNode();
        res.line = context.start.getLine();
        res.returnType = new PrimitiveTypeNode("void");
        res.methodName = context.Identifier().getText();
        if (context.formalParameterList() != null)
            for (MStarTreeParser.FormalParameterContext item : context.formalParameterList().formalParameter())
                res.formalArgumentList.add((ExpressionDefinitionNode) visit(item));
        res.block = (BlockNode) visit(context.block());
        return res;
    }

    @Override
    public ASTNode visitMethodDefinition(MStarTreeParser.MethodDefinitionContext context) {
        MethodDefinitionNode res = new MethodDefinitionNode();
        res.line = context.start.getLine();
        res.returnType = (VariableTypeNode) visit(context.variableType());
        res.methodName = context.Identifier().getText();
        if (context.formalParameterList() != null)
            for (MStarTreeParser.FormalParameterContext item : context.formalParameterList().formalParameter())
                res.formalArgumentList.add((ExpressionDefinitionNode) visit(item));
        res.block = (BlockNode) visit(context.block());
        return res;
    }

    @Override
    public ASTNode visitFormalParameter(MStarTreeParser.FormalParameterContext context) {
        ExpressionDefinitionNode res = new ExpressionDefinitionNode();
        res.line = context.start.getLine();
        res.variableType = (VariableTypeNode) visit(context.variableType());
        res.variableName = context.Identifier().getText();
        res.initValue = null;
        return res;
    }

    @Override
    public ASTNode visitBlock(MStarTreeParser.BlockContext context) {
        BlockNode res = new BlockNode();
        res.line = context.start.getLine();
        for (MStarTreeParser.BlockOrStatementContext item : context.blockOrStatement())
            if (item.block() != null) res.childList.add((BlockNode) visit(item.block()));
            else res.childList.add((StatementNode) visit(item.statement()));
        return res;
    }

    @Override
    public ASTNode visitBlockOrStatement(MStarTreeParser.BlockOrStatementContext context) {
        if (context.block() != null) return (BlockNode) visit(context.block());
        BlockNode res = new BlockNode();
        res.line = context.start.getLine();
        res.childList.add((StatementNode) visit(context.statement()));
        return res;
    }

    @Override
    public ASTNode visitDefinitionStat(MStarTreeParser.DefinitionStatContext context) {
        return (ExpressionDefinitionNode) visit(context.statementDefinition().expressionDefinition());
    }

    @Override
    public ASTNode visitExpressionStat(MStarTreeParser.ExpressionStatContext context) {
        return (ExpressionStatementNode) visit(context.expression());
    }

    @Override
    public ASTNode visitIfStat(MStarTreeParser.IfStatContext context) {
        IfStatementNode res = new IfStatementNode();
        res.line = context.start.getLine();
        res.condition = (ExpressionStatementNode) visit(context.expression());
        res.ifBlock = (BlockNode) visit(context.blockOrStatement(0));
        if (context.ELSE() == null) res.elseBlock = null;
        else res.elseBlock = (BlockNode) visit(context.blockOrStatement(1));
        return res;
    }

    @Override
    public ASTNode visitForStat(MStarTreeParser.ForStatContext context) {
        ForStatementNode res = new ForStatementNode();
        res.line = context.start.getLine();
        if (context.init == null) res.init = null;
        else res.init = (ExpressionStatementNode) visit(context.init);
        if (context.condition == null) res.condition = null;
        else res.condition = (ExpressionStatementNode) visit(context.condition);
        if (context.after_block == null) res.afterBlock = null;
        else res.afterBlock = (ExpressionStatementNode) visit(context.after_block);
        res.block = (BlockNode) visit(context.blockOrStatement());
        return res;
    }

    @Override
    public ASTNode visitWhileStat(MStarTreeParser.WhileStatContext context) {
        WhileStatementNode res = new WhileStatementNode();
        res.line = context.start.getLine();
        res.condition = (ExpressionStatementNode) visit(context.expression());
        res.block = (BlockNode) visit(context.blockOrStatement());
        return res;
    }

    @Override
    public ASTNode visitReturnStat(MStarTreeParser.ReturnStatContext context) {
        ReturnStatementNode res = new ReturnStatementNode();
        res.line = context.start.getLine();
        if (context.expression() == null) res.returnValue = null;
        else res.returnValue = (ExpressionStatementNode) visit(context.expression());
        return res;
    }

    @Override
    public ASTNode visitBreakStat(MStarTreeParser.BreakStatContext context) {
        BreakStatementNode res = new BreakStatementNode();
        res.line = context.start.getLine();
        return res;
    }

    @Override
    public ASTNode visitContinueStat(MStarTreeParser.ContinueStatContext context) {
        ContinueStatementNode res = new ContinueStatementNode();
        res.line = context.start.getLine();
        return res;
    }

    @Override
    public ASTNode visitEmptyStat(MStarTreeParser.EmptyStatContext context) {
        EmptyStatementNode res = new EmptyStatementNode();
        res.line = context.start.getLine();
        return res;
    }

    @Override
    public ASTNode visitStatementDefinition(MStarTreeParser.StatementDefinitionContext context) {
        return (ExpressionDefinitionNode) visit(context.expressionDefinition());
    }

    @Override
    public ASTNode visitConstantExpr(MStarTreeParser.ConstantExprContext context) {
        ConstantNode res = new ConstantNode();
        res.line = context.start.getLine();
        res.constantStr = context.getText();
        if (context.constant().LogicConstant() != null)
            res.exprType = new PrimitiveTypeNode("bool");
        if (context.constant().IntegerConstant() != null)
            res.exprType = new PrimitiveTypeNode("int");
        if (context.constant().StringConstant() != null)
            res.exprType = new ClassTypeNode("string");
        if (context.constant().NullConstant() != null)
            res.exprType = new PrimitiveTypeNode("null");
        return res;
    }

    @Override
    public ASTNode visitThisExpr(MStarTreeParser.ThisExprContext context) {
        ThisNode res = new ThisNode();
        res.line = context.start.getLine();
        return res;
    }

    @Override
    public ASTNode visitMemberAccessExpr(MStarTreeParser.MemberAccessExprContext context) {
        MemberAccessExpressionNode res = new MemberAccessExpressionNode();
        res.line = context.start.getLine();
        res.caller = (ExpressionStatementNode) visit(context.caller);
        res.member = (ExpressionStatementNode) visit(context.member);
        return res;
    }

    @Override
    public ASTNode visitIndexAccessExpr(MStarTreeParser.IndexAccessExprContext context) {
        IndexAccessExpressionNode res = new IndexAccessExpressionNode();
        res.line = context.start.getLine();
        if (context.caller instanceof MStarTreeParser.NewExprContext)
            detectedError = new SemanticError(res.line, "invalid dim of array");
        res.caller = (ExpressionStatementNode) visit(context.caller);
        res.index = (ExpressionStatementNode) visit(context.index);
        return res;
    }

    @Override
    public ASTNode visitMethodCallExpr(MStarTreeParser.MethodCallExprContext context) {
        MethodCallExpressionNode res = new MethodCallExpressionNode();
        res.line = context.start.getLine();
        res.caller = (ExpressionStatementNode) visit(context.caller);
        if (context.actualParameterList() != null)
            for (MStarTreeParser.ExpressionContext item : context.actualParameterList().expression())
                res.actualParameterList.add((ExpressionStatementNode) visit(item));
        return res;
    }

    @Override
    public ASTNode visitParensExpr(MStarTreeParser.ParensExprContext context) {
        return (ExpressionStatementNode) visit(context.expression());
    }

    @Override
    public ASTNode visitNewExpr(MStarTreeParser.NewExprContext context) {
        NewExpressionNode res = new NewExpressionNode();
        res.line = context.start.getLine();
        res.variableType = (VariableTypeNode) visit(context.creator().variableType());
        if (context.creator().actualParameterList() != null)
            for (MStarTreeParser.ExpressionContext item : context.creator().actualParameterList().expression())
                res.actualParameterList.add((ExpressionStatementNode) visit(item));
        return res;
    }

    @Override
    public ASTNode visitUnaryExpr(MStarTreeParser.UnaryExprContext context) {
        UnaryExpressionNode res = new UnaryExpressionNode();
        res.line = context.start.getLine();
        if (context.prefix != null) {
            switch (context.prefix.getType()) {
                case MStarTreeLexer.SELFINC:
                    res.op = UnaryExpressionNode.UnaryOp.PREFIX_INC;
                    break;
                case MStarTreeLexer.SELFDEC:
                    res.op = UnaryExpressionNode.UnaryOp.PREFIX_DEC;
                    break;
                case MStarTreeLexer.ADD:
                    return (ExpressionStatementNode) visit(context.expression());
                case MStarTreeLexer.SUB:
                    res.op = UnaryExpressionNode.UnaryOp.SUB;
                    break;
                case MStarTreeLexer.NOT:
                    res.op = UnaryExpressionNode.UnaryOp.NOT;
                    break;
                case MStarTreeLexer.NEG:
                    res.op = UnaryExpressionNode.UnaryOp.NEG;
                    break;
            }
        } else if (context.postfix != null) {
            switch (context.postfix.getType()) {
                case MStarTreeLexer.SELFINC:
                    res.op = UnaryExpressionNode.UnaryOp.POSTFIX_INC;
                    break;
                case MStarTreeLexer.SELFDEC:
                    res.op = UnaryExpressionNode.UnaryOp.POSTFIX_DEC;
                    break;
            }
        }
        res.inner = (ExpressionStatementNode) visit(context.expression());
        return res;
    }

    @Override
    public ASTNode visitBinaryExpr(MStarTreeParser.BinaryExprContext context) {
        BinaryExpressionNode res = new BinaryExpressionNode();
        res.line = context.start.getLine();
        switch (context.op.getType()) {
            case MStarTreeLexer.MUL:
                res.op = BinaryExpressionNode.BinaryOp.MUL;
                break;
            case MStarTreeLexer.DIV:
                res.op = BinaryExpressionNode.BinaryOp.DIV;
                break;
            case MStarTreeLexer.MOD:
                res.op = BinaryExpressionNode.BinaryOp.MOD;
                break;
            case MStarTreeLexer.ADD:
                res.op = BinaryExpressionNode.BinaryOp.ADD;
                break;
            case MStarTreeLexer.SUB:
                res.op = BinaryExpressionNode.BinaryOp.SUB;
                break;
            case MStarTreeLexer.LSHIFT:
                res.op = BinaryExpressionNode.BinaryOp.LSHIFT;
                break;
            case MStarTreeLexer.RSHIFT:
                res.op = BinaryExpressionNode.BinaryOp.RSHIFT;
                break;
            case MStarTreeLexer.LE:
                res.op = BinaryExpressionNode.BinaryOp.LE;
                break;
            case MStarTreeLexer.GE:
                res.op = BinaryExpressionNode.BinaryOp.GE;
                break;
            case MStarTreeLexer.LT:
                res.op = BinaryExpressionNode.BinaryOp.LT;
                break;
            case MStarTreeLexer.GT:
                res.op = BinaryExpressionNode.BinaryOp.GT;
                break;
            case MStarTreeLexer.EQ:
                res.op = BinaryExpressionNode.BinaryOp.EQUAL;
                break;
            case MStarTreeLexer.NEQ:
                res.op = BinaryExpressionNode.BinaryOp.NOTEQUAL;
                break;
            case MStarTreeLexer.AND:
                res.op = BinaryExpressionNode.BinaryOp.AND;
                break;
            case MStarTreeLexer.XOR:
                res.op = BinaryExpressionNode.BinaryOp.XOR;
                break;
            case MStarTreeLexer.OR:
                res.op = BinaryExpressionNode.BinaryOp.OR;
                break;
            case MStarTreeLexer.LOGAND:
                res.op = BinaryExpressionNode.BinaryOp.LAND;
                break;
            case MStarTreeLexer.LOGOR:
                res.op = BinaryExpressionNode.BinaryOp.LOR;
                break;
            case MStarTreeLexer.ASSIGN:
                res.op = BinaryExpressionNode.BinaryOp.ASSIGN;
                break;
        }
        res.lhs = (ExpressionStatementNode) visit(context.lhs);
        res.rhs = (ExpressionStatementNode) visit(context.rhs);
        return res;
    }

    @Override
    public ASTNode visitDefinitionExpr(MStarTreeParser.DefinitionExprContext context) {
        return (ExpressionDefinitionNode) visit(context.expressionDefinition());
    }

    @Override
    public ASTNode visitExpressionDefinition(MStarTreeParser.ExpressionDefinitionContext context) {
        ExpressionDefinitionNode res = new ExpressionDefinitionNode();
        res.line = context.start.getLine();
        res.variableType = (VariableTypeNode) visit(context.variableType());
        res.variableName = context.Identifier().getText();
        if (context.expression() == null) res.initValue = null;
        else res.initValue = (ExpressionStatementNode) visit(context.expression());
        return res;
    }

    @Override
    public ASTNode visitIdentifierExpr(MStarTreeParser.IdentifierExprContext context) {
        ReferenceNode res = new ReferenceNode(context.getText());
        res.line = context.start.getLine();
        return res;
    }

    @Override
    public ASTNode visitArrayVariableType(MStarTreeParser.ArrayVariableTypeContext context) {
        int dim = context.arrayCreatorRest().LBRACK().size();
        int dimOfExpr = context.arrayCreatorRest().expression().size();
        VariableTypeNode res, tmp;
        if (context.Identifier() != null)
            res = new ClassTypeNode(context.Identifier().getText());
        else res = new PrimitiveTypeNode(context.primitiveType().getText());
        for (int i = dim - 1; i >= 0; --i) {
            tmp = new ArrayTypeNode();
            ((ArrayTypeNode) tmp).innerTypeNode = res;
            if (i < dimOfExpr) ((ArrayTypeNode) tmp).size =
                    (ExpressionStatementNode) visit(context.arrayCreatorRest().expression(i));
            res = tmp;
        }
        res.line = context.start.getLine();
        return res;
    }

    @Override
    public ASTNode visitNonArrayVariableType(MStarTreeParser.NonArrayVariableTypeContext context) {
        NonArrayTypeNode res;
        if (context.Identifier() != null)
            res = new ClassTypeNode(context.Identifier().getText());
        else res = new PrimitiveTypeNode(context.primitiveType().getText());
        res.line = context.start.getLine();
        return res;
    }

    InputStream addBuiltInCode(String path) throws IOException {
        String dir = "";
        OutputStream os = new FileOutputStream(dir + "test/tmp.txt");
        InputStream is = new FileInputStream(dir + "test/builder.txt");
        int b;

        while ((b = is.read()) != -1) {
            os.write(b);
        }
        is = new FileInputStream(path);
        while ((b = is.read()) != -1) {
            os.write(b);
        }
        is.close();

        is.close();
        os.close();
        return new FileInputStream(dir + "test/tmp.txt");
    }

    public ProgramNode buildAST(String path) throws IOException, SemanticError {

            InputStream is = addBuiltInCode(path);




            ANTLRInputStream input = new ANTLRInputStream(is);

           // System.out.println(input);

            MStarTreeLexer lexer = new MStarTreeLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

           // lexer.removeErrorListener(MStarTreeListener);

            MStarTreeParser parser = new MStarTreeParser(tokens);
            ASTBuilder builder = new ASTBuilder();
        ParseTree cst = parser.program();
        ProgramNode prog = (ProgramNode) builder.visit(cst);
        if (builder.detectedError != null)
            throw builder.detectedError;

        return prog;
    }
}

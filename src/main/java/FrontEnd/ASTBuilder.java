package FrontEnd;

import ASTNode.*;
import MStarTree.*;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;
import Util.CompilerError;

import java.util.*;

public class ASTBuilder extends MStarTreeBaseVisitor<ASTNode>
{
    private boolean commonExprOptimize = true;

    @Override
    public ASTNode visitProgram(MStarTreeParser.ProgramContext ctx)
    {
        ProgramNode node = new ProgramNode();
        node.line = ctx.start.getLine();
        List<DefinitionNode> defs = new ArrayList<DefinitionNode>();
        if (ctx.programSection() != null) {
            for (ParserRuleContext programSec : ctx.programSection()) {
                ASTNode def = visit(programSec);
                defs.add((DefinitionNode) def);
            }
        }
        node.def = defs;
        return node;
    }

    @Override
    public ASTNode visitProgramSection(MStarTreeParser.ProgramSectionContext ctx)
    {
        if (ctx.variableDefinition() != null) return visit(ctx.variableDefinition());
        else if (ctx.functionDefinition() != null) return visit(ctx.functionDefinition());
        else if (ctx.classDefinition() != null) return visit(ctx.classDefinition());
        else throw new CompilerError(ctx.start.getLine(), "Invalid program section");
    }

    @Override
    public ASTNode visitFunctionDefinition(MStarTreeParser.FunctionDefinitionContext ctx)
    {
        FunctionDefinitionNode node = new FunctionDefinitionNode(ctx.start.getLine());
        node.returnType =  ctx.functionType() == null ? null : (TypeNode) visit(ctx.functionType());
        node.name = ctx.ID().getText();
        node.body = (BlockStatementNode) visit(ctx.block());
        List<VariableDefinitionNode> parameterList = new ArrayList<>();
        if (ctx.parameterListDefinition() != null) {
            for (ParserRuleContext parameterDefinition : ctx.parameterListDefinition().parameterDefinition()) {
                ASTNode paraDefinition = visit(parameterDefinition);
                parameterList.add((VariableDefinitionNode) paraDefinition);
            }
        }
        node.parameterList = parameterList;
        return node;
    }

    @Override
    public ASTNode visitClassDefinition(MStarTreeParser.ClassDefinitionContext ctx)
    {
        String name = ctx.ID().getText();
        List<VariableDefinitionNode> varMember = new ArrayList<>();
        List<FunctionDefinitionNode> funMember = new ArrayList<>();
        if (ctx.memberDefinition() != null) {
            for (ParserRuleContext memberDefinition : ctx.memberDefinition()) {
                ASTNode memberDefinitionaration = visit(memberDefinition);
                if (memberDefinitionaration instanceof VariableDefinitionNode) varMember.add((VariableDefinitionNode) memberDefinitionaration);
                else if (memberDefinitionaration instanceof FunctionDefinitionNode) funMember.add((FunctionDefinitionNode) memberDefinitionaration);
                else throw new CompilerError(ctx.start.getLine(), "Invalid member Definitionaration");
            }
        }
        return new ClassDefinitionNode(name, varMember, funMember, ctx.start.getLine());
    }

    @Override
    public ASTNode visitVariableDefinition(MStarTreeParser.VariableDefinitionContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.typeType());
        String name = ctx.ID().getText();
        ExpressionNode expr = ctx.expression() == null ? null : (ExpressionNode) visit(ctx.expression());
        return new VariableDefinitionNode(type, name, expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitMemberDefinition(MStarTreeParser.MemberDefinitionContext ctx)
    {
        if (ctx.variableDefinition() != null) return visit(ctx.variableDefinition());
        else if (ctx.functionDefinition() != null) return visit(ctx.functionDefinition());
        else throw new CompilerError(ctx.start.getLine(), "Invalid member Definitionaration");
    }

    @Override
    public ASTNode visitParameterDefinition(MStarTreeParser.ParameterDefinitionContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.typeType());
        String name = ctx.ID().getText();
        return new VariableDefinitionNode(type, name, null, ctx.start.getLine());
    }

    @Override
    public ASTNode visitFunctionType(MStarTreeParser.FunctionTypeContext ctx)
    {
        if (ctx.typeType() != null) return visit(ctx.typeType());
        else return new TypeNode(VoidType.getVoidType(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitArrayType(MStarTreeParser.ArrayTypeContext ctx)
    {
        TypeNode baseType = (TypeNode) visit(ctx.typeType());
        return new TypeNode(new ArrayType(baseType.getType()), ctx.start.getLine());
    }

    @Override
    public ASTNode visitNonArrayType(MStarTreeParser.NonArrayTypeContext ctx)
    {
        return visit(ctx.basicType());
    }

    @Override
    public ASTNode visitBasicType(MStarTreeParser.BasicTypeContext ctx)
    {
        if (ctx.INT() != null) return new TypeNode(IntType.getIntType(), ctx.start.getLine());
        else if (ctx.BOOL() != null) return new TypeNode(BoolType.getBoolType(), ctx.start.getLine());
        else if (ctx.STRING() != null) return new TypeNode(StringType.getStringType(), ctx.start.getLine());
        else if (ctx.ID() != null) return new TypeNode(new ClassType(ctx.ID().getText()), ctx.start.getLine());
        else throw new CompilerError(ctx.start.getLine(), "Invalid type");
    }

    @Override
    public ASTNode visitNonArrayTypeCreator(MStarTreeParser.NonArrayTypeCreatorContext ctx)
    {
        if (ctx.INT() != null) return new TypeNode(IntType.getIntType(), ctx.start.getLine());
        else if (ctx.BOOL() != null) return new TypeNode(BoolType.getBoolType(), ctx.start.getLine());
        else if (ctx.STRING() != null) return new TypeNode(StringType.getStringType(), ctx.start.getLine());
        else if (ctx.ID() != null) return new TypeNode(new ClassType(ctx.ID().getText()), ctx.start.getLine());
        else throw new CompilerError(ctx.start.getLine(), "Invalid type");
    }

    @Override
    public ASTNode visitBlockStmt(MStarTreeParser.BlockStmtContext ctx)
    {
        return visit(ctx.block());
    }

    @Override
    public ASTNode visitExpressionStmt(MStarTreeParser.ExpressionStmtContext ctx)
    {
        if (ctx.expression() == null) return null;
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        return new ExpressionStatementNode(expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitBlock(MStarTreeParser.BlockContext ctx)
    {
        LinkedList<ASTNode> stmtsAndVarDefinitions = new LinkedList<>();
        if (ctx.blockStatement() != null) {
            for (ParserRuleContext blockStmt : ctx.blockStatement()) {
                ASTNode stmtAndVarDefinition = visit(blockStmt);
                if (stmtAndVarDefinition != null) stmtsAndVarDefinitions.add(stmtAndVarDefinition);
            }
        }
        return new BlockStatementNode(stmtsAndVarDefinitions, ctx.start.getLine());
    }

    @Override
    public ASTNode visitStmt(MStarTreeParser.StmtContext ctx)
    {
        return visit(ctx.statement());
    }

    @Override
    public ASTNode visitVarDeclStmt(MStarTreeParser.VarDeclStmtContext ctx)
    {
        return visit(ctx.variableDefinition());
    }

    @Override
    public ASTNode visitIfElseStmt(MStarTreeParser.IfElseStmtContext ctx)
    {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        StatementNode thenStmt = (StatementNode) visit(ctx.thenStmt);
        StatementNode elseStmt = ctx.elseStmt == null ? null : (StatementNode) visit(ctx.elseStmt);
        return new IfStatementNode(condition, thenStmt, elseStmt, ctx.start.getLine());
    }

    @Override
    public ASTNode visitWhileStmt(MStarTreeParser.WhileStmtContext ctx)
    {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        StatementNode stmt = (StatementNode) visit(ctx.statement());
        return new WhileStatementNode(condition, stmt, ctx.start.getLine());
    }

    @Override
    public ASTNode visitForStmt(MStarTreeParser.ForStmtContext ctx)
    {
        ExpressionNode init = ctx.init == null ? null : (ExpressionNode) visit(ctx.init);
        ExpressionNode cond = ctx.cond == null ? null : (ExpressionNode) visit(ctx.cond);
        ExpressionNode update = ctx.update == null ? null : (ExpressionNode) visit(ctx.update);
        StatementNode stmt = (StatementNode) visit(ctx.statement());
        return new ForStatementNode(init, cond, update, stmt, ctx.start.getLine());
    }

    @Override
    public ASTNode visitContinueStmt(MStarTreeParser.ContinueStmtContext ctx)
    {
        return new ContinueStatementNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitBreakStmt(MStarTreeParser.BreakStmtContext ctx)
    {
        return new BreakStatementNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitReturnStmt(MStarTreeParser.ReturnStmtContext ctx)
    {
        ExpressionNode expr = ctx.expression() == null ? null : (ExpressionNode) visit(ctx.expression());
        return new ReturnStatementNode(expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitNewExpr(MStarTreeParser.NewExprContext ctx)
    {
        return visit(ctx.creator());
    }

    @Override
    public ASTNode visitPrefixExpr(MStarTreeParser.PrefixExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        PrefixExpressionNode.prefixOp op;
        if (ctx.op.getText().equals("++")) op = PrefixExpressionNode.prefixOp.INC;
        else if (ctx.op.getText().equals("--")) op = PrefixExpressionNode.prefixOp.DEC;
        else if (ctx.op.getText().equals("+")) op = PrefixExpressionNode.prefixOp.POS;
        else if (ctx.op.getText().equals("-")) op = PrefixExpressionNode.prefixOp.NEG;
        else if (ctx.op.getText().equals("!")) op = PrefixExpressionNode.prefixOp.LOGIC_NOT;
        else if (ctx.op.getText().equals("~")) op = PrefixExpressionNode.prefixOp.BITWISE_NOT;
        else throw new CompilerError(ctx.start.getLine(), "Invalid prefix operator");
        return new PrefixExpressionNode(op, expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitArrayExpr(MStarTreeParser.ArrayExprContext ctx)
    {
        ExpressionNode arr = (ExpressionNode) visit(ctx.arr), sub = (ExpressionNode) visit(ctx.sub);
        return new ArrayExpressionNode(arr, sub, ctx.start.getLine());
    }

    @Override
    public ASTNode visitSuffixExpr(MStarTreeParser.SuffixExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        SuffixExpressionNode.suffixOp op;
        if (ctx.op.getText().equals("++")) op = SuffixExpressionNode.suffixOp.INC;
        else if (ctx.op.getText().equals("--")) op = SuffixExpressionNode.suffixOp.DEC;
        else throw new CompilerError(ctx.start.getLine(), "Invalid suffix operator");
        return new SuffixExpressionNode(op, expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitBinaryExpr(MStarTreeParser.BinaryExprContext ctx)
    {
        ExpressionNode lhs = (ExpressionNode) visit(ctx.lhs), rhs = (ExpressionNode) visit(ctx.rhs);
        BinaryExpressionNode.binaryOp op;
        switch (ctx.op.getText()) {
            case "*":
                op = BinaryExpressionNode.binaryOp.MUL;
                break;
            case "/":
                op = BinaryExpressionNode.binaryOp.DIV;
                break;
            case "%":
                op = BinaryExpressionNode.binaryOp.MOD;
                break;
            case "+":
                op = BinaryExpressionNode.binaryOp.ADD;
                break;
            case "-":
                op = BinaryExpressionNode.binaryOp.SUB;
                break;
            case "<<":
                op = BinaryExpressionNode.binaryOp.SHL;
                break;
            case ">>":
                op = BinaryExpressionNode.binaryOp.SHR;
                break;
            case "<":
                op = BinaryExpressionNode.binaryOp.LESS;
                break;
            case ">":
                op = BinaryExpressionNode.binaryOp.GREATER;
                break;
            case "<=":
                op = BinaryExpressionNode.binaryOp.LESS_EQUAL;
                break;
            case ">=":
                op = BinaryExpressionNode.binaryOp.GREATER_EQUAL;
                break;
            case "==":
                op = BinaryExpressionNode.binaryOp.EQUAL;
                break;
            case "!=":
                op = BinaryExpressionNode.binaryOp.UNEQUAL;
                break;
            case "&":
                op = BinaryExpressionNode.binaryOp.BITWISE_AND;
                break;
            case "^":
                op = BinaryExpressionNode.binaryOp.BITWISE_XOR;
                break;
            case "|":
                op = BinaryExpressionNode.binaryOp.BITWISE_OR;
                break;
            case "&&":
                op = BinaryExpressionNode.binaryOp.LOGIC_AND;
                break;
            case "||":
                op = BinaryExpressionNode.binaryOp.LOGIC_OR;
                break;
            default:
                throw new CompilerError(ctx.start.getLine(), "Invalid binary operator");
        }
        if (lhs instanceof StringExpressionNode || rhs instanceof StringExpressionNode) commonExprOptimize = false;
        if (lhs instanceof PrefixExpressionNode || rhs instanceof PrefixExpressionNode) commonExprOptimize = false;
        if (lhs instanceof SuffixExpressionNode || rhs instanceof SuffixExpressionNode) commonExprOptimize = false;
        if (lhs instanceof AssignExpressionNode || rhs instanceof AssignExpressionNode) commonExprOptimize = false;
        if (lhs instanceof FunctionCallExpressionNode || rhs instanceof FunctionCallExpressionNode) commonExprOptimize = false;
        if (commonExprOptimize && lhs.equals(rhs)) {
            if (op == BinaryExpressionNode.binaryOp.ADD)
                return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL, lhs,
                        new NumExpressionNode(2, ctx.start.getLine()), ctx.start.getLine());
            else if (op == BinaryExpressionNode.binaryOp.SUB)
                return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL, lhs,
                        new NumExpressionNode(0, ctx.start.getLine()), ctx.start.getLine());
        }
        if (commonExprOptimize && (op == BinaryExpressionNode.binaryOp.ADD || op == BinaryExpressionNode.binaryOp.SUB)) {
            if (lhs instanceof BinaryExpressionNode
                    && ((BinaryExpressionNode) lhs).op == BinaryExpressionNode.binaryOp.MUL) {
                if (((BinaryExpressionNode) lhs).lhs.equals(rhs)
                        && ((BinaryExpressionNode) lhs).rhs instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                lhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).rhs).value + 1,
                                ctx.start.getLine()), ctx.start.getLine());
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                            lhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).rhs).value - 1,
                            ctx.start.getLine()), ctx.start.getLine());
                }
                if (((BinaryExpressionNode) lhs).rhs.equals(rhs) && ((BinaryExpressionNode) lhs).lhs instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL, lhs,
                                new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value + 1,
                                        ctx.start.getLine()), ctx.start.getLine());
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                            lhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value - 1,
                            ctx.start.getLine()), ctx.start.getLine());
                }
            }
            if (rhs instanceof BinaryExpressionNode && ((BinaryExpressionNode) rhs).op == BinaryExpressionNode.binaryOp.MUL) {
                if (((BinaryExpressionNode) rhs).lhs.equals(lhs) && ((BinaryExpressionNode) rhs).rhs instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) rhs).rhs).value + 1,
                                ctx.start.getLine()), ctx.start.getLine());
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                            rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) rhs).rhs).value - 1,
                            ctx.start.getLine()), ctx.start.getLine());
                }
                if (((BinaryExpressionNode) rhs).rhs.equals(lhs) && ((BinaryExpressionNode) rhs).lhs instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value + 1,
                                ctx.start.getLine()), ctx.start.getLine());
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                            rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value - 1,
                            ctx.start.getLine()), ctx.start.getLine());
                }
            }
            if (lhs instanceof BinaryExpressionNode
                    && rhs instanceof BinaryExpressionNode
                    && ((BinaryExpressionNode) lhs).op == BinaryExpressionNode.binaryOp.MUL
                    && ((BinaryExpressionNode) rhs).op == BinaryExpressionNode.binaryOp.MUL) {
                if (((BinaryExpressionNode) lhs).lhs instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).lhs instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).rhs.equals(((BinaryExpressionNode) rhs).rhs)) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).rhs,
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).lhs).value,
                                            ctx.start.getLine()), ctx.start.getLine());
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                ((BinaryExpressionNode) lhs).rhs,
                                new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value
                                        - ((NumExpressionNode) ((BinaryExpressionNode) rhs).lhs).value,
                                        ctx.start.getLine()), ctx.start.getLine());
                    }
                } else if (((BinaryExpressionNode) lhs).lhs instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).rhs instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).rhs.equals(((BinaryExpressionNode) rhs).lhs)) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).rhs,
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).rhs).value,
                                            ctx.start.getLine()), ctx.start.getLine());
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                ((BinaryExpressionNode) lhs).rhs,
                                new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).lhs).value
                                        - ((NumExpressionNode) ((BinaryExpressionNode) rhs).rhs).value,
                                        ctx.start.getLine()), ctx.start.getLine());
                    }
                } else if (((BinaryExpressionNode) lhs).rhs instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).lhs instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).lhs.equals(((BinaryExpressionNode) rhs).rhs)) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).lhs,
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).rhs).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).lhs).value,
                                            ctx.start.getLine()), ctx.start.getLine());
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                ((BinaryExpressionNode) lhs).lhs,
                                new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).rhs).value
                                        - ((NumExpressionNode) ((BinaryExpressionNode) rhs).lhs).value,
                                        ctx.start.getLine()), ctx.start.getLine());
                    }
                } else if (((BinaryExpressionNode) lhs).rhs instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).rhs instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).lhs.equals(((BinaryExpressionNode) rhs).lhs)) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).lhs,
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).rhs).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).rhs).value,
                                            ctx.start.getLine()), ctx.start.getLine());
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                ((BinaryExpressionNode) lhs).lhs,
                                new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).rhs).value
                                        - ((NumExpressionNode) ((BinaryExpressionNode) rhs).rhs).value,
                                        ctx.start.getLine()), ctx.start.getLine());
                    }
                }
            }
        }
        return new BinaryExpressionNode(op, lhs, rhs, ctx.start.getLine());
    }

    @Override
    public ASTNode visitMemExpr(MStarTreeParser.MemExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        String name = ctx.ID().getText();
        return new MemberExpressionNode(expr, name, ctx.start.getLine());
    }

    @Override
    public ASTNode visitFuncCallExpr(MStarTreeParser.FuncCallExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        LinkedList<ExpressionNode> paraList = new LinkedList<>();
        if (ctx.parameterList() != null) {
            for (ParserRuleContext parameter : ctx.parameterList().expression()) {
                ExpressionNode para = (ExpressionNode) visit(parameter);
                paraList.add(para);
            }
        }
        return new FunctionCallExpressionNode(expr, paraList, ctx.start.getLine());
    }

    @Override
    public ASTNode visitAssignExpr(MStarTreeParser.AssignExprContext ctx)
    {
        ExpressionNode lhs = (ExpressionNode) visit(ctx.lhs), rhs = (ExpressionNode) visit(ctx.rhs);
        return new AssignExpressionNode(lhs, rhs, ctx.start.getLine());
    }

    @Override
    public ASTNode visitIdExpr(MStarTreeParser.IdExprContext ctx)
    {
        String name = ctx.ID().getText();
        return new IdExpressionNode(name, ctx.start.getLine());
    }

    @Override
    public ASTNode visitThisExpr(MStarTreeParser.ThisExprContext ctx)
    {
        return new ThisExpressionNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitBracketsExpr(MStarTreeParser.BracketsExprContext ctx)
    {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitNumExpr(MStarTreeParser.NumExprContext ctx)
    {
        int value;
        try {
            value = Integer.parseInt(ctx.getText());
        }
        catch (Exception e) {
            throw new CompilerError(ctx.start.getLine(), "Invalid number: " + e);
        }
        return new NumExpressionNode(value, ctx.start.getLine());
    }

    @Override
    public ASTNode visitStrExpr(MStarTreeParser.StrExprContext ctx)
    {
        commonExprOptimize = false;
        String str = ctx.getText();
        StringBuffer s = new StringBuffer();
        int len = str.length();
        for (int i = 0; i < len; ++i) {
            if (str.charAt(i) == '\\' && i + 1 < len){
                if (str.charAt(i + 1) == '\\') s.append('\\');
                else if (str.charAt(i + 1) == 'n') s.append('\n');
                else if (str.charAt(i + 1) == '\"') s.append('\"');
                else throw new CompilerError(ctx.start.getLine(), "Invalid string");
                ++i;
            }
            else s.append(str.charAt(i));
        }
        return new StringExpressionNode(s.toString(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitNullExpr(MStarTreeParser.NullExprContext ctx)
    {
        return new NullExpressionNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitBoolExpr(MStarTreeParser.BoolExprContext ctx)
    {
        boolean value;
        if (ctx.getText().equals("true")) value = true;
        else if (ctx.getText().equals("false")) value = false;
        else throw new CompilerError(ctx.start.getLine(), "Invalid bool constant");
        return new BoolExpressionNode(value, ctx.start.getLine());
    }

    @Override
    public ASTNode visitErrorCreator(MStarTreeParser.ErrorCreatorContext ctx)
    {
        throw new CompilerError(ctx.start.getLine(), "Invalid creator");
    }

    @Override
    public ASTNode visitArrayCreator(MStarTreeParser.ArrayCreatorContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.basicType());
        LinkedList<ExpressionNode> exprList = new LinkedList<>();
        int cnt = 0;
        for (ParserRuleContext ExprList : ctx.expression()) {
            ExpressionNode expr = (ExpressionNode) visit(ExprList);
            exprList.add(expr);
            ++cnt;
        }
        int dimNum = (ctx.getChildCount() - cnt - 1) / 2;
        for (int i = 0; i < dimNum; ++i) type.setType(new ArrayType(type.getType()));
        return new NewExpressionNode(type, exprList, dimNum, ctx.start.getLine());
    }

    @Override
    public ASTNode visitNonArrayCreator(MStarTreeParser.NonArrayCreatorContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.nonArrayTypeCreator());
        return new NewExpressionNode(type, null, 0, ctx.start.getLine());
    }
}


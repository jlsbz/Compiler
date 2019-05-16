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
        List<DefinitionNode> defs = new ArrayList<DefinitionNode>();
        if (ctx.programSection() != null) {
            for (ParserRuleContext programSec : ctx.programSection()) {
                ASTNode def = visit(programSec);
                defs.add((DefinitionNode) def);
            }
        }
        return new ProgramNode(defs, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitProgramSection(MStarTreeParser.ProgramSectionContext ctx)
    {
        if (ctx.variableDefinition() != null) return visit(ctx.variableDefinition());
        else if (ctx.functionDefinition() != null) return visit(ctx.functionDefinition());
        else if (ctx.classDefinition() != null) return visit(ctx.classDefinition());
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid program section");
    }

    @Override
    public ASTNode visitFunctionDefinition(MStarTreeParser.FunctionDefinitionContext ctx)
    {
        TypeNode returnType = ctx.functionType() == null ? null : (TypeNode) visit(ctx.functionType());
        String name = ctx.ID().getText();
        List<VariableDefinitionNode> parameterList = new ArrayList<>();
        if (ctx.parameterListDefinition() != null) {
            for (ParserRuleContext parameterDefinition : ctx.parameterListDefinition().parameterDefinition()) {
                ASTNode paraDefinition = visit(parameterDefinition);
                parameterList.add((VariableDefinitionNode) paraDefinition);
            }
        }
        BlockStatementNode body = (BlockStatementNode) visit(ctx.block());
        return new FunctionDefinitionNode(returnType, name, parameterList, body, Location.ctxGetLoc(ctx));
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
                else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid member Definitionaration");
            }
        }
        return new ClassDefinitionNode(name, varMember, funMember, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitVariableDefinition(MStarTreeParser.VariableDefinitionContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.typeType());
        String name = ctx.ID().getText();
        ExpressionNode expr = ctx.expression() == null ? null : (ExpressionNode) visit(ctx.expression());
        return new VariableDefinitionNode(type, name, expr, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitMemberDefinition(MStarTreeParser.MemberDefinitionContext ctx)
    {
        if (ctx.variableDefinition() != null) return visit(ctx.variableDefinition());
        else if (ctx.functionDefinition() != null) return visit(ctx.functionDefinition());
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid member Definitionaration");
    }

    @Override
    public ASTNode visitParameterDefinition(MStarTreeParser.ParameterDefinitionContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.typeType());
        String name = ctx.ID().getText();
        return new VariableDefinitionNode(type, name, null, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitFunctionType(MStarTreeParser.FunctionTypeContext ctx)
    {
        if (ctx.typeType() != null) return visit(ctx.typeType());
        else return new TypeNode(VoidType.getVoidType(), Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitArrayType(MStarTreeParser.ArrayTypeContext ctx)
    {
        TypeNode baseType = (TypeNode) visit(ctx.typeType());
        return new TypeNode(new ArrayType(baseType.getType()), Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitNonArrayType(MStarTreeParser.NonArrayTypeContext ctx)
    {
        return visit(ctx.basicType());
    }

    @Override
    public ASTNode visitBasicType(MStarTreeParser.BasicTypeContext ctx)
    {
        if (ctx.INT() != null) return new TypeNode(IntType.getIntType(), Location.ctxGetLoc(ctx));
        else if (ctx.BOOL() != null) return new TypeNode(BoolType.getBoolType(), Location.ctxGetLoc(ctx));
        else if (ctx.STRING() != null) return new TypeNode(StringType.getStringType(), Location.ctxGetLoc(ctx));
        else if (ctx.ID() != null) return new TypeNode(new ClassType(ctx.ID().getText()), Location.ctxGetLoc(ctx));
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid type");
    }

    @Override
    public ASTNode visitNonArrayTypeCreator(MStarTreeParser.NonArrayTypeCreatorContext ctx)
    {
        if (ctx.INT() != null) return new TypeNode(IntType.getIntType(), Location.ctxGetLoc(ctx));
        else if (ctx.BOOL() != null) return new TypeNode(BoolType.getBoolType(), Location.ctxGetLoc(ctx));
        else if (ctx.STRING() != null) return new TypeNode(StringType.getStringType(), Location.ctxGetLoc(ctx));
        else if (ctx.ID() != null) return new TypeNode(new ClassType(ctx.ID().getText()), Location.ctxGetLoc(ctx));
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid type");
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
        return new ExpressionStatementNode(expr, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitBlock(MStarTreeParser.BlockContext ctx)
    {
        List<ASTNode> stmtsAndVarDefinitions = new ArrayList<>();
        if (ctx.blockStatement() != null) {
            for (ParserRuleContext blockStmt : ctx.blockStatement()) {
                ASTNode stmtAndVarDefinition = visit(blockStmt);
                if (stmtAndVarDefinition != null) stmtsAndVarDefinitions.add(stmtAndVarDefinition);
            }
        }
        return new BlockStatementNode(stmtsAndVarDefinitions, Location.ctxGetLoc(ctx));
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
        return new IfStatementNode(condition, thenStmt, elseStmt, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitWhileStmt(MStarTreeParser.WhileStmtContext ctx)
    {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        StatementNode stmt = (StatementNode) visit(ctx.statement());
        return new WhileStatementNode(condition, stmt, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitForStmt(MStarTreeParser.ForStmtContext ctx)
    {
        ExpressionNode init = ctx.init == null ? null : (ExpressionNode) visit(ctx.init);
        ExpressionNode cond = ctx.cond == null ? null : (ExpressionNode) visit(ctx.cond);
        ExpressionNode update = ctx.update == null ? null : (ExpressionNode) visit(ctx.update);
        StatementNode stmt = (StatementNode) visit(ctx.statement());
        return new ForStatementNode(init, cond, update, stmt, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitContinueStmt(MStarTreeParser.ContinueStmtContext ctx)
    {
        return new ContinueStatementNode(Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitBreakStmt(MStarTreeParser.BreakStmtContext ctx)
    {
        return new BreakStatementNode(Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitReturnStmt(MStarTreeParser.ReturnStmtContext ctx)
    {
        ExpressionNode expr = ctx.expression() == null ? null : (ExpressionNode) visit(ctx.expression());
        return new ReturnStatementNode(expr, Location.ctxGetLoc(ctx));
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
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid prefix operator");
        return new PrefixExpressionNode(op, expr, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitArrayExpr(MStarTreeParser.ArrayExprContext ctx)
    {
        ExpressionNode arr = (ExpressionNode) visit(ctx.arr), sub = (ExpressionNode) visit(ctx.sub);
        return new ArrayExpressionNode(arr, sub, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitSuffixExpr(MStarTreeParser.SuffixExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        SuffixExpressionNode.suffixOp op;
        if (ctx.op.getText().equals("++")) op = SuffixExpressionNode.suffixOp.INC;
        else if (ctx.op.getText().equals("--")) op = SuffixExpressionNode.suffixOp.DEC;
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid suffix operator");
        return new SuffixExpressionNode(op, expr, Location.ctxGetLoc(ctx));
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
                throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid binary operator");
        }
        if (lhs instanceof StringExpressionNode || rhs instanceof StringExpressionNode) commonExprOptimize = false;
        if (lhs instanceof PrefixExpressionNode || rhs instanceof PrefixExpressionNode) commonExprOptimize = false;
        if (lhs instanceof SuffixExpressionNode || rhs instanceof SuffixExpressionNode) commonExprOptimize = false;
        if (lhs instanceof AssignExpressionNode || rhs instanceof AssignExpressionNode) commonExprOptimize = false;
        if (lhs instanceof FunctionCallExpressionNode || rhs instanceof FunctionCallExpressionNode) commonExprOptimize = false;
        if (commonExprOptimize && lhs.equals(rhs)) {
            if (op == BinaryExpressionNode.binaryOp.ADD)
                return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL, lhs,
                        new NumExpressionNode(2, Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
            else if (op == BinaryExpressionNode.binaryOp.SUB)
                return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL, lhs,
                        new NumExpressionNode(0, Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
        }
        if (commonExprOptimize && (op == BinaryExpressionNode.binaryOp.ADD || op == BinaryExpressionNode.binaryOp.SUB)) {
            if (lhs instanceof BinaryExpressionNode
                    && ((BinaryExpressionNode) lhs).getOp() == BinaryExpressionNode.binaryOp.MUL) {
                if (((BinaryExpressionNode) lhs).getLhs().equals(rhs)
                        && ((BinaryExpressionNode) lhs).getRhs() instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                lhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getRhs()).value + 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                lhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getRhs()).value - 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                }
                if (((BinaryExpressionNode) lhs).getRhs().equals(rhs) && ((BinaryExpressionNode) lhs).getLhs() instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL, lhs,
                                new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value + 1,
                                        Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                lhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value - 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                }
            }
            if (rhs instanceof BinaryExpressionNode && ((BinaryExpressionNode) rhs).getOp() == BinaryExpressionNode.binaryOp.MUL) {
                if (((BinaryExpressionNode) rhs).getLhs().equals(lhs) && ((BinaryExpressionNode) rhs).getRhs() instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) rhs).getRhs()).value + 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) rhs).getRhs()).value - 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                }
                if (((BinaryExpressionNode) rhs).getRhs().equals(lhs) && ((BinaryExpressionNode) rhs).getLhs() instanceof NumExpressionNode) {
                    if (op == BinaryExpressionNode.binaryOp.ADD)
                        return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value + 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                rhs, new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value - 1,
                                Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                }
            }
            if (lhs instanceof BinaryExpressionNode
                    && rhs instanceof BinaryExpressionNode
                    && ((BinaryExpressionNode) lhs).getOp() == BinaryExpressionNode.binaryOp.MUL
                    && ((BinaryExpressionNode) rhs).getOp() == BinaryExpressionNode.binaryOp.MUL) {
                if (((BinaryExpressionNode) lhs).getLhs() instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).getLhs() instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).getRhs().equals(((BinaryExpressionNode) rhs).getRhs())) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getRhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).getLhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getRhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value
                                            - ((NumExpressionNode) ((BinaryExpressionNode) rhs).getLhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    }
                } else if (((BinaryExpressionNode) lhs).getLhs() instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).getRhs() instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).getRhs().equals(((BinaryExpressionNode) rhs).getLhs())) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getRhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).getRhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getRhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getLhs()).value
                                            - ((NumExpressionNode) ((BinaryExpressionNode) rhs).getRhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    }
                } else if (((BinaryExpressionNode) lhs).getRhs() instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).getLhs() instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).getLhs().equals(((BinaryExpressionNode) rhs).getRhs())) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getLhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getRhs()).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).getLhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getLhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getRhs()).value
                                            - ((NumExpressionNode) ((BinaryExpressionNode) rhs).getLhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    }
                } else if (((BinaryExpressionNode) lhs).getRhs() instanceof NumExpressionNode
                        && ((BinaryExpressionNode) rhs).getRhs() instanceof NumExpressionNode) {
                    if (((BinaryExpressionNode) lhs).getLhs().equals(((BinaryExpressionNode) rhs).getLhs())) {
                        if (op == BinaryExpressionNode.binaryOp.ADD)
                            return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getLhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getRhs()).value
                                            + ((NumExpressionNode) ((BinaryExpressionNode) rhs).getRhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                        else return new BinaryExpressionNode(BinaryExpressionNode.binaryOp.MUL,
                                    ((BinaryExpressionNode) lhs).getLhs(),
                                    new NumExpressionNode(((NumExpressionNode) ((BinaryExpressionNode) lhs).getRhs()).value
                                            - ((NumExpressionNode) ((BinaryExpressionNode) rhs).getRhs()).value,
                                            Location.ctxGetLoc(ctx)), Location.ctxGetLoc(ctx));
                    }
                }
            }
        }
        return new BinaryExpressionNode(op, lhs, rhs, Location.ctxGetLoc(ctx));
    }

    @Override
<<<<<<< HEAD
    public ASTNode visitMemExpr(MStarTreeParser.MemExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        String name = ctx.ID().getText();
        return new MethodExpressionNode(expr, name, Location.ctxGetLoc(ctx));
=======
    public ASTNode visitMemExpr(MStarTreeParser.MemExprContext ctx) {
        MethodExpressionNode node = new MethodExpressionNode(ctx.start.getLine());
        node.exp = (ExpressionNode) visit(ctx.expression());
        node.name = ctx.ID().getText();
        return node;
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
    }

    @Override
    public ASTNode visitFuncCallExpr(MStarTreeParser.FuncCallExprContext ctx)
    {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        List<ExpressionNode> paraList = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (ParserRuleContext parameter : ctx.parameterList().expression()) {
                ExpressionNode para = (ExpressionNode) visit(parameter);
                paraList.add(para);
            }
        }
        return new FunctionCallExpressionNode(expr, paraList, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitAssignExpr(MStarTreeParser.AssignExprContext ctx)
    {
        ExpressionNode lhs = (ExpressionNode) visit(ctx.lhs), rhs = (ExpressionNode) visit(ctx.rhs);
        return new AssignExpressionNode(lhs, rhs, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitIdExpr(MStarTreeParser.IdExprContext ctx)
    {
        String name = ctx.ID().getText();
        return new IdExpressionNode(name, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitThisExpr(MStarTreeParser.ThisExprContext ctx)
    {
        return new ThisExpressionNode(Location.ctxGetLoc(ctx));
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
            throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid number: " + e);
        }
        return new NumExpressionNode(value, Location.ctxGetLoc(ctx));
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
                else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid string");
                ++i;
            }
            else s.append(str.charAt(i));
        }
        return new StringExpressionNode(s.toString(), Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitNullExpr(MStarTreeParser.NullExprContext ctx)
    {
        return new NullExpressionNode(Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitBoolExpr(MStarTreeParser.BoolExprContext ctx)
    {
        boolean value;
        if (ctx.getText().equals("true")) value = true;
        else if (ctx.getText().equals("false")) value = false;
        else throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid bool constant");
        return new BoolExpressionNode(value, Location.ctxGetLoc(ctx));
    }

    @Override
    public ASTNode visitErrorCreator(MStarTreeParser.ErrorCreatorContext ctx)
    {
        throw new CompilerError(Location.ctxGetLoc(ctx), "Invalid creator");
    }

    @Override
    public ASTNode visitArrayCreator(MStarTreeParser.ArrayCreatorContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.basicType());
        List<ExpressionNode> exprList = new ArrayList<>();
        int cnt = 0;
        for (ParserRuleContext ExprList : ctx.expression()) {
            ExpressionNode expr = (ExpressionNode) visit(ExprList);
            exprList.add(expr);
            ++cnt;
        }
        int dimNum = (ctx.getChildCount() - cnt - 1) / 2;
        for (int i = 0; i < dimNum; ++i) type.setType(new ArrayType(type.getType()));
<<<<<<< HEAD
        return new NewExpressionNode(type, exprList, dimNum, Location.ctxGetLoc(ctx));
=======
        node.dimNum = (ctx.getChildCount() - cnt - 1) / 2;
        node.exprList = exprList;
        return node;
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
    }

    @Override
    public ASTNode visitNonArrayCreator(MStarTreeParser.NonArrayCreatorContext ctx)
    {
        TypeNode type = (TypeNode) visit(ctx.nonArrayTypeCreator());
        return new NewExpressionNode(type, null, 0, Location.ctxGetLoc(ctx));
    }
}


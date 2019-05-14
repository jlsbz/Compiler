// Generated from C:/Users/93739/IdeaProjects/MStar/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
package MStarTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MStarTreeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MStarTreeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MStarTreeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#programSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramSection(MStarTreeParser.ProgramSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(MStarTreeParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(MStarTreeParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(MStarTreeParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#memberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDefinition(MStarTreeParser.MemberDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#parameterListDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListDefinition(MStarTreeParser.ParameterListDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#parameterDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDefinition(MStarTreeParser.ParameterDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(MStarTreeParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MStarTreeParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MStarTreeParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonArrayType}
	 * labeled alternative in {@link MStarTreeParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayType(MStarTreeParser.NonArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(MStarTreeParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MStarTreeParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(MStarTreeParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(MStarTreeParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MStarTreeParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MStarTreeParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MStarTreeParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MStarTreeParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MStarTreeParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MStarTreeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link MStarTreeParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MStarTreeParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link MStarTreeParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(MStarTreeParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MStarTreeParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(MStarTreeParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(MStarTreeParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(MStarTreeParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(MStarTreeParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suffixExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixExpr(MStarTreeParser.SuffixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(MStarTreeParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemExpr(MStarTreeParser.MemExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(MStarTreeParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(MStarTreeParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpr(MStarTreeParser.PrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(MStarTreeParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MStarTreeParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsExpr(MStarTreeParser.BracketsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MStarTreeParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#nonArrayTypeCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayTypeCreator(MStarTreeParser.NonArrayTypeCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCreator(MStarTreeParser.ErrorCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreator(MStarTreeParser.ArrayCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonArrayCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayCreator(MStarTreeParser.NonArrayCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MStarTreeParser.ParameterListContext ctx);
}
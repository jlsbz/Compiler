// Generated from C:/Users/93739/IdeaProjects/Mx/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link MStarTreeParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(MStarTreeParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#memberVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberVariable(MStarTreeParser.MemberVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#constructionMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructionMethodDefinition(MStarTreeParser.ConstructionMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(MStarTreeParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(MStarTreeParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(MStarTreeParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(MStarTreeParser.ActualParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MStarTreeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#blockOrStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOrStatement(MStarTreeParser.BlockOrStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definitionStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionStat(MStarTreeParser.DefinitionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStat(MStarTreeParser.ExpressionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(MStarTreeParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(MStarTreeParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(MStarTreeParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(MStarTreeParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(MStarTreeParser.BreakStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStat(MStarTreeParser.ContinueStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStat(MStarTreeParser.EmptyStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#statementDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefinition(MStarTreeParser.StatementDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MStarTreeParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definitionExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionExpr(MStarTreeParser.DefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(MStarTreeParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(MStarTreeParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MStarTreeParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexAccessExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccessExpr(MStarTreeParser.IndexAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpr(MStarTreeParser.MemberAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(MStarTreeParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(MStarTreeParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(MStarTreeParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(MStarTreeParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#expressionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDefinition(MStarTreeParser.ExpressionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(MStarTreeParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVariableType}
	 * labeled alternative in {@link MStarTreeParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableType(MStarTreeParser.ArrayVariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonArrayVariableType}
	 * labeled alternative in {@link MStarTreeParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayVariableType(MStarTreeParser.NonArrayVariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(MStarTreeParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(MStarTreeParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MStarTreeParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MStarTreeParser.ConstantContext ctx);
}
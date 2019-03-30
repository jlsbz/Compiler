// Generated from C:/Users/93739/IdeaProjects/Mx/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
package MStarTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MStarTreeParser}.
 */
public interface MStarTreeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MStarTreeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MStarTreeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(MStarTreeParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(MStarTreeParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void enterMemberVariable(MStarTreeParser.MemberVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void exitMemberVariable(MStarTreeParser.MemberVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#constructionMethodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructionMethodDefinition(MStarTreeParser.ConstructionMethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#constructionMethodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructionMethodDefinition(MStarTreeParser.ConstructionMethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(MStarTreeParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(MStarTreeParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MStarTreeParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MStarTreeParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MStarTreeParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MStarTreeParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(MStarTreeParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(MStarTreeParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MStarTreeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MStarTreeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#blockOrStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockOrStatement(MStarTreeParser.BlockOrStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#blockOrStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockOrStatement(MStarTreeParser.BlockOrStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definitionStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionStat(MStarTreeParser.DefinitionStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definitionStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionStat(MStarTreeParser.DefinitionStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStat(MStarTreeParser.ExpressionStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStat(MStarTreeParser.ExpressionStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MStarTreeParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MStarTreeParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStat(MStarTreeParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStat(MStarTreeParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(MStarTreeParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(MStarTreeParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(MStarTreeParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(MStarTreeParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStat(MStarTreeParser.BreakStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStat(MStarTreeParser.BreakStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStat(MStarTreeParser.ContinueStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStat(MStarTreeParser.ContinueStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStat(MStarTreeParser.EmptyStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStat}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStat(MStarTreeParser.EmptyStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#statementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefinition(MStarTreeParser.StatementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#statementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefinition(MStarTreeParser.StatementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MStarTreeParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MStarTreeParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definitionExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionExpr(MStarTreeParser.DefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definitionExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionExpr(MStarTreeParser.DefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(MStarTreeParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(MStarTreeParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(MStarTreeParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(MStarTreeParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MStarTreeParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MStarTreeParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexAccessExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccessExpr(MStarTreeParser.IndexAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexAccessExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccessExpr(MStarTreeParser.IndexAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(MStarTreeParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(MStarTreeParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(MStarTreeParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(MStarTreeParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(MStarTreeParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(MStarTreeParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(MStarTreeParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(MStarTreeParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(MStarTreeParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(MStarTreeParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#expressionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDefinition(MStarTreeParser.ExpressionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#expressionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDefinition(MStarTreeParser.ExpressionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(MStarTreeParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(MStarTreeParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVariableType}
	 * labeled alternative in {@link MStarTreeParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableType(MStarTreeParser.ArrayVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVariableType}
	 * labeled alternative in {@link MStarTreeParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableType(MStarTreeParser.ArrayVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonArrayVariableType}
	 * labeled alternative in {@link MStarTreeParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterNonArrayVariableType(MStarTreeParser.NonArrayVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonArrayVariableType}
	 * labeled alternative in {@link MStarTreeParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitNonArrayVariableType(MStarTreeParser.NonArrayVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(MStarTreeParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(MStarTreeParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MStarTreeParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MStarTreeParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MStarTreeParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MStarTreeParser.ConstantContext ctx);
}
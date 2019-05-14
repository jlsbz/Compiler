// Generated from C:/Users/93739/IdeaProjects/MStar/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link MStarTreeParser#programSection}.
	 * @param ctx the parse tree
	 */
	void enterProgramSection(MStarTreeParser.ProgramSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#programSection}.
	 * @param ctx the parse tree
	 */
	void exitProgramSection(MStarTreeParser.ProgramSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(MStarTreeParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(MStarTreeParser.FunctionDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link MStarTreeParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(MStarTreeParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(MStarTreeParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#memberDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMemberDefinition(MStarTreeParser.MemberDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#memberDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMemberDefinition(MStarTreeParser.MemberDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#parameterListDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParameterListDefinition(MStarTreeParser.ParameterListDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#parameterListDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParameterListDefinition(MStarTreeParser.ParameterListDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#parameterDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParameterDefinition(MStarTreeParser.ParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#parameterDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParameterDefinition(MStarTreeParser.ParameterDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(MStarTreeParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(MStarTreeParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MStarTreeParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MStarTreeParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MStarTreeParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MStarTreeParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonArrayType}
	 * labeled alternative in {@link MStarTreeParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterNonArrayType(MStarTreeParser.NonArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonArrayType}
	 * labeled alternative in {@link MStarTreeParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitNonArrayType(MStarTreeParser.NonArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(MStarTreeParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(MStarTreeParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(MStarTreeParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(MStarTreeParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(MStarTreeParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(MStarTreeParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(MStarTreeParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(MStarTreeParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MStarTreeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MStarTreeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(MStarTreeParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(MStarTreeParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(MStarTreeParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(MStarTreeParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(MStarTreeParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(MStarTreeParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MStarTreeParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MStarTreeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MStarTreeParser.ReturnStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link MStarTreeParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MStarTreeParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link MStarTreeParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MStarTreeParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link MStarTreeParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(MStarTreeParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link MStarTreeParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(MStarTreeParser.VarDeclStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(MStarTreeParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(MStarTreeParser.StrExprContext ctx);
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
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(MStarTreeParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(MStarTreeParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(MStarTreeParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(MStarTreeParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suffixExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSuffixExpr(MStarTreeParser.SuffixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suffixExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSuffixExpr(MStarTreeParser.SuffixExprContext ctx);
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
	 * Enter a parse tree produced by the {@code memExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemExpr(MStarTreeParser.MemExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemExpr(MStarTreeParser.MemExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(MStarTreeParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(MStarTreeParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(MStarTreeParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(MStarTreeParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(MStarTreeParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(MStarTreeParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(MStarTreeParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(MStarTreeParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MStarTreeParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MStarTreeParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketsExpr(MStarTreeParser.BracketsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketsExpr(MStarTreeParser.BracketsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MStarTreeParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MStarTreeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MStarTreeParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#nonArrayTypeCreator}.
	 * @param ctx the parse tree
	 */
	void enterNonArrayTypeCreator(MStarTreeParser.NonArrayTypeCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#nonArrayTypeCreator}.
	 * @param ctx the parse tree
	 */
	void exitNonArrayTypeCreator(MStarTreeParser.NonArrayTypeCreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterErrorCreator(MStarTreeParser.ErrorCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitErrorCreator(MStarTreeParser.ErrorCreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreator(MStarTreeParser.ArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreator(MStarTreeParser.ArrayCreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonArrayCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterNonArrayCreator(MStarTreeParser.NonArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonArrayCreator}
	 * labeled alternative in {@link MStarTreeParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitNonArrayCreator(MStarTreeParser.NonArrayCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MStarTreeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MStarTreeParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MStarTreeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MStarTreeParser.ParameterListContext ctx);
}
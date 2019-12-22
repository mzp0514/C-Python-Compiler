// Generated from C.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructSpecifier(CParser.StructSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructSpecifier(CParser.StructSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(CParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(CParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableidentifier}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableidentifier(CParser.VariableidentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableidentifier}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableidentifier(CParser.VariableidentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayidentifier}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayidentifier(CParser.ArrayidentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayidentifier}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayidentifier(CParser.ArrayidentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionidentifier}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionidentifier(CParser.FunctionidentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionidentifier}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionidentifier(CParser.FunctionidentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileiteration}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileiteration(CParser.WhileiterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileiteration}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileiteration(CParser.WhileiterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foriteration}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForiteration(CParser.ForiterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foriteration}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForiteration(CParser.ForiterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continuejump}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinuejump(CParser.ContinuejumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continuejump}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinuejump(CParser.ContinuejumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakjump}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakjump(CParser.BreakjumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakjump}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakjump(CParser.BreakjumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnjump}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnjump(CParser.ReturnjumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnjump}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnjump(CParser.ReturnjumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(CParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(CParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CParser.InitializerListContext ctx);
}
# Generated from C.g4 by ANTLR 4.7.2
from CVisitor import *
if __name__ is not None and "." in __name__:
    from .CParser import CParser
else:
    from CParser import CParser

# This class defines a complete generic visitor for a parse tree produced by CParser.

class MyVisitor(CVisitor):

    def __init__(self):
        super(MyVisitor, self).__init__()
        self.scope = 0


    # Visit a parse tree produced by CParser#compilationUnit.
    def visitCompilationUnit(self, ctx:CParser.CompilationUnitContext):
        ans = []
        total = ctx.getChildCount()
        for index in range(total):
            ans.append(self.visit(ctx.getChild(index)))
        ans = [ e for e in ans if e is not None]
        return '\n'.join(ans)


    # Visit a parse tree produced by CParser#functionDefinition.
    def visitFunctionDefinition(self, ctx:CParser.FunctionDefinitionContext):
        ans = "def"
        ans += ' ' + self.visit(ctx.declarator()) + ":\n"
        ans += self.visit(ctx.compoundStatement())
        return ans


    # Visit a parse tree produced by CParser#typeSpecifier.
    def visitTypeSpecifier(self, ctx:CParser.TypeSpecifierContext):
        if ctx.structSpecifier():
            return self.visit(ctx.structSpecifier())
        else:
            return ctx.getText()


    # Visit a parse tree produced by CParser#structSpecifier.
    def visitStructSpecifier(self, ctx:CParser.StructSpecifierContext):
        if ctx.structDeclaration():
            ans = "class " + ctx.children[1].getText() + ":\n"
            for i in ctx.structDeclaration():
                ans += "    " + self.visit(i) + "\n"
            return ans
        else:
            return ctx.getText()


    # Visit a parse tree produced by CParser#structDeclaration.
    def visitStructDeclaration(self, ctx:CParser.StructDeclarationContext):
        type_ = self.visit(ctx.typeSpecifier())
        if ctx.structDeclarator():
            ans = []
            for i in ctx.structDeclarator():
                decl = self.visit(i)
                if 'length' in decl.keys():
                    if type_ == "int":
                        ans.append([decl["name"], "[0] * " + decl["length"]])
                    elif type_ == "char":
                        ans.append([decl["name"], "[\'\'] * " + decl["length"]])
                    elif type_[0:6] == "struct":
                        ans.append([decl["name"], "[" + type_[6:] + "() for i in range(" + decl["length"] + ")]"])
                    else:
                        ans.append([decl["name"], "[None] * " + decl["length"]])
                else:
                    if type_ == "int":
                        ans.append([decl["name"], "0"])
                    elif type_ == "char":
                        ans.append([decl["name"], "[\'\']"])
                    elif type_[0:6] == "struct":
                        ans.append([decl["name"], type_[6:] + "()"])
                    else:
                        ans.append([decl["name"], "None"])
            names, vals = [e[0] for e in ans], [e[1] for e in ans]
            return ', '.join(names) + " = " + ', '.join(vals)
 


    # Visit a parse tree produced by CParser#structDeclarator.
    def visitStructDeclarator(self, ctx:CParser.StructDeclaratorContext):
        return self.visit(ctx.declarator())


    # Visit a parse tree produced by CParser#variableidentifier.
    def visitVariableidentifier(self, ctx:CParser.VariableidentifierContext):
        return { "name": ctx.Identifier().getText() }


    # Visit a parse tree produced by CParser#arrayidentifier.
    def visitArrayidentifier(self, ctx:CParser.ArrayidentifierContext):
        name = ctx.Identifier().getText()
        if ctx.assignmentExpression():
            length = self.visit(ctx.assignmentExpression())
            return { "name": name, "length": length}
        return {"name": name}


    # Visit a parse tree produced by CParser#functionidentifier.
    def visitFunctionidentifier(self, ctx:CParser.FunctionidentifierContext):
        ans = ctx.Identifier().getText()
        ans += "("
        if ctx.parameterTypeList():
            ans += self.visit(ctx.parameterTypeList())
        ans += ")"
        return ans 


    # Visit a parse tree produced by CParser#statement.
    def visitStatement(self, ctx:CParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#compoundStatement.
    def visitCompoundStatement(self, ctx:CParser.CompoundStatementContext):
        self.scope += 1
        ans = [ self.visit(e) for e in ctx.children[1 : -1]]
        ans = ('    ' * self.scope) + ('\n' + '    ' * self.scope).join(ans)
        self.scope -= 1
        return ans


    # Visit a parse tree produced by CParser#expressionStatement.
    def visitExpressionStatement(self, ctx:CParser.ExpressionStatementContext):
        return ", ".join(self.visit(ctx.expression()))


    # Visit a parse tree produced by CParser#selectionStatement.
    def visitSelectionStatement(self, ctx:CParser.SelectionStatementContext):
        # 纯if语句
        if len(ctx.children) <= 5:
            ifExpression = self.visit(ctx.expression())[0]
            statement = self.visit(ctx.children[4])
            ans = "if " + ifExpression + ":\n"
            if statement.strip() == "":
                ans += (self.scope + 1) * "    " + "pass"
            else:
                ans += statement
        # if-elif-else语句
        else:
            # 先解析最开始的if
            ifExpression = self.visit(ctx.expression())[0]
            statement = self.visit(ctx.children[4])
            ans = "if " + ifExpression + ":\n"
            if statement.strip() == "":
                ans += (self.scope + 1) * "    " + "pass"
            else:
                ans += statement
            nextStatement = ctx.children[6]
            # elif
            flag = 0
            while nextStatement.selectionStatement():
                ifExpression = self.visit(nextStatement.selectionStatement().children[2])[0]
                statement = self.visit(nextStatement.selectionStatement().children[4])
                ans += "\n" + self.scope * "    " + "elif " + ifExpression + ":\n"
                if statement.strip() == "":
                    ans += (self.scope + 1) * "    " + "pass"
                else:
                    ans += statement
                if len(nextStatement.selectionStatement().children) == 5:
                    flag = 1
                    break
                else:
                    nextStatement = nextStatement.selectionStatement().children[6]
            # else
            if flag == 0:
                statement = self.visit(nextStatement)
                ans += "\n" + self.scope * "    " + "else:\n"
                if statement.strip() == "":
                    ans += (self.scope + 1) * "    " + "pass"
                else:
                    ans += statement
        return ans

    # Visit a parse tree produced by CParser#whileiteration.
    def visitWhileiteration(self, ctx:CParser.WhileiterationContext):
        
        whileExpression = self.visit(ctx.expression())[0]
        statement = self.visit(ctx.statement())
        ans = "while " + whileExpression + ":\n"
        if statement.strip() == "":
            ans += (self.scope + 1) * "    " + "pass"
        else:
            ans += statement
        return ans


    # Visit a parse tree produced by CParser#foriteration.
    def visitForiteration(self, ctx:CParser.ForiterationContext):
        forDeclaration = self.visit(ctx.forDeclaration())
        i_name = forDeclaration["name"]
        start = forDeclaration["value"]
        forExpression_0 = self.visit(ctx.forExpression(0))
        if forExpression_0.find(">=") != -1:
            end = forExpression_0.split(">=")[-1] + " - 1"
        elif forExpression_0.find("<=") != -1:
            end = forExpression_0.split("<=")[-1] + " + 1"
        elif forExpression_0.find(">") != -1:
            end = forExpression_0.split(">")[-1]
        elif forExpression_0.find("<") != -1:
            end = forExpression_0.split("<")[-1]
        forExpression_1 = self.visit(ctx.forExpression(1))
        if forExpression_1.find("+=") != -1:
            step = forExpression_1.split("+=")[-1]
        elif forExpression_1.find("-=") != -1:
            step = "-" + forExpression_1.split("-=")[-1]
        elif forExpression_1.find("+") != -1:
            step = forExpression_1.split("+")[-1]
        elif forExpression_1.find("-") != -1:
            step = "-" + forExpression_1.split("-")[-1]

        statement = self.visit(ctx.statement())
        ans = "for " + i_name + " in range(" + start + ", " + end + ", " + step + "):\n"
        if statement.strip() == "":
            ans += (self.scope + 1) * "    " + "pass"
        else:
            ans += statement
        return ans


    # Visit a parse tree produced by CParser#continuejump.
    def visitContinuejump(self, ctx:CParser.ContinuejumpContext):
        return "continue"


    # Visit a parse tree produced by CParser#breakjump.
    def visitBreakjump(self, ctx:CParser.BreakjumpContext):
        return "break"


    # Visit a parse tree produced by CParser#returnjump.
    def visitReturnjump(self, ctx:CParser.ReturnjumpContext):
        if ctx.expression():
            return "return " + ", ".join(self.visit(ctx.expression()))
        return "return"


    # Visit a parse tree produced by CParser#forDeclaration.
    def visitForDeclaration(self, ctx:CParser.ForDeclarationContext):
        return self.visit(ctx.initDeclarator())


    # Visit a parse tree produced by CParser#forExpression.
    def visitForExpression(self, ctx:CParser.ForExpressionContext):
        return self.visit(ctx.assignmentExpression())


    # Visit a parse tree produced by CParser#blockItem.
    def visitBlockItem(self, ctx:CParser.BlockItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#declaration.
    def visitDeclaration(self, ctx:CParser.DeclarationContext):
        type_ = self.visit(ctx.typeSpecifier())
        if ctx.initDeclaratorList():
            decls = self.visit(ctx.initDeclaratorList())
            ans = []
            for decl in decls: 
                if 'length' in decl.keys():
                    if type_ == "int":
                        ans.append([decl["name"], "[0] * " + decl["length"]])
                    elif type_ == "char":
                        ans.append([decl["name"], "[\'\'] * " + decl["length"]])                      
                    elif type_[0:6] == "struct":
                        ans.append([decl["name"], "[" + type_[6:] + "() for i in range(" + decl["length"] + ")]"])
                    else:
                        ans.append([decl["name"], "[None] * " + decl["length"]])
                elif 'value' in decl.keys():
                    ans.append([decl["name"], decl["value"]])
                else:
                    if type_ == "int":
                        ans.append([decl["name"], "0"])
                    elif type_ == "char":
                        ans.append([decl["name"], "[\'\']"])
                    elif type_[0:6] == "struct":
                        ans.append([decl["name"], type_[6:] + "()"])
                    else:
                        ans.append([decl["name"], "None"])
            names, vals = [e[0] for e in ans], [e[1] for e in ans]
            return ', '.join(names) + " = " + ', '.join(vals)
        else:
            return type_


    # Visit a parse tree produced by CParser#initDeclaratorList.
    def visitInitDeclaratorList(self, ctx:CParser.InitDeclaratorListContext):
        return [self.visit(i) for i in ctx.initDeclarator()]


    # Visit a parse tree produced by CParser#initDeclarator.
    def visitInitDeclarator(self, ctx:CParser.InitDeclaratorContext):
        if ctx.initializer():
            return {
                "name": self.visit(ctx.declarator())["name"],
                "value": self.visit(ctx.initializer())
            }
        return self.visit(ctx.declarator())


    # Visit a parse tree produced by CParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:CParser.PrimaryExpressionContext):
        if ctx.expression():
            return "(" + self.visit(ctx.expression())[0] + ")"
        return ctx.getText()


    # Visit a parse tree produced by CParser#postfixExpression.
    def visitPostfixExpression(self, ctx:CParser.PostfixExpressionContext):
        if ctx.primaryExpression():
            return self.visit(ctx.primaryExpression())
        if ctx.children[1].getText() == '[':
            return self.visit(ctx.postfixExpression()) + '[' + ", ".join(self.visit(ctx.expression())) + ']'
        elif ctx.children[1].getText() == '(':
            func = ctx.postfixExpression().getText()
            if ctx.expression():
                args = self.visit(ctx.expression())
                if func == "strlen":
                    return "len(" + args[0] + ")"
                elif func == "printf":
                    args[0] = args[0][:-1].rstrip('\\n') + "\""
                    if len(args) == 1:
                        return "print(" + args[0]  + ")"
                    elif len(args) == 2:
                        return "print(%s %% %s)" % (args[0], args[1])
                    else:
                        return "print(%s %% (%s))" % (args[0], ", ".join(args[1:]))
                elif func == "gets":
                    return args[0] + " = input()"
                return func + "(" + ", ".join(args) + ")"
            else:
                return func + "()"
        elif ctx.children[1].getText() == '.':
            return self.visit(ctx.postfixExpression()) + '.' + ctx.children[2].getText()
            # struct
        elif ctx.children[1].getText() == '++':
            return self.visit(ctx.postfixExpression()) + " += 1"
        elif ctx.children[1].getText() == '--':
            return self.visit(ctx.postfixExpression()) + " -= 1"


    # Visit a parse tree produced by CParser#unaryExpression.
    def visitUnaryExpression(self, ctx:CParser.UnaryExpressionContext):
        if len(ctx.children) > 1:
            if ctx.postfixExpression():
                res = self.visit(ctx.postfixExpression())
                if ctx.children[0].getText() == "++":
                    return res + " = " + res + " + 1"
                elif ctx.children[0].getText() == "--":
                    return res + " = " + res + " - 1"
            else:
                return self.visit(ctx.unaryOperator()) + self.visit(ctx.castExpression())
        else:
            return self.visit(ctx.postfixExpression())

    
    # Visit a parse tree produced by CParser#unaryOperator.
    def visitUnaryOperator(self, ctx:CParser.UnaryOperatorContext):
        return ctx.getText()


    # Visit a parse tree produced by CParser#castExpression.
    def visitCastExpression(self, ctx:CParser.CastExpressionContext):
        if ctx.unaryExpression():
            return self.visit(ctx.unaryExpression())
        return ctx.getText()


    # Visit a parse tree produced by CParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:CParser.MultiplicativeExpressionContext):
        if ctx.multiplicativeExpression() is None:
            return self.visit(ctx.castExpression())
        return self.visit(ctx.multiplicativeExpression()) + ctx.children[1].getText() + self.visit(ctx.castExpression())


    # Visit a parse tree produced by CParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:CParser.AdditiveExpressionContext):
        if ctx.additiveExpression() is None:
            return self.visit(ctx.multiplicativeExpression())
        return self.visit(ctx.additiveExpression()) + ctx.children[1].getText() + self.visit(ctx.multiplicativeExpression())


    # Visit a parse tree produced by CParser#relationalExpression.
    def visitRelationalExpression(self, ctx:CParser.RelationalExpressionContext):
        if ctx.relationalExpression() is None:
            return self.visit(ctx.additiveExpression())
        return self.visit(ctx.relationalExpression()) + ' ' + ctx.children[1].getText() + ' ' + self.visit(ctx.additiveExpression())


    # Visit a parse tree produced by CParser#equalityExpression.
    def visitEqualityExpression(self, ctx:CParser.EqualityExpressionContext):
        if ctx.equalityExpression() is None:
            return self.visit(ctx.relationalExpression())
        return self.visit(ctx.equalityExpression()) + ' ' + ctx.children[1].getText() + ' ' + self.visit(ctx.relationalExpression())


    # Visit a parse tree produced by CParser#logicalAndExpression.
    def visitLogicalAndExpression(self, ctx:CParser.LogicalAndExpressionContext):
        if ctx.logicalAndExpression():
            return self.visit(ctx.logicalAndExpression()) + ' and ' + self.visit(ctx.equalityExpression())
        else:
            return self.visit(ctx.equalityExpression())


    # Visit a parse tree produced by CParser#logicalOrExpression.
    def visitLogicalOrExpression(self, ctx:CParser.LogicalOrExpressionContext):
        if ctx.logicalAndExpression():
            return self.visit(ctx.logicalAndExpression())
        else:
            return self.visit(ctx.logicalOrExpression()) + ' or ' + self.visit(ctx.equalityExpression())


    # Visit a parse tree produced by CParser#conditionalExpression.
    def visitConditionalExpression(self, ctx:CParser.ConditionalExpressionContext):
        return self.visit(ctx.logicalOrExpression())


    # Visit a parse tree produced by CParser#assignmentExpression.
    def visitAssignmentExpression(self, ctx:CParser.AssignmentExpressionContext):
        if ctx.conditionalExpression():
            ans = self.visit(ctx.conditionalExpression())
        else:
            ans = self.visit(ctx.unaryExpression()) + ' = ' + self.visit(ctx.assignmentExpression())
        return ans


    # Visit a parse tree produced by CParser#expression.
    def visitExpression(self, ctx:CParser.ExpressionContext):
        return [self.visit(x) for x in ctx.assignmentExpression()]


    # Visit a parse tree produced by CParser#parameterTypeList.
    def visitParameterTypeList(self, ctx:CParser.ParameterTypeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#parameterList.
    def visitParameterList(self, ctx:CParser.ParameterListContext):
        return ', '.join([self.visit(x) for x in ctx.parameterDeclaration()])


    # Visit a parse tree produced by CParser#parameterDeclaration.
    def visitParameterDeclaration(self, ctx:CParser.ParameterDeclarationContext):
        return self.visit(ctx.declarator())["name"]


    # Visit a parse tree produced by CParser#initializer.
    def visitInitializer(self, ctx:CParser.InitializerContext):
        if ctx.assignmentExpression():
            return self.visit(ctx.assignmentExpression())
        else:
            return "[" + self.visit(ctx.initializerList()) + "]"


    # Visit a parse tree produced by CParser#initializerList.
    def visitInitializerList(self, ctx:CParser.InitializerListContext):
        return ", ".join([ self.visit(e) for e in ctx.initializer()])



del CParser
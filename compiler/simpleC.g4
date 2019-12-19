grammar simpleC;

//整体解析
prog : (IncludeDirective)* (initialBlock|arrayInitBlock|structInitBlock|structDeclaration|functionDefinition)*;




//代码块
statement 
    :   (block | functionCall)*
    ;

//语句块
block 
    :   initialBlock 
    |   arrayInitBlock 
    |   structInitBlock 
    |   assignBlock 
    |   ifBlocks 
    |   whileBlock 
    |   forBlock 
    |   returnBlock
    ;

//初始化语句
initialBlock 
    :   (typeSpecifier) Identifier ('=' expression)? (',' Identifier ('=' expression)?)* ';'
    ;
arrayInitBlock 
    :   typeSpecifier Identifier '[' INT ']' ';'
    ; 
structInitBlock 
    :   structOrUnionSpecifier (Identifier|arrayIdentifier) ';'
    ;

//赋值语句
assignBlock 
    :   ((arrayItem|Identifier|structMember) '=')+  expression ';'
    ;

//if 语句
//ifBlocks 
//  :   'if' '(' expression ')' '{' statement '}' ('else' '{' statement '}')?
//  ;
ifBlocks 
    :   ifBlock (elifBlock)* (elseBlock)?
    ;
ifBlock 
    :   'if' '('expression')' '{' statement '}'
    ;
elifBlock 
    :   'else' 'if' '(' expression ')' '{' statement '}'
    ;
elseBlock 
    :   'else' '{' statement '}'
    ;

//while 语句
whileBlock 
    :   'while' '(' expression ')' '{' statement '}'
    ;

//for 语句
forBlock 
    :   'for' '(' forDeclaration  ';' expression ';' forExpression ')' ('{' statement '}'|';')
    ;
forDeclaration 
    :   Identifier '=' expression (',' forDeclaration)?
    |
    ;
forExpression 
    :   Identifier '=' expression (',' forExpression)?
    |
    ;

//return 语句
returnBlock 
    :   'return' (INT|Identifier)? ';'
    ;




//运算符
BinaryLogicOperator 
    :   '&&' | '||'
    ;

Operator 
    :   '!' | '+' | '-' | '*' | '/' | '==' | '!=' | '<' | '<=' | '>' | '>='
    ;

//表达式
expression
    : '(' expression ')'               #parens
    | op='!' expression                   #Neg
    | expression op=('*' | '/' | '%') expression   #MulDiv 
    | expression op=('+' | '-') expression   #AddSub
    | expression op=('==' | '!=' | '<' | '<=' | '>' | '>=') expression #Judge
    | expression '&&' expression             # AND
    | expression '||' expression             # OR
    | arrayItem                  #arrayitem
    | structMember               #structmember
    | (op='-')? INT             #int                          
    | (op='-')? DOUBLE          #double
    | CHAR                       #char
    | StringLiteral                    #string             
    | Identifier                         #identifier   
    | functionCall                       #function                                     
    ;




//函数
//函数定义
functionDefinition 
    :   (typeSpecifier|structOrUnionSpecifier) Identifier '(' functionParam ')' '{' functionBody '}'
    ;

//函数参数
functionParams 
    :   functionParam (','functionParam)* |
    ;
functionParam 
    :   typeSpecifier Identifier
    ;

//函数体
functionBody 
    :   statement returnBlock
    ;

//函数调用
functionCall 
    :   (strlenFunction | atoiFunction | printfFunction | scanfFunction | getsFunction | customizedFunction) ';'
    ;

//strlen
strlenFunction 
    :   'strlen' '(' Identifier ')'
    ;
//atoi
atoiFunction 
    :   'atoi' '(' Identifier ')' 
    ;
//printf
printfFunction 
    :   'printf' '(' (StringLiteral | Identifier) (',' expression)* ')'
    ;
//scanf
scanfFunction 
    :   'scanf' '(' StringLiteral (',' ('&')? (Identifier|arrayItem|structMember))* ')'
    ;
//gets
getsFunction 
    :   'gets' '(' Identifier ')'
    ;

//Selfdefined
customizedFunction 
    :   Identifier '('((constant|Identifier)(','(constant|Identifier))*)? ')'
    ;




//常量
//常量定义
constant 
    :   INT 
    |   DOUBLE 
    |   CHAR 
    |   StringLiteral
    ;

//整数常量
INT 
    :   [0-9]+
    ;

//实数常量
DOUBLE 
    :   [0-9]+ '.' [0-9]+
    ;

//字符常量
CHAR 
    : '\'' . '\''
    ;

//字符串常量
StringLiteral 
    :   EncodingPrefix? '"' SCharSequence '"'
    ;
fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;
fragment
SCharSequence
    :   .*?
    ;    




//变量
//类型标识符
typeSpecifier 
    :   ('void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'signed'
    |   'unsigned'
    |   'string')
    ;

//名称标识符
Identifier 
    :   [a-zA-Z_][0-9A-Za-z_]*
    ;

//结构体
//结构体定义
structDeclaration 
    :   structOrUnionSpecifier '{' (structParam)+ '}'';'
    ;

//结构体说明符
structOrUnionSpecifier
    :   structOrUnion Identifier
    ;

//结构体类型标识符
structOrUnion
    :   'struct'
    |   'union'
    ;    

//结构体中参数
structParam 
    :   (typeSpecifier|structOrUnionSpecifier) (Identifier|arrayIdentifier) (',' (Identifier|arrayIdentifier))* ';'
    ;

//结构体成员调用
structMember
    :   (Identifier | arrayItem) '.' (Identifier | arrayItem)
    ;

//数组
//数组标识符
arrayIdentifier 
    :   Identifier '[' INT ']'
    ; 

//数组成员调用
arrayItem 
    :   Identifier '[' expression ']'
    ;




//忽略
//include语句、注释、空格与换行
IncludeDirective
    :   '#' Whitespace? 'include' Whitespace? (('"' ~[\r\n]* '"') | ('<' ~[\r\n]* '>' ))  Whitespace? Newline
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'  
        -> skip
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
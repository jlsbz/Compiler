grammar MStarTree;

// --------------------- parser ---------------------------

program
    : (classDefinition | methodDefinition | statementDefinition)*
    ;

classDefinition
    : CLASS Identifier LBRACE (memberVariable | constructionMethodDefinition | methodDefinition)* RBRACE
    ;

memberVariable
    : variableType Identifier SEMI
    ;

constructionMethodDefinition
    : Identifier LPAREN formalParameterList? RPAREN block
    ;

methodDefinition
    : variableType Identifier
        '(' formalParameterList? ')' block
    ;

formalParameterList
    : formalParameter ( COMMA formalParameter )*
    ;

formalParameter
    : variableType Identifier ( ASSIGN expression )?
    ;

actualParameterList
    : expression ( COMMA expression )*
    ;

block
    : LBRACE blockOrStatement* RBRACE
    ;

blockOrStatement
    : block
    | statement
    ;

statement
    : statementDefinition # definitionStat
    | expression SEMI # expressionStat
    | IF LPAREN expression RPAREN blockOrStatement ( ELSE blockOrStatement )? # ifStat
    | FOR LPAREN init=expression? SEMI condition=expression? SEMI after_block=expression? RPAREN blockOrStatement # forStat
    | WHILE LPAREN expression RPAREN blockOrStatement # whileStat
    | RETURN expression? SEMI # returnStat
    | BREAK SEMI # breakStat
    | CONTINUE SEMI # continueStat
    | SEMI # emptyStat
    ;

statementDefinition
    : expressionDefinition SEMI
    ;

expression
    : caller=expression LPAREN actualParameterList? RPAREN # methodCallExpr
    | caller=expression op= DOT member=expression # memberAccessExpr
    | caller=expression LBRACK index=expression RBRACK # indexAccessExpr
    | expression postfix=( SELFINC | SELFDEC ) # unaryExpr
    | prefix=( SELFINC | SELFDEC ) expression # unaryExpr
    | prefix=( ADD | SUB ) expression # unaryExpr
    | prefix=( NEG | NOT ) expression # unaryExpr
    | NEW creator # newExpr
    | lhs=expression op=( MUL | DIV | MOD ) rhs=expression # binaryExpr
    | lhs=expression op=( ADD | SUB ) rhs=expression # binaryExpr
    | lhs=expression op=( LSHIFT | RSHIFT ) rhs=expression # binaryExpr
    | lhs=expression op=( LT | GT | LE | GE) rhs=expression # binaryExpr
    | lhs=expression op=( EQ | NEQ ) rhs=expression # binaryExpr
    | lhs=expression op= AND rhs=expression # binaryExpr
    | lhs=expression op= XOR rhs=expression # binaryExpr
    | lhs=expression op= OR rhs=expression # binaryExpr
    | lhs=expression op= LOGAND rhs=expression # binaryExpr
    | lhs=expression op= LOGOR rhs=expression # binaryExpr
    | expressionDefinition # definitionExpr
    | lhs=expression op= ASSIGN rhs=expression # binaryExpr
    | Identifier # identifierExpr
    | constant # constantExpr
    | THIS # thisExpr
    | LPAREN expression RPAREN # parensExpr
    ;

expressionDefinition
    : variableType Identifier ( ASSIGN expression )?
    ;

creator
    : variableType ( LPAREN actualParameterList? RPAREN )?
    ;

variableType
    : ( Identifier | primitiveType ) arrayCreatorRest # arrayVariableType
    | ( Identifier | primitiveType ) # nonArrayVariableType
    ;

arrayCreatorRest
    : ( LBRACK expression RBRACK )+ ( LBRACK RBRACK )*
    | ( LBRACK RBRACK )+
    ;

primitiveType
    : BOOL | INT | VOID //|STRING
    ;

    BOOL : 'bool';
    INT : 'int';
    VOID : 'void';

constant
    : LogicConstant
    | IntegerConstant
    | StringConstant
    | NullConstant
    ;



// ------------------ Keywords & Symbol ----------------------

IF       : 'if';
ELSE     : 'else';
FOR      : 'for';
WHILE    : 'while';
BREAK    : 'break';
CONTINUE : 'continue';
RETURN   : 'return';
CLASS    : 'class';
NEW      : 'new';
THIS     : 'this';


LPAREN :'(';
RPAREN :')';
LBRACK :'[';
RBRACK :']';
LBRACE :'{';
RBRACE :'}';
SEMI   :';';
COMMA  :',';
COLON  :':';
DOT    :'.';
ASSIGN :'=';
SELFINC:'++';
SELFDEC:'--';
ADD    :'+';
SUB    :'-';
MUL    :'*';
DIV    :'/';
MOD    :'%';
NEG    :'!';
NOT    :'~';
LSHIFT :'<<';
RSHIFT :'>>';
LT     :'<';
GT     :'>';
LE     :'<=';
GE     :'>=';
EQ     :'==';
NEQ    :'!=';
AND    :'&';
OR     :'|';
XOR    :'^';
LOGAND :'&&';
LOGOR  :'||';


//----------------------- constant -------------------

LogicConstant
    : 'true' | 'false'
    ;

IntegerConstant
    : DecimalConstant
    ;



StringConstant
    : '"' (~["\\\r\n] | EscapeSequence)* '"'
    ;

NullConstant
    : 'null'
    ;

Identifier
    : [a-zA-Z] [0-9a-zA-Z_]*
    ;


fragment
DecimalConstant
    : [1-9] [0-9]*
    | '0'
    ;

fragment
EscapeSequence
    : '\\' ['"?abfnrtv\\]
    ;





WhiteSpace
    : [ \t]+ -> skip
    ;

NewLine
    : [\n\r]+ -> skip
    ;

LineComment
    : '//' ~[\r\n]* -> skip
    ;

BlockComment
    : '/*' .*? '*/' -> skip
    ;

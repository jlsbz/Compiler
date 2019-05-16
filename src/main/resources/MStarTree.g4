grammar MStarTree;

program
    : (classDefinition | variableDefinition | functionDefinition)*
    ;


functionDefinition : functionType? ID LPAREN parameterListDefinition? RPAREN block
             ;

classDefinition : CLASS ID LBRACE memberDefinition* RBRACE
          ;

variableDefinition : typeType ID ( ASSIGN expression)? SEMI
             ;

memberDefinition : functionDefinition | variableDefinition
           ;

parameterListDefinition : parameterDefinition (COMMA parameterDefinition)*
                  ;

parameterDefinition : typeType ID
              ;

functionType : typeType
             | VOID
             ;

typeType : typeType LBRACK RBRACK #arrayType
         | basicType        #nonArrayType
         ;

basicType : INT
          | BOOL
          | STRING
          | ID
          // STRING
          ;

statement : block                                                                                       #blockStmt
          | expression? SEMI                                                                            #expressionStmt
          | IF LPAREN expression RPAREN thenStmt=statement (ELSE elseStmt=statement)?                   #ifElseStmt
          | WHILE LPAREN expression RPAREN statement                                                    #whileStmt
          | FOR LPAREN init=expression? SEMI cond=expression? SEMI update=expression? RPAREN statement  #forStmt
          | CONTINUE SEMI                                                                               #continueStmt
          | BREAK SEMI                                                                                  #breakStmt
          | RETURN expression? SEMI                                                                     #returnStmt
          ;

block : LBRACE blockStatement* RBRACE
      ;

blockStatement : statement    #stmt
               | variableDefinition #varDeclStmt
               ;

expression : expression op=(SELFINC | SELFDEC)                          #suffixExpr
           | expression DOT ID                                          #memExpr
           | arr=expression LBRACK sub=expression RBRACK                #arrayExpr
           | expression LPAREN parameterList? RPAREN                    #funcCallExpr
           | <assoc=right> op=(SELFINC | SELFDEC) expression            #prefixExpr
           | <assoc=right> op=(ADD | SUB) expression                    #prefixExpr
           | <assoc=right> op=(NEG | NOT) expression                    #prefixExpr
           | <assoc=right> NEW creator                                  #newExpr
           | lhs=expression op=(MUL | DIV | MOD) rhs=expression         #binaryExpr
           | lhs=expression op=(ADD | SUB) rhs=expression               #binaryExpr
           | lhs=expression op=(LSHIFT| RSHIFT) rhs=expression          #binaryExpr
           | lhs=expression op=(LT | GT) rhs=expression                 #binaryExpr
           | lhs=expression op=(LE | GE) rhs=expression                 #binaryExpr
           | lhs=expression op=(EQ | NEQ) rhs=expression                #binaryExpr
           | lhs=expression op=AND rhs=expression                       #binaryExpr
           | lhs=expression op=OR rhs=expression                        #binaryExpr
           | lhs=expression op=XOR rhs=expression                       #binaryExpr
           | <assoc=right> lhs=expression op=LOGAND rhs=expression      #binaryExpr
           | <assoc=right> lhs=expression op=LOGOR rhs=expression       #binaryExpr
           | <assoc=right> lhs=expression op=ASSIGN rhs=expression      #assignExpr
           | ID                                                         #idExpr
           | THIS                                                       #thisExpr
           | NUMBER                                                     #numExpr
           | STR                                                        #strExpr
           | NullLiteral                                                #nullExpr
           | BoolConstant                                               #boolExpr
           | LPAREN expression RPAREN                                   #bracketsExpr
           ;

nonArrayTypeCreator : INT
                    | BOOL
                    | STRING
                    | ID (LPAREN RPAREN)?
                    ;

creator : basicType (LBRACK expression RBRACK)+ (LBRACK RBRACK)+ (LBRACK expression RBRACK)+    #errorCreator
        | basicType (LBRACK expression RBRACK)+ (LBRACK RBRACK)*                                #arrayCreator
        | nonArrayTypeCreator                                                                   #nonArrayCreator
        ;

parameterList : expression (COMMA expression)*
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

VOID : 'void';
BOOL : 'bool';
INT : 'int';
STRING : 'string';
fragment NULL : 'null';
fragment TRUE : 'true';
fragment FALSE : 'false';

//----------------------- constant -------------------
NUMBER : [1-9] [0-9]*
       | '0'
       ;

ESC : '\\"'
    | '\\\\'
    ;

STR : '"' (ESC | .)*? '"';

BoolConstant : TRUE
             | FALSE
             ;

NullLiteral : NULL;

ID : [a-zA-Z] [0-9a-zA-Z_]*;

COMMENT : LINECOMMENT
        | BLOCKCOMMENT;

LINECOMMENT: '//' ~[\r\n]* -> skip
    ;

BLOCKCOMMENT
    : '/*' .*? '*/' -> skip
    ;

WS : [ \n\t\r]+ -> skip;
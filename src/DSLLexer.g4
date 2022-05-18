lexer grammar  DSLLexer;



//EYAD

CONTROLLER_DEF:'Controller';
CONTROLLER_METHOD:'controls';

OPEN_CURLY_BRACKT_ID:'{';
CLOSE_CURLY_BRACKT_ID:'}';

SUM_OP_ID:'+';
MINUS_OP_ID:'-';
MULT_OP_ID:'*';
DIV_OP_ID:'/';
MOD_OP_ID:'%';
END_STATMENT_ID:';';

// KEY TOKENS

PAGE: 'Page';
IF_ID:'if';
AND_OP_ID : 'AND';
OR_OP_ID : 'OR';
EQUAL_OP_ID : 'EQUAL';
PRINT_ACTION:'print';


//SYMBOL TOKENS

NEWLINE: '\n';

WHITE_SPACE:  (' '|'\t'|'\r');

SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';


ASSIGN_OP_ID : '=';

OPEN_SQR_BRACKT_ID : '[';

CLOSE_SQR_BRACKT_ID : ']';

OPEN_PAR_BRACKT_ID : '(';

CLOSE_PAR_BRACKT_ID : ')';

//FRAGMENT TOKENS

VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;

FILE_NAME_ID: [a-zA-Z]+ [1-9]* | [a-zA-Z]+  [1-9]+ ;

TEXT: (SINGLE_QUOTE|DOUBLE_QUOTE) (([a-zA-Z]+ | [1-9]+)+ WHITE_SPACE*)+ (SINGLE_QUOTE|DOUBLE_QUOTE);
TEXTNUM: [1-9]+;
//TEXTCHAR: ([a-zA-Z] | [1-9])+;


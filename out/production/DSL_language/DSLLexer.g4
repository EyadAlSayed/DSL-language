lexer grammar  DSLLexer;



// KEY TOKENS




PAGE: 'Page';
IF_ID:'if';
AND_OP_ID : 'AND';
OR_OP_ID : 'OR';
PRINT_ACTION:'print';


//SYMBOL TOKENS

NEWLINE: '\n';

WHITE_SPACE:  (' '|'\t'|'\r');

SINGLE_QUOTE: '\'';

ASSIGN : '=';

OPEN_SQR_BRACKT_ID : '[';

CLOSE_SQR_BRACKT_ID : ']';

OPEN_PAR_BRACKT_ID : '(';

CLOSE_PAR_BRACKT_ID : ')';


//FRAGMENT TOKENS

VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;

FILE_NAME_ID: [a-zA-Z]+ [1-9]* | [a-zA-Z]+  [1-9]+ ;

TEXT: SINGLE_QUOTE (([a-zA-Z]+ | [1-9]+)+ WHITE_SPACE*)+ SINGLE_QUOTE;
TEXTNUM: [1-9]+;
//TEXTCHAR: ([a-zA-Z] | [1-9])+;

lexer grammar  DSLLexer;


// EYAD start here !
// Controller Tokens


// symbols

ASSIGN : '=';

OPEN_SQR_BRACKT_ID : '[';
CLOSE_SQR_BRACKT_ID : ']';

OPEN_PAR_BRACKT_ID : '(';
CLOSE_PAR_BRACKT_ID : ')';

SPACE : ' ';

//FRAGMENT TOKENS

VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;

FILE_NAME_ID: [a-zA-Z]+ [1-9]* | [a-zA-Z]+  [1-9]+ ;

TEXT: SINGLE_QUOTE (([a-zA-Z]+ | [1-9]+)+ WHITE_SPACE*)+ SINGLE_QUOTE;

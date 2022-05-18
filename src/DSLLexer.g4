lexer grammar  DSLLexer;



// KEY TOKENS

TEXT_DEF_ID : 'Text';

TITLE : 'Title';

PAGE: 'Page';

EMAIL_AS_PARAMETER: 'email';

TEXT_AS_PARAMETER: 'text';

PASSWORD_AS_PARAMETER: 'password';

DATE_AS_PARAMETER: 'date';

TEXT_FIELD:'TextField';


//SYMBOL TOKENS

NEWLINE: '\n';

WHITE_SPACE:  (' '|'\t'|'\r');

DOUBLE_QUOTE: '"';

OPEN_BRACES : '(';

CLOSE_BRACES : ')';

OPEN_CURLY_BRACES: '{';

CLOSE_CURLY_BRACES: '}';

COMMA: ',';

//FRAGMENT TOKENS

VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;

//VAR_ID: [a-zA-Z]+ ([1-9]+ | [a-zA-Z]+ | '_')*;

FILE_NAME_ID: [a-zA-Z]+ [1-9]* | [a-zA-Z]+  [1-9]+ ;

TEXT: DOUBLE_QUOTE (([a-zA-Z]+ | [1-9]+)+ | WHITE_SPACE)* DOUBLE_QUOTE;

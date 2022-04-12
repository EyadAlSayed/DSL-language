lexer grammar  DSLLexer;

HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

SCRIPT_OPEN
    : SEA_WS* '<script' .*? '>' SEA_WS* ->pushMode(SCRIPT)
    ;


STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

MODEL_VARIABLE
        : [a-zA-Z]+ -> pushMode(MODEL_VARIABLE_MODE);

//Begining of 'input tag' syntax   SALEM
TAG_OPEN_INPUT
    : ' '* '<input' ->pushMode(INPUT_MODE)
    ;

HTML_TEXT
    : ~('<'|'{')+
    ;

TAG_OPEN_MUSTACH
    :SPACE* '{{' SPACE* ->pushMode(MUSTACH_MODE)
    ;





// tag declarations


mode TAG;

APP : 'app' ->pushMode(APP_MODE);
NGFOR: SPACE* 'ng-for' -> pushMode(NG_FOR_MODE);
NGSHOW : SPACE* 'ng-show' -> pushMode(NG_SHOW_MODE);
NGHIDE : SPACE* 'ng-hide' ->pushMode (NG_HIDE_MODE);
NGIF : SPACE* 'ng-if' -> pushMode(NG_IF_MODE);
NGSWITCH: 'ng-switch'  ->pushMode(NG_SWITCH);
NGSWITCHCASE: 'ng-switch-case'  ->pushMode(NG_SWITCH_CASE);
NGSWITCHDEFAULT: 'ng-switchDefault';
EVENT: '@' IDWORD -> pushMode(EVENT_MODE);



//SALEM
TYPE : ' '* 'type';

NG_MODEL : ' '* 'ng-model';

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;


// lexing mode for attribute values

TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;


//End of 'input tag' syntax   SALEM
TAG_NAME_INPUT_END
        : 'input' ->popMode
        ;

TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

TAG_SQ_BRACKET : SPACE* '[' -> pushMode(SQ_BRACKET_MODE);

TAG_CARLE_BRACKET : SPACE* '{' ->pushMode(CARLE_BRAKET_MODE);


fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;
fragment WORD : [a-zA-Z]+;

// <scripts>

mode SCRIPT;
//Begining of 'var' syntax   SALEM
VAR
   : ' '* 'var' -> pushMode(VAR_MODE)
   ;

SCRIPT_CLOSE
    : SEA_WS* '</script>' ->popMode
    ;

// <styles>

mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// attribute values

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : SPACE* ATTRIBUTE -> popMode
    ;
ATTRIBUTE
    :
      DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;


/* Abd */

mode APP_MODE ;
APPEQUAL: '!';
APP_CLOSE:'\'' [a-zA-Z]+ '\'' -> popMode;

mode NG_SWITCH;
NG_SWITCH_ATTRBIUTE : '!';
NG_SWITCH_VALUE
    :  '\'' VAR_S '\'' ->popMode
    ;

mode NG_SWITCH_CASE;
NG_SWITCH_CASE_ATTRBIUTE:'!';
NG_SWITCH_CASE_VALUE
    :  '\'' VAR_S '\'' ->popMode
    ;


fragment VAR_S:
    ALPHA(ALPHA|DIGIT|TAG_NameChar)*
    ;

fragment ALPHA
        :[a-zA-Z]
        ;





/* EYAD */

mode NG_FOR_MODE;
IN : SPACE* 'in';
NGFOREQUAL:'!';
SPACE : ' ';
EQUALS : SPACE* '=';
SEM_COLON : ';';
SINGLE_QUOTE : SPACE* '\'';


NG_FOR_CLOSE
    :'\''  NG_FOR_VALUE '\'' ->popMode
    ;

NG_FOR_VALUE
     : ID_CHAR
     | ID_WORD
     | ID_CHAR_LIST
     | ID_WORD_LIST
     | ID_ITEMS_CH_CHAR
     | ID_ITEMS_CH_WORD
     | ID_ITEMS_W_CHAR
     | ID_ITEMS_W_WORD
     | ID_ITEMS_CH_LIST
     | ID_ITEMS_W_LIST
     | ID_ITEMS_CH_OBJ;


fragment IDCHAR : SPACE* [a-zA-Z];
fragment IDWORD : SPACE* [a-zA-Z]+;
fragment IDNUM : SPACE* [0-9]+;

/*  x in t */
fragment ID_CHAR : IDCHAR SPACE IN SPACE IDCHAR  (SEM_COLON ID_INDEX)* ;

/* xxx in ttt  */
fragment ID_WORD : IDWORD SPACE IN SPACE? IDWORD (SEM_COLON ID_INDEX)* ;

/* x in [a,b,c] */
fragment ID_CHAR_LIST : IDCHAR SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET_C (SEM_COLON ID_INDEX)* ;

/* xxx in [a,b,c] */
fragment ID_WORD_LIST : IDWORD SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET_C (SEM_COLON ID_INDEX)* ;

/* x,y in t*/
fragment ID_ITEMS_CH_CHAR : (IDCHAR COMMA?)+ SPACE IN SPACE IDCHAR (SEM_COLON ID_INDEX)* ;

/* xxx,yyy in t*/
fragment ID_ITEMS_W_CHAR : (IDWORD COMMA?)+ SPACE IN SPACE IDCHAR (SEM_COLON ID_INDEX)* ;

/* x,y in ttt*/
fragment ID_ITEMS_CH_WORD : (IDCHAR COMMA?)+ SPACE  IN SPACE IDWORD (SEM_COLON ID_INDEX)* ;

/*  xxx,yyy in ttt*/
fragment ID_ITEMS_W_WORD : (IDWORD COMMA?)+ SPACE  IN SPACE IDWORD (SEM_COLON ID_INDEX)* ;

/* x,y in [a,b,c] */
fragment ID_ITEMS_CH_LIST : (IDCHAR COMMA?)+ SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET_C (SEM_COLON ID_INDEX)* ;

/* xx,yy in [a,b,c] */
fragment ID_ITEMS_W_LIST : (IDWORD COMMA?) + SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET_C (SEM_COLON ID_INDEX)* ;

/* x,y in {object} */
fragment ID_ITEMS_CH_OBJ : (IDCHAR COMMA?)+ SPACE IN SPACE TAG_CARLE_BRACKET CLOSE_CARLE_BRAKET (SEM_COLON ID_INDEX)*  ;

/* xx,yy in {object}*/
fragment ID_ITEMS_W_OBJ : (IDWORD COMMA?)+ SPACE IN SPACE TAG_CARLE_BRACKET CLOSE_CARLE_BRAKET (SEM_COLON ID_INDEX)*  ;


/* ; i = index */
fragment ID_INDEX : IDCHAR SPACE? EQUALS SPACE? IDWORD ;


/* not used regex */
fragment SINGLE_QUOTE_FOR_ATT
    :  ~[<']* '\''
    ;
fragment SIGNLE_FOR_OPEN_B
    :  ~[<]*  '\''
    ;

mode NG_SHOW_MODE;

DOT:'.';
NGSHOWEQUAL : '!';
LOG_OP:  '>' | '<' | '=' | '>=' | '<=' | '!=';
NG_SHOW_CLOSE
    :SPACE* '\'' NG_CONDITION '\'' ->popMode
    ;




mode NG_HIDE_MODE;

NGHIDEEQUAL:'!';

NG_HIDE_CLOSE
    :SPACE* '\'' NG_CONDITION  '\'' ->popMode
    ;
mode NG_IF_MODE;
NGIFEQUAL:'!';

NG_IF_CLOSE
    :SPACE* '\'' NG_CONDITION '\'' ->popMode
    ;
fragment NG_CONDITION
     : ARR_BOOL
     | ATT_BOOL
     | ARR_OBJECT_BOOL
     | ARR_OBJECT_VAR_BOOL
     | ARR_OBJECT_VAR_BOOL_FUN
     | ARR_FUN
     | FUN
     | CONDITION_RGX;


/* array of boolean in object */
fragment ARR_BOOL: (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* DOT (IDWORD|IDCHAR)
                    TAG_SQ_BRACKET CLOSE_SQ_BRACKET;

/* boolean attribute */
fragment ATT_BOOL : (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* (DOT (IDWORD|IDCHAR))?;

/* array of object has boolean attribute */
fragment ARR_OBJECT_BOOL : (IDWORD|IDCHAR) SPACE*  TAG_SQ_BRACKET CLOSE_SQ_BRACKET SPACE* DOT SPACE* (IDWORD|IDCHAR);
fragment ARR_OBJECT_VAR_BOOL : (IDWORD|IDCHAR) SPACE*  TAG_SQ_BRACKET CLOSE_SQ_BRACKET SPACE* (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR);
fragment ARR_OBJECT_VAR_BOOL_FUN : (IDWORD|IDCHAR) SPACE*  TAG_SQ_BRACKET CLOSE_SQ_BRACKET SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR)
                                      TAG_SQ_BRACKET CLOSE_SQ_BRACKET;

fragment ARR_FUN : (IDWORD|IDCHAR) SPACE* TAG_SQ_BRACKET CLOSE_SQ_BRACKET '(' SPACE* ')';
fragment FUN : (IDWORD|IDCHAR) SPACE* '(' SPACE*')';


/* has all condition exp */
fragment CONDITION_RGX :
         (ARR_FUN | FUN) SPACE* LOG_OP SPACE* (ARR_FUN|FUN)
         | ITEMNUMBER SPACE* LOG_OP SPACE* ITEMNUMBER
         | ITEMNUM SPACE* LOG_OP SPACE* ITEMNUM
         | IDCHAR SPACE* LOG_OP SPACE* IDCHAR
         | IDWORD SPACE* LOG_OP SPACE* IDWORD
         | (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* LOG_OP SPACE* ITEMNUMBER
         | (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* LOG_OP SPACE* ITEMNUM
         | (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* LOG_OP SPACE* IDCHAR
         | (IDWORD|IDCHAR) SPACE* DOT SPACE* (IDWORD|IDCHAR) SPACE* LOG_OP SPACE* IDWORD
         | (ARR_FUN | FUN) SPACE* LOG_OP SPACE* (IDWORD|IDCHAR)
         | (ARR_FUN | FUN) SPACE* LOG_OP SPACE* (ITEMNUMBER|ITEMNUM)
         | (ITEMNUMBER|ITEMNUM) SPACE* LOG_OP SPACE* (ARR_FUN | FUN);


mode INPUT_MODE;

TAG_NAME_INPUT_BEGIN
    : 'input' ->pushMode(INPUT_MODE)
    ;
 TAG_CLOSE_INPUT
        : ' '* '>' -> popMode
        ;

TAG_SLASH_CLOSE_INPUT
            : ' '* '/>' -> popMode
            ;


//Begining of 'type' syntax   SALEM
TYPE_EQUALS
  : TYPE '!\'' -> pushMode(TYPE_MODE);


//Begining of 'ng-model' syntax   SALEM
NG_MODEL_EQUALS
    : NG_MODEL '!\'' -> pushMode(NG_MODEL_MODE);

//Type mode for type!   SALEM
mode TYPE_MODE;

TYPE_VALUE
    : ' '* TYPE_ATTRIBUTE -> popMode
    ;
TYPE_ATTRIBUTE
    : ~[<']* '\'';

//Type mode for ng-model!   SALEM
mode NG_MODEL_MODE;

MODEL_VALUE
    : ' '* MODEL_ATTRIBUTE -> popMode
    ;
MODEL_ATTRIBUTE
    : ~[<']* '\'';

//   SALEM
mode VAR_MODE;

VAR_VARIABLE
    : (' ' | '\n')* [a-zA-Z]+;

VAR_EQUALS
    : ' '* '=' ;

VAR_OBJ : VAR_VARIABLE VAR_EQUALS TAG_CARLE_BRACKET CLOSE_CARLE_BRAKET -> popMode; // eyad

VAR_VARIABLE_VALUE
    : ' '* '\'' ~[<']* '\'' ->popMode ;





mode MODEL_VARIABLE_MODE;

MY_FORMATER_NAME : 'myFormater';
FUNCTION_SPLITER : ':' ;

FUNCTION_INDICATOR
    : ' '* '|' ' '*
    ;
FUNCTION_NAME
    : MY_FORMATER -> popMode
    ;

MY_FORMATER
    :  MY_FORMATER_NAME FUNCTION_SPLITER  FORMATER_TYPE ;

FORMATER_TYPE
    : DATE_FORMAT
    ;

DATE_FORMAT
    : '\'yyyyMMdd\''
    | 'MMyyyydd'
    | 'ddMMyyyy'
    ;

mode SQ_BRACKET_MODE;

COMMA: SPACE* ',';

CLOSE_SQ_BRACKET_C : SPACE* SQ_BRACKET_VALUE* SPACE* ']' ->popMode;
CLOSE_SQ_BRACKET : SPACE* SQ_BRACKET_ATT* SPACE* ']' ->popMode;

SQ_BRACKET_VALUE
    : ITEMCHAR_C
    | ITEMWORD_C
    | ITEMNUM_C
    | ITEMNUMBER_C
    ;

SQ_BRACKET_ATT:
    ITEMNUMBER
    | FUN
    | ARR_FUN;



fragment ITEMNUMBER : [0-9]+;
fragment ITEMNUM: SINGLE_QUOTE SPACE? [0-9]+ SPACE? SINGLE_QUOTE;

fragment ITEMCHAR_C : SINGLE_QUOTE SPACE? [a-zA-Z] SPACE? SINGLE_QUOTE COMMA?;
fragment ITEMWORD_C : SINGLE_QUOTE SPACE? [a-zA-Z]+ SPACE? SINGLE_QUOTE COMMA?;
fragment ITEMNUM_C : SINGLE_QUOTE SPACE? [0-9]+ SPACE? SINGLE_QUOTE COMMA?;
fragment ITEMNUMBER_C :  [0-9]+ COMMA?;

mode CARLE_BRAKET_MODE;

PIP : ':';
CLOSE_CARLE_BRAKET: SPACE* CARLE_BRAKET_VALUE* SPACE* '}' ->popMode;
CARLE_BRAKET_VALUE : NUM_ATT | TXT_ATT;

fragment NUM_ATT : IDWORD SPACE* PIP SPACE* IDNUM COMMA*;
fragment TXT_ATT : IDWORD SPACE* PIP SPACE* SINGLE_QUOTE IDWORD SINGLE_QUOTE COMMA*;

mode MUSTACH_MODE;

MUSTACH_CLOSE: SPACE* '}}' SPACE* -> popMode;

MUSTACH_VALUE
    :
    [a-zA-Z]+
    | ~('}'|'{')+
    ;

mode EVENT_MODE;

EVENT_CLOSE: SPACE* EVENT_ATTRIBUTE -> popMode;
EVENTEQUAL:'!';
EVENT_ATTRIBUTE: '\'' FUN SPACE* '\'' ;
parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
    pageStructure NEWLINE*
   |controllerElement NEWLINE*
   ;


//CAESAR
pageStructure: PAGE WHITE_SPACE* FILE_NAME_ID WHITE_SPACE* NEWLINE space headerStructure space body? NEWLINE space END_PAGE;
headerStructure: HEADER space value space NEWLINE space ENDHEADER;

//SALEM

body : BODY_DEF_ID space bodyAttribute*  BODY_DEF_END_ID;
bodyAttribute :
          text space
        | form space
        ;

text : TEXT_DEF_ID space textName space value space TEXT_DEF_END_ID; // it was 'value*'
textName : NAME space ASSIGN space TEXT;


value : VALUE WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT;


//ABD

form:
    (POST_FORM | GET_FORM) WHITE_SPACE* NEWLINE+ form_attribute* children*  END_FORM
    ;

form_attribute:
    (NAME|ACTION) WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT WHITE_SPACE* NEWLINE+
    ;

children:
     (WHITE_SPACE | NEWLINE)* text_input (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* email_input (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* password_input (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* radio_group (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* radio_input (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* checkbox_input (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* submit_button (WHITE_SPACE | NEWLINE)*
    | (WHITE_SPACE | NEWLINE)* text  (WHITE_SPACE | NEWLINE)*
    ;


text_input:
    TEXT_FIELD WHITE_SPACE* NEWLINE+ attribute* END_TEXT_FIELD WHITE_SPACE* NEWLINE+
    ;

email_input:
    EMAIL_FIELD WHITE_SPACE* NEWLINE+ attribute* END_EMAIL_FIELD WHITE_SPACE* NEWLINE+
    ;

password_input:
    PASSWORD_FIELD WHITE_SPACE* NEWLINE+ attribute* END_PASSWORD_FIELD WHITE_SPACE* NEWLINE+
    ;

radio_input
    :RADIO_FIELD WHITE_SPACE* NEWLINE+ attribute*  END_RADIO_FIELD WHITE_SPACE* NEWLINE+
    ;

radio_group:
    RADIO_GROUP WHITE_SPACE* NEWLINE+  NAME WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT (WHITE_SPACE | NEWLINE)* NEWLINE+ radio_input* (WHITE_SPACE | NEWLINE)* END_RADIO_GROUP WHITE_SPACE* NEWLINE+
    ;

checkbox_input
    :CHECKBOX_FIELD WHITE_SPACE* NEWLINE+ attribute*  END_CHECKBOX_FIELD WHITE_SPACE* NEWLINE+
    ;


submit_button:
   SUBMIT_BUTTON WHITE_SPACE* NEWLINE+ attribute* END_SUBMIT_BUTTON WHITE_SPACE* NEWLINE+
    ;



attribute:
 (WHITE_SPACE | NEWLINE)*   (NAME|VALUE|TEXT_DEF) WHITE_SPACE* WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT (WHITE_SPACE | NEWLINE)* NEWLINE+
    ;

//EYAD

controllerElement:  controllerDef;
controllerDef: CONTROLLER_DEF_ID WHITE_SPACE* FILE_NAME_ID NEWLINE+  (controllerTokens | NEWLINE)+  WHITE_SPACE*  CONTROLLER_DEF_END_ID;

controllerTokens:
    bundle
    |ifCondition
    |action
    ;

bundle : var WHITE_SPACE* ASSIGN  WHITE_SPACE* BUNDLE_ID WHITE_SPACE* OPEN_SQR_BRACKT_ID WHITE_SPACE* TEXT WHITE_SPACE* CLOSE_SQR_BRACKT_ID;
ifCondition : IF_ID WHITE_SPACE* OPEN_PAR_BRACKT_ID WHITE_SPACE* condition+ WHITE_SPACE* CLOSE_PAR_BRACKT_ID;

condition : var WHITE_SPACE* logicalOp WHITE_SPACE* textValue WHITE_SPACE* logicalOp? WHITE_SPACE*;
var: VAR_NAME_ID;
logicalOp: AND_OP_ID|OR_OP_ID|EQUAL_OP_ID;
action: PRINT_ACTION WHITE_SPACE* textValue;
textValue :  (TEXT |TEXTNUM) ;

space: (NEWLINE+ | WHITE_SPACE)*;










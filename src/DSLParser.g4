parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
   // pageStructure NEWLINE*
   |controllerDef
   ;


//pageStructure: PAGE WHITE_SPACE** FILE_NAME_ID space headerStructure space body?  space END_PAGE;



controllerDef:  CONTROLLER_DEF WHITE_SPACE* FILE_NAME_ID WHITE_SPACE* CONTROLLER_METHOD WHITE_SPACE* FILE_NAME_ID space
                OPEN_CURLY_BRACKT_ID space controllerTokens+ space CLOSE_CURLY_BRACKT_ID;

controllerTokens:
          ifStatment
          |print
          |assign
          |mathEquation;

ifStatment:IF_ID WHITE_SPACE* OPEN_PAR_BRACKT_ID WHITE_SPACE* condition+ WHITE_SPACE* CLOSE_PAR_BRACKT_ID space
            OPEN_CURLY_BRACKT_ID space controllerTokens+ space CLOSE_CURLY_BRACKT_ID space;


logicalOperation:AND_OP_ID |OR_OP_ID|EQUAL_OP_ID;
condition:VAR_NAME_ID WHITE_SPACE* logicalOperation WHITE_SPACE*  textValue  WHITE_SPACE* logicalOperation? WHITE_SPACE*;
textValue :  (TEXT |TEXTNUM) ;
space: (NEWLINE+ | WHITE_SPACE)*;
print:PRINT_ACTION WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;
assign:VAR_NAME_ID WHITE_SPACE* ASSIGN_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;
mathEquation:sum|mult|minus|div|mod;
sum:VAR_NAME_ID WHITE_SPACE* ASSIGN_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* SUM_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;
mult:VAR_NAME_ID WHITE_SPACE* ASSIGN_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* MULT_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;
minus:VAR_NAME_ID WHITE_SPACE* ASSIGN_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* MINUS_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;
div:VAR_NAME_ID WHITE_SPACE* ASSIGN_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* DIV_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;
mod:VAR_NAME_ID WHITE_SPACE* ASSIGN_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* MOD_OP_ID WHITE_SPACE* (textValue|VAR_NAME_ID) WHITE_SPACE* END_STATMENT_ID space;










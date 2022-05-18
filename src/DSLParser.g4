parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
   // pageStructure NEWLINE*
   |//controllerElement NEWLINE*
   ;

 radioGroup: RADIO_GROUP_ID OPEN_PAR_BRACKT_ID FILE_NAME_ID COMMA OPEN_SQR_BRACKT_ID ((FILE_NAME_ID | TEXTNUM) COMMA)* (FILE_NAME_ID | TEXTNUM) CLOSE_SQR_BRACKT_ID  (COMMA (FILE_NAME_ID | TEXTNUM))? CLOSE_PAR_BRACKT_ID;
 button : BUTTON_ID OPEN_PAR_BRACKT_ID FILE_NAME_ID CLOSE_PAR_BRACKT_ID;
 form : FORM_ID OPEN_PAR_BRACKT_ID (FILE_NAME_ID COMMA)* FILE_NAME_ID CLOSE_PAR_BRACKT_ID;
//pageStructure: PAGE WHITE_SPACE* FILE_NAME_ID space headerStructure space body?  space END_PAGE;



//controllerElement:  controllerDef;

space: (NEWLINE+ | WHITE_SPACE)*;










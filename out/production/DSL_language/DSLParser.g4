parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
   // pageStructure NEWLINE*
   |//controllerElement NEWLINE*
   ;


//pageStructure: PAGE WHITE_SPACE* FILE_NAME_ID space headerStructure space body?  space END_PAGE;



//controllerElement:  controllerDef;

space: (NEWLINE+ | WHITE_SPACE)*;










parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
controllerElement*
;
controllerElement:

;

controllerDef:

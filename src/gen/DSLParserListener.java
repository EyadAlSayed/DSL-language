// Generated from D:/Documents/GitHub/DSL-language2/src\DSLParser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#dslDocument}.
	 * @param ctx the parse tree
	 */
	void enterDslDocument(DSLParser.DslDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dslDocument}.
	 * @param ctx the parse tree
	 */
	void exitDslDocument(DSLParser.DslDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#pageStructure}.
	 * @param ctx the parse tree
	 */
	void enterPageStructure(DSLParser.PageStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#pageStructure}.
	 * @param ctx the parse tree
	 */
	void exitPageStructure(DSLParser.PageStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#headerStructure}.
	 * @param ctx the parse tree
	 */
	void enterHeaderStructure(DSLParser.HeaderStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#headerStructure}.
	 * @param ctx the parse tree
	 */
	void exitHeaderStructure(DSLParser.HeaderStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DSLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DSLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#bodyAttributes}.
	 * @param ctx the parse tree
	 */
	void enterBodyAttributes(DSLParser.BodyAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#bodyAttributes}.
	 * @param ctx the parse tree
	 */
	void exitBodyAttributes(DSLParser.BodyAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(DSLParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(DSLParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#radioGroup}.
	 * @param ctx the parse tree
	 */
	void enterRadioGroup(DSLParser.RadioGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#radioGroup}.
	 * @param ctx the parse tree
	 */
	void exitRadioGroup(DSLParser.RadioGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#checkbox}.
	 * @param ctx the parse tree
	 */
	void enterCheckbox(DSLParser.CheckboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#checkbox}.
	 * @param ctx the parse tree
	 */
	void exitCheckbox(DSLParser.CheckboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#dropDown}.
	 * @param ctx the parse tree
	 */
	void enterDropDown(DSLParser.DropDownContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dropDown}.
	 * @param ctx the parse tree
	 */
	void exitDropDown(DSLParser.DropDownContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(DSLParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(DSLParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(DSLParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(DSLParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#buttonSend}.
	 * @param ctx the parse tree
	 */
	void enterButtonSend(DSLParser.ButtonSendContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#buttonSend}.
	 * @param ctx the parse tree
	 */
	void exitButtonSend(DSLParser.ButtonSendContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(DSLParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(DSLParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#marginList}.
	 * @param ctx the parse tree
	 */
	void enterMarginList(DSLParser.MarginListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#marginList}.
	 * @param ctx the parse tree
	 */
	void exitMarginList(DSLParser.MarginListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#controllerDef}.
	 * @param ctx the parse tree
	 */
	void enterControllerDef(DSLParser.ControllerDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controllerDef}.
	 * @param ctx the parse tree
	 */
	void exitControllerDef(DSLParser.ControllerDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#radioDefault}.
	 * @param ctx the parse tree
	 */
	void enterRadioDefault(DSLParser.RadioDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#radioDefault}.
	 * @param ctx the parse tree
	 */
	void exitRadioDefault(DSLParser.RadioDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(DSLParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(DSLParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#controllerTokens}.
	 * @param ctx the parse tree
	 */
	void enterControllerTokens(DSLParser.ControllerTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controllerTokens}.
	 * @param ctx the parse tree
	 */
	void exitControllerTokens(DSLParser.ControllerTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#send}.
	 * @param ctx the parse tree
	 */
	void enterSend(DSLParser.SendContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#send}.
	 * @param ctx the parse tree
	 */
	void exitSend(DSLParser.SendContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#inputAttribute}.
	 * @param ctx the parse tree
	 */
	void enterInputAttribute(DSLParser.InputAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#inputAttribute}.
	 * @param ctx the parse tree
	 */
	void exitInputAttribute(DSLParser.InputAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DSLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DSLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#loopVariable}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariable(DSLParser.LoopVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#loopVariable}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariable(DSLParser.LoopVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#loopFirstVariable}.
	 * @param ctx the parse tree
	 */
	void enterLoopFirstVariable(DSLParser.LoopFirstVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#loopFirstVariable}.
	 * @param ctx the parse tree
	 */
	void exitLoopFirstVariable(DSLParser.LoopFirstVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#loopSecondVariable}.
	 * @param ctx the parse tree
	 */
	void enterLoopSecondVariable(DSLParser.LoopSecondVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#loopSecondVariable}.
	 * @param ctx the parse tree
	 */
	void exitLoopSecondVariable(DSLParser.LoopSecondVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(DSLParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(DSLParser.IfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(DSLParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(DSLParser.LogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#main_condition}.
	 * @param ctx the parse tree
	 */
	void enterMain_condition(DSLParser.Main_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#main_condition}.
	 * @param ctx the parse tree
	 */
	void exitMain_condition(DSLParser.Main_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#equal_condition}.
	 * @param ctx the parse tree
	 */
	void enterEqual_condition(DSLParser.Equal_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#equal_condition}.
	 * @param ctx the parse tree
	 */
	void exitEqual_condition(DSLParser.Equal_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#binary_equal_condition}.
	 * @param ctx the parse tree
	 */
	void enterBinary_equal_condition(DSLParser.Binary_equal_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#binary_equal_condition}.
	 * @param ctx the parse tree
	 */
	void exitBinary_equal_condition(DSLParser.Binary_equal_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(DSLParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(DSLParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(DSLParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(DSLParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DSLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DSLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DSLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DSLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mathEquation}.
	 * @param ctx the parse tree
	 */
	void enterMathEquation(DSLParser.MathEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mathEquation}.
	 * @param ctx the parse tree
	 */
	void exitMathEquation(DSLParser.MathEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#simpleMathEquation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMathEquation(DSLParser.SimpleMathEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#simpleMathEquation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMathEquation(DSLParser.SimpleMathEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#complexMathEquation}.
	 * @param ctx the parse tree
	 */
	void enterComplexMathEquation(DSLParser.ComplexMathEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#complexMathEquation}.
	 * @param ctx the parse tree
	 */
	void exitComplexMathEquation(DSLParser.ComplexMathEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(DSLParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(DSLParser.MathOperationContext ctx);
}
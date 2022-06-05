package Generators.Controller;

import Models.ControllerModels.Action.Assign;

public class AssignGenerator {

  StringBuilder stringBuilder;
  TextValueGenerator textValueGenerator;

  public String generateAssign(Assign assign)
  {
      stringBuilder = new StringBuilder();
      if(assign.getFileNameId1() != null)
          stringBuilder.append(" $").append(assign.getFileNameId1());
      if (assign.getAssignOpId() != null)
          stringBuilder.append(" =");
      if (assign.getFileNameId2() != null)
          stringBuilder.append(" $").append(assign.getFileNameId2());
      if (assign.getTextValue() != null)
      {
          textValueGenerator = new TextValueGenerator();
          stringBuilder.append(textValueGenerator.generateTextValue(assign.getTextValue())).append(";");
      }
     return stringBuilder.toString();
  }

}

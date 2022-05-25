package Generators.Controller;

import Models.ControllerModels.Action.Assign;

public class AssignGenerator {

  StringBuilder stringBuilder = new StringBuilder();

  public String generateAssign(Assign assign)
  {
      if(assign.getFileNameId1() != null)
          stringBuilder.append(" $").append(assign.getFileNameId1());
      if (assign.getAssignOpId() != null)
          stringBuilder.append(" =");
      if (assign.getFileNameId2() != null)
          stringBuilder.append(" $").append(assign.getFileNameId2());
     return stringBuilder.toString();
  }

}

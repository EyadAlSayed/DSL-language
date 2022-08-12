package Visitors;

import Models.PageModels.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.Objects;

public class CustomPair {

    public static boolean containPair(Pair<String, Object> pair, ArrayList<Pair<String, Object>> pairs) {
        for (int i = 0; i < pairs.size(); i++) {
            if (Objects.equals(pair.a, pairs.get(i).a)) {
                if (pair.b == pairs.get(i).b)
                    return true;
            }
        }
        return false;
    }

    public static Object containVariable(String variable, ArrayList<Object> pairs) {
        for (int i = 0; i < pairs.size(); i++) {
            if (pairs.get(i) instanceof Button)
                if (Objects.equals(variable, ((Button) pairs.get(i)).getVariableName()))
                    return pairs.get(i);
            if (pairs.get(i) instanceof RadioGroup)
                if (Objects.equals(variable, ((RadioGroup) pairs.get(i)).getVariableName()))
                    return pairs.get(i);
            if (pairs.get(i) instanceof Text)
                if (Objects.equals(variable, ((Text) pairs.get(i)).getNAME()))
                    return pairs.get(i);
            if (pairs.get(i) instanceof Input)
                if (Objects.equals(variable, ((Input) pairs.get(i)).getNAME()))
                    return pairs.get(i);
             if(pairs.get(i) instanceof DropDown)
                 if (Objects.equals(variable,((DropDown) pairs.get(i)).getName()))
                     return pairs.get(i);
             if(pairs.get(i) instanceof Checkbox)
                 if(Objects.equals(variable,((Checkbox) pairs.get(i)).getVariableName()))
                     return pairs.get(i);
           if(Objects.equals(variable,  pairs.get(i)))
               return pairs.get(i);

        }
        return null;
    }

  public static String inScope(Node node,String variableName,String variableType){

      for (int i = 0; i < node.getVariables().size(); i++) {
          if(Objects.equals(node.getVariables().get(i).a,variableName)){
              if(variableType!=null){
                  node.getVariables().remove(i);
                  node.getVariables().add(new Pair<>(variableName,variableType));
                  return variableType;
              }
              return node.getVariables().get(i).b;

          }
      }
      if(node.getFather() == null)
          return null;
      else
          return inScope(node.getFather(),variableName,variableType);
  }
}

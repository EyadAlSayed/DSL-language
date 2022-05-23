package Visitors;

import Models.PageModels.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.Objects;

public class CustomPair{

    public static boolean containPair(Pair<String,Object> pair,ArrayList<Pair<String,Object>> pairs)
    {
        for (int i = 0; i < pairs.size(); i++) {
            if(Objects.equals(pair.a, pairs.get(i).a))
            {
                if(pair.b == pairs.get(i).b )
                    return true;
            }
        }
        return false;
    }

    public static Object containVariable(String variable , ArrayList<Object> pairs)
    {
        for (int i = 0 ; i<pairs.size() ; i++)
        {
            if (pairs.get(i) instanceof Button)
            if(Objects.equals(variable, ((Button) pairs.get(i)).getVariableName()))
                return pairs.get(i);
            if (pairs.get(i) instanceof RadioGroup)
                if(Objects.equals(variable, ((RadioGroup) pairs.get(i)).getVariableName()))
                    return pairs.get(i);
            if (pairs.get(i) instanceof Text)
                if(Objects.equals(variable, ((Text) pairs.get(i)).getNAME()))
                    return pairs.get(i);
            if (pairs.get(i) instanceof TextField)
                if(Objects.equals(variable, ((TextField) pairs.get(i)).getNAME()))
                    return pairs.get(i);
            if (pairs.get(i) instanceof Checkbox)
                if(Objects.equals(variable, ((Checkbox) pairs.get(i)).getNAME()))
                    return pairs.get(i);

        }
        return null;
    }


}

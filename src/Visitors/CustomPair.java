package Visitors;

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

    public static boolean containVariable(String variable , ArrayList<Pair<String,Object>> pairs)
    {
        for (int i = 0 ; i<pairs.size() ; i++)
        {
            if(variable == pairs.get(i).b)
            {
                return true;
            }
        }
        return false;
    }
}

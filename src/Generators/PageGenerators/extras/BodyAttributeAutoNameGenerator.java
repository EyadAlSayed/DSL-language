package Generators.PageGenerators.extras;

public class BodyAttributeAutoNameGenerator {

    private static int i = 1;

    public static String getAutoName(){
        return "anyname" + i++;
    }
}

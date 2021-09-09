package Class13.AccessModifier;

public class MyMainMethod {

    public static void main(String[] args) {

        // access "name" variable from AccessModifier_Concept
        AccessModifier_Concept amc = new AccessModifier_Concept();
        amc.name = "";

        // access "sName" variable from AccessModifier_Concept
        AccessModifier_Concept.sName = "";

        // access "toTitleCase" method from AccessModifier_Concept class
        AccessModifier_Concept.toTitleCase("how Are YOU");

        // access "createAbbreviation" method from AccessModifier_Concept class
        amc.createAbbreviation("hello World");





    }


}

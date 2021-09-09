package Class9;

import Class13.AccessModifier.AccessModifier_Concept;

public class Methods {

    /**
     * Method: Lines of code to perform a specific task
     *
     * Benefit: no code repetition
     *
     * -> Method name should reflect the purpose of method
     *
     * Syntax:
     * <access-modifier> [static] <void|returnType> <methodName> (blank|create variables based on number of inputs required by user) {
     *     // code to perform
     *     // the task of the method
     * }
     *
     * input parameters:
     *  blank -> if we don't need any input from user
     *  create variables -> if need inputs fom the user
     *
     * return-type:
     *  void -> if method doesn't return any data back to user
     *  datatype of returned value -> if method return something to the user
     *
     *
     * --->>>> No method will be created inside a method.
     *
     */
    // method to count vowels
    /**
     * name: vowelCount
     * input: 1 (String)
     * return type: int
     */
    public static int vowelCount (String userString) {
        int count = 0;
        char [] vowels = {'a','e','i','o','u'};
        for (int c=0 ; c <userString.length(); c++) {
            char ch = userString.toLowerCase().charAt(c);
            for (char vowel : vowels) {
                if (vowel == ch) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {

        String name = "Hello World";

        int nameVowelCount = vowelCount(name);

        System.out.println(vowelCount("how ARE yOU my DEar"));

        String[] nameSplit = name.split(" ");

        String nameUppercase = name.toUpperCase();

        String abr = createAbbreviation("happy new year");
        System.out.println("Abbreviation of 'happy new year' is : " + abr);

        System.out.println(createAbbreviation("hello world"));

        System.out.println(createAbbreviation("how are You"));

        System.out.println(createAbbreviation("King kong"));

        sayHelloWorld();

        sayHelloWorld();

        sayHelloWorld();

        sayHelloWorld();

        sayHelloWorld();

        helloUser("Happy");     // Hello Happy
        helloUser("kIng");      // Hello King


        // access "name" variable from AccessModifier_Concept
        AccessModifier_Concept amc = new AccessModifier_Concept();
        // amc.name = "hello";
        amc.setName("hello");
        amc.printName();

        // access "sName" variable from AccessModifier_Concept
        AccessModifier_Concept.sName="";

        // access "toTitleCase" method from AccessModifier_Concept class
        AccessModifier_Concept.toTitleCase("hello WoRLD");

        // access "createAbbreviation" method from AccessModifier_Concept class
        amc.createAbbreviation("hello World");





    }

    /**
     * method to create abbreviation of a string
     * name : createAbbreviation
     * input: 1 (String)
     * return-type: String
     */
    // <access-modifier> [static] <void|returnType> <methodName> (blank|create variables based on number of inputs required by user) {
    public static String createAbbreviation (String userStr) {
        String abr = "";
        String[] userArray = userStr.toUpperCase().split(" ");
        for (String word : userArray) {
            // abr = abr + word.charAt(0);
            abr += word.charAt(0);
        }
        return abr;
    }

//    /**
//     * Create a method to say/sout "Hello World"
//     *
//     * name         :   sayHelloWorld
//     * input        :   0
//     * return type  :   String
//     */
//    // <access-modifier> [static] <void|returnType> <methodName> (blank|create variables based on number of inputs required by user) {
//    public static String sayHelloWorld () {
//        String str = "Hello World";
//        System.out.println(str);
//        return str;
//    }

    /**
     * Create a method to say/sout "Hello World"
     *
     * name         :   sayHelloWorld
     * input        :   0
     * return type  :   void
     */
    // <access-modifier> [static] <void|returnType> <methodName> (blank|create variables based on number of inputs required by user) {
    public static void sayHelloWorld () {
        // String str = "Hello World";
        System.out.println("Hello World");
    }

    /**
     * create a method to say Hello Username
     * eg:
     *      Hello Happy
     *      Hello King
     *      Hello John
     *
     * name : helloUser
     * input : 1 (String)
     * return type : void
     *
     */
    public static void helloUser (String username) {
        System.out.println("Hello " + username);        // Hello
    }






}

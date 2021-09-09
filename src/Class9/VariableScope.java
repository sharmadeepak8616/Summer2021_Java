package Class9;

public class VariableScope {


    /**
     * Field Variables (Global Variable, Class variable)
     *  1. Variables which we create inside the class but outside all methods.
     *  2. when we want to use the variable in multiple methods of a class.
     *  Scope: Entire class (we can access the field variable anywhere inside the class)
     *
     *
     * Local Variable
     *  1. variable which we create inside method
     *
     *
     * final variable -> variable which are constant, or we cannot change the value once assigned.
     * (can be field/local variable)
     *
     */
    static String name = "happy Peace";     // scope = entire class
    static int num = 100;
    final static String routingNumber = "12345678";


    public static void main(String[] args) {

//        routingNumber = "abcd";
//        // 1234567812345678

        final int prizeMoney = 1000;



        String name = "King kong";          // scope = main method
        System.out.println("my name = " + name);
        int a = 10;                         // scope = main method
        if (a > 5) {
            int b = 22;                     // scope = if-block
            int num = 11;                   // scope = if-block

            System.out.println("num " + num);   // num = 11

            System.out.println("b = " + b);     // b = 22

        }
        // System.out.println("b = " + b);
        System.out.println("num " + num);       // num = 100
        name = "Lovely Day";
        System.out.println("New name = " + name);

        hello();    // Hello happy Peace

        changeName("James Bond");   // changed the global variable name to "James Bond"

        hello();    // Hello James Bond

        name = "Aladdin";   // local variable (name) changed to Aladdin

        hello();    // Hello James Bond
    }

    public static void hello() {
        System.out.println("Hello " + name);
    }

    public static void changeName(String newName) {
        name = newName;
    }




}

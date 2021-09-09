package Class14.ConstructorPkg;

public class MyConstructor {

    /**
     * Constructor: It's a special method.
     *  1. It has SAME name as of the class.
     *  2. It does NOT have a return type, not even void.
     *  3. In order to create an object of class, java runs it's Constructor method.
     *  For normal method -> we use object/className to execute the method.
     *  For Constructor ->  when we create object, constructor gets executed by itself.
     *                      we cannot use object/className to run the constructor
     *
     *
     *
     * Syntax:
     * <accessModifier> <constructorMethodName> (argumentsIfRequired) {
     *     // code you want to execute
     *     // in order to create an object
     * }
     *
     * 1. Constructor can be public, protected or private.
     *      public -> allows us to create object from anywhere in the project.
     *      protected -> allows us to create object from anywhere in the package.
     *      private -> object of the class cannot be created.
     *            (when we have all method/variables as static ; eg: Math.java)
     *
     * 2. Constructor can have arguments as well.
     * 3. We can have one or more Constructors in a class. -> Constructor Overloading
     * 4. If user defined Constructor is present in the class, Java never creates a default Constructor.
     *
     */
    // variables

    // methods
    public MyConstructor() {
        System.out.println("Inside the Constructor method");
    }

    public MyConstructor(int num) {
        System.out.println("Inside the Constructor method - " + num);
    }

    public MyConstructor(String num) {
        System.out.println("Inside the Constructor method - " + num);
    }

    public void sayHello() {
        System.out.println("Hello User");
    }

    public void sayHello(String username) {
        System.out.println("Hello " + username);
    }


}

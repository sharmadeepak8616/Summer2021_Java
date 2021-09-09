package Class11;

public class OOPS_Concept {

    /**
     * OOPS Concept:
     *
     * 1. Encapsulation
     *      Wrapping up the code in a single unit (eg: class)
     *      To implement Encapsulation concept, we create Class and write code in it.
     *
     * 2. Abstraction
     *      Hiding unnecessary information from user.
     *      To implement Abstract, we create methods.
     *
     * 3. Inheritance
     *      -> To implement Inheritance, we create parent-child set up between two classes.
     *      -> childClass can access parentClass methods/variables (except private method/variable)
     *      -> we use "extends" keyword with Child class to achieve Inheritance.
     *      -> a class can extend ONLY one class (why? - Diamond Problem)
     *
     * 4. Polymorphism
     *      -> same name but different forms
     *      -> In Java: when we have two or more methods with SAME name but different code.
     *      -> Types:
     *      1. Compile Time Polymorphism (Static Binding or Method Overloading)
     *      2. Run Time Polymorphism (Dynamic Binding or Method Overriding)
     *
     * Compile Time Polymorphism (Static Binding or Method Overloading):
     *      In a class, we have two or more methods with same name but different arguments (parameters, input)
     *      Ways to set different arguments:
     *          a) different number of arguments
     *          b) different datatypes of arguments
     *          c) different sequence of arguments
     *  Note: Return-type DOES NOT play any role in Compile Time Polymorphism.
     *
     * Run Time Polymorphism (Dynamic Binding or Method Overriding):
     *      This can be achieved ONLY in Inheritance set-up
     *      when we overwrite/override a Parent-Class method in Child-Class
     *      when we have methods with same name and same arguments in ParentClass anc ChildClass
     *
     * ******************
     *
     * super - keyword
     *
     * We use 'super' keyword, when we want to call/execute parent-class method inside a child-class method.
     *
     *
     *
     *
     *
     */


    public static void main(String[] args) {

        "hello dear".split("e");    // String[] --> {"h" , "llo d" , "ar"}

    }

}

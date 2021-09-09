package Class15.AbstractClassPkg;

public abstract class AbstractTheory {

    // Variables
    // Methods

    /**
     * Abstract Method: is a method that cannot have a body (code inside the method)
     *
     */

    /**
     * Abstract Class - is a special type of class.
     * 1. To create Abstract class, we have to use "abstract" keyword
     *  after the access-modifier while creating the class.
     *
     * 2. Like normal class, it can have field variables and normal methods,
     *  and it can have abstract methods.
     *
     * 3. By default, all methods are normal methods.
     * In order to create an abstract method, we have to use "abstract" keyword
     *  after the access-modifier while creating the method.
     *
     * 4. We can create variable of AbstractClass type,
     *  but we CANNOT create object of Abstract class.
     *
     */

    String myName;
    AbstractTheory abc;     // what is the datatype abc? - AbstractTheory

    public void sayHello() {
        System.out.println("Hello");
    }

    public abstract void sayBye();

    public int add2Ints(int num1, int num2) {
        return num1+num2;
    }

    public abstract int sub2Ints(int num1, int num2);


}

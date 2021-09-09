package Class15.Constructor_Inheritance;

public class PClass {

    public PClass() {
        System.out.println("Inside PClass constructor");
    }

    String parentName = "Parent";   // car

    public void printParentName() {  // house
        System.out.println("Name : " + parentName);
    }

    public void myParentMethod() {  // house
        System.out.println("Inside Parent Method");
    }

    public void sayHello() {
        System.out.println("Hello from Parent class");
    }
}

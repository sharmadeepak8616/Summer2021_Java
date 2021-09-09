package Class11.Inheritance;

import Class11.ClassObject_Concept.MyClassObject_Theory;

public class PClass {

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

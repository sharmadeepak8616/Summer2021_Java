package Class11.Inheritance;

import Class11.ClassObject_Concept.MyClassObject_Theory;

public class CClass extends PClass {    // CClass is child of PClass

    String childName = "Child";   // car

    public void printChildName() {  // house
        System.out.println("Name : " + childName);
    }

    public void myChildMethod() {  // house
        sayHello();     // lets run sayHello() from CClass
        System.out.println("Inside Child Method");
    }

    public void sayHello() {
        printParentName();  // lets run printParentName() from PClass
        printChildName();   // lets run printChildName() from CClass
        super.sayHello();   // lets run sayHello() from PClass
        System.out.println("Hello from Child Class");
    }

}

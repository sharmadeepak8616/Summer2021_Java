package Class15.Constructor_Inheritance;

public class MyMainClass {

    public static void main(String[] args) {

        // CClass c1 = new CClass();   // ChildClass var storing ChildObject
        // PClass -> CClass (First parent constructor run then child constructor)
        // c1 -> all methods from CClass and PClass

        // PClass p1 = new PClass();   // ParentClass var storing ParentObject
        // p1 -> methods from PClass

        PClass p2 = new CClass(); // ParentClass var storing ChildObject
        p2.sayHello();
        // p2 -> methods from PClass but overridden methods from CClass

        // CClass c2 = new PClass(); // ChildClass var storing ParentObject
        // Compile Time Error




    }
}

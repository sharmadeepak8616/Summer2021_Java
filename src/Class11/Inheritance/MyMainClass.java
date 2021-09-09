package Class11.Inheritance;

public class MyMainClass {

    public static void main(String[] args) {

        // run myParentMethod
        PClass p = new PClass();
        p.myParentMethod();


        // Object of child class
        CClass c1 = new CClass();

        c1.printParentName();

        c1.printChildName();

        c1.sayHello();







    }
}

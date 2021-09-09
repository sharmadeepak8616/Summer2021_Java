package Class15;

import Class15.AbstractClassPkg.ChildClass;
import Class15.InterfacePkg.InterfaceTheory;
import Class15.InterfacePkg.MyClass;
import Class15.InterfacePkg.MyClass2;

public class MyMain {

    public static void main(String[] args) {


        // execute sayHello() from AbstractTheory class
        /*
            1. create object of AbstractTheory class
            2. use object to execute sayHello()
         */

        ChildClass cc = new ChildClass();

        InterfaceTheory it = new MyClass();

        InterfaceTheory its = new MyClass2();

        InterfaceTheory.sayBye();








    }
}

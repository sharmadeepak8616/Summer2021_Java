package Class15.AbstractClassPkg;

public class ChildClass extends AbstractTheory {

    public void sayHelloFromChild() {
        System.out.println("Hello from Child class");
    }

    public void sayBye() {
        System.out.println("bye from Child on behalf of AbstractTheory class");
    }

    public int sub2Ints(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }
}

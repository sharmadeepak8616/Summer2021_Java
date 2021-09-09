package Class11.ClassObject_Concept;

public class MyClassObject_Theory {


    public int add(int num1, int num2) {
        return num1+num2;
    }


    public double add(double num1, int num2) {  // double, int
        return num1+num2;
    }

//    public void add(double num1, int num2) {  // double, int
//        System.out.println(num1+num2);
//    }

    public double add(int num1, double num2) {  // int, double
        return num1+num2;
    }

    public double add(double num1, double num2) {  // double, double
        return num1+num2;
    }

    // create new method which can add 3-int values
    public int add(int num1, int num2, int num3) {
        return num1+num2+num3;
    }





    public int sub2Ints(int num1, int num2) {
        return num1-num2;
    }


}

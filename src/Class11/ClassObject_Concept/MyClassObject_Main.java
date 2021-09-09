package Class11.ClassObject_Concept;

public class MyClassObject_Main {

    public static void main(String[] args) {

        // add 5 and 2
        /*
            use add2Ints from MyClassObject_Theory

         */

        String abc = "Hello";
        int num = 100;
        String xyz;

        // creating object of MYClassObject_Theory
        MyClassObject_Theory mct = new MyClassObject_Theory();

        System.out.println(mct);

        System.out.println(mct.add(5,2));

        /**
         * datatype of mct? -> MyClassObject_Theory
         *
         * datatype of abc? -> String
         *
         * datatype of num? -> int
         *
         * datatype of xyz? -> String
         *
         */

        /**
         * MyClassObject_Theory mct
         *      --> mct is a variable of datatype MyClassObject_Theory
         *
         * new MyClassObject_Theory()
         *      --> is the actual object of MyClassObject_Theory class
         *
         * mct is variable of type MyClassObject_Theory and stores the object of this class.
         *
         */

        MyClassObject_Theory mct2;
        /**
         * mct2 can store value with type MyClassObject_Theory
         *
         * object of MyClassObject_Theory has datatype as MyClassObject_Theory
         *
         */

        mct2 = new MyClassObject_Theory();

        // Array of objects
        MyClassObject_Theory[] myArray = new MyClassObject_Theory[5];
        /**
         * what type of values myArray can store? -> MyClassObject_Theory
         */
        myArray[0] = mct;
        myArray[1] = mct2;
        // myArray -> [ mct , mct2 , null, null, null]


        double[] myArray2;
        /**
         * what type of values myArray2 can store? -> double
         */

        String[] myArray3;
        /**
         * what type of values myArray3 can store? -> String
         */


        mct.add(5, 2);

        mct.add(1,2,3);















    }

}

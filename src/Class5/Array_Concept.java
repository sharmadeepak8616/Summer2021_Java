package Class5;

import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {
        /*

            int a = 10;
            sout(a);        // 10

            a = 20;
            sout(a);        // 20

            String name = "happy";
            sout(name);     // happy

            name = "peace";
            sout(name);     // peace


            1. grocery
         */
        /**
         * Array []
         *
         * It's a non-primitive datatype, which can store multiple values of SAME datatype.
         *
         * Things to know before creating an Array:
         * 1. What will be the datatype of values that I want to store in array.
         * 2. a) Total number of values that I want to store in array.
         *      OR
         *    b) All the values that I want to store in array.
         *
         * Syntax to create an array
         *  if 1 and 2a:
         *  datatype[] arrName = new datatype[totalNumber]
         *
         *  if 1 and 2b:
         *  datatype[] arrName = {value1, value2, value3, value4, value5};
         *
         */
//        String student1 = "alsu";
//        String student2 = "andy";
//        String student3 = "avi";

        // Array students = ["alsu", "andy", "avi"];

        // I want to store names of top-5 students in a variable.
        // 1 - String
        // 2a - 5
        String[] top5Students = new String[5];
        // Array --> [  ,  ,  ,  ,  ]
        // Index -->   0  1  2  3  4

        int top5Students_Length = top5Students.length;
        System.out.println("Length of top5Students array : " + top5Students_Length);

        top5Students[0] = "HaPPy";
        // Array --> [ "HaPPy" ,  ,  ,  ,  ]
        // Index -->      0      1  2  3  4

        top5Students[4] = "Toni";
        // Array --> [ "HaPPy" ,  ,  ,  , "Toni" ]
        // Index -->      0      1  2  3     4

        top5Students[1] = "Toni";
        // Array --> [ "HaPPy" , "Toni"  ,   ,   , "Toni" ]
        // Index -->      0         1      2   3      4

        // print top5Students array
        System.out.println("top5Students : " + top5Students);
        System.out.println("top5Students : " + Arrays.toString(top5Students));

        top5Students[3] = "KiNg";
        // Array --> [ "HaPPy" , "Toni"  ,   , KiNg , "Toni" ]
        // Index -->      0         1      2     3      4

        top5Students[2] = "JoY";
        // Array --> [ "HaPPy" , "Toni"  , JoY  , KiNg , "Toni" ]
        // Index -->      0         1       2       3      4

        System.out.println("top5Students : " + Arrays.toString(top5Students));

        /**
         * To retrieve the value from specific index
         *
         * arrName[indexValue] --> returns the value from arrName-Array at given indexValue
         *
         */

        // code to print the value at index-0
        System.out.println(top5Students[0]);

        // Verify if index 1 value and index-2 are not same.
        // top5Students : [HaPPy, Toni, JoY, KiNg, Toni]

        boolean isEqual = top5Students[1].equalsIgnoreCase(top5Students[2]);
        System.out.println("are value at index-1 and index 2 same : " + isEqual);

        // Store below car company names in a variable
        // tesla, ford, bmw, nissan
        // 1 - String
        // 2a) - 4
        // 2b) - tesla, ford, bmw, nissan
        String[] carNames = { "tesla", "ford", "bmw" , "nissan"};
        // carNames --> ["tesla" , "ford" , "bmw", "nissan"]
        // index -->        0         1       2        3


        // store values of top 5 bills amount
        /*
            1 - double
            2a - 5
            datatype[] arrName = new datatype[totalNumber]
         */
        double[] topBills = new double[5];
        // Array -> {  ,  ,  ,  ,  }
        // Index -->  0  1  2  3  4

        // length of topBills array? -> 5
        // what are the values in topBills array? -> it's empty

        topBills[0] = 23.32;
        topBills[1] = 10;
        topBills[3] = 22.2;
        topBills[2] = 98.76;
        // topBills[4] should be the sum of index-2 and index-3 values
        topBills[4] = topBills[2] + topBills[3];

        // shortcut to print an array.
        System.out.println("\n\ntopBills array --> " + Arrays.toString(topBills));

        // Store the value at index-2 in new variable (foodBill)
        double foodBill = topBills[2];

        // change the value at index-3
        // new value should be the average of values at index-0 and index-1

        topBills[3] = (topBills[0] + topBills[1]) / 2;

        System.out.println("\ntopBills array --> " + Arrays.toString(topBills));


        /**
         * To find the length of array
         *
         * length   <-- In array, length is a variable NOT method
         *
         */
        int topBillsLength = topBills.length;

        System.out.println("Length of topBills array : " + topBillsLength);




























    }
}

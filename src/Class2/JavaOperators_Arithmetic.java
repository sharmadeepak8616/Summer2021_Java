package Class2;

public class JavaOperators_Arithmetic {


    public static void main(String[] args) {

        /**
         * Arithmetic (+, -, *, /, %, ++, --)
         *
         * +
         * -
         * *
         * /
         * %    Modulus
         * ++   increment (pre-increment/post-increment)
         * --   decrement (pre-decrement/post-decrement)
         *
         * If all values in any mathematical equation is int
         *      final value will be int type
         *
         * If any one of the values is of double type in any mathematical equation
         *      final value will be double type
         *
         *
         */
        int num1 = 11;
        int num2 = 20;
        int num3 = num1 + num2;

        // print        10 + 20 = 30
        System.out.println(num1 + " + " + num2 + " = " + num3);     // 31

        int num4 = num2 - num1;
        System.out.println(num2 + " - " + num1 + " = " + num4);     // 9

        int num5 = num2 * num1;
        System.out.println(num2 + " * " + num1 + " = " + num5);     // 220

        double num1Double = num1;       //  num1Double = 11.00
        double num6 = num2 / num1Double;
        System.out.println(num2 + " / " + num1 + " = " + num6);     // 1

        /**
         *  % -> Modulus
         *
         * to be used with 2-int values.
         *
         * 20/11 -> 1 (remaining -> 9)
         * 16/7  -> 2 (remaining -> 2)
         * 9/3   -> 3 (remaining -> 0)
         *
         * 20%11 -> 9
         * 9%3 -> 0
         *
         * eg: even/odd
         * 65%2 -> 1
         *
         */
        System.out.println("40 % 5 = " + 40%5);     // 0
        System.out.println("20 % 3 = " + 20%3);     // 2
        System.out.println("11 % 4 = " + 11%4);     // 3


        /**
         * increment (++)
         *  post-increment and pre-increment
         *
         * ++
         *  increment the current value in variable by 1
         *  and the new value will be stored in the SAME variable.
         *
         * int b = 10;
         * b++;     --> post-increment
         * ++b;     --> pre-increment
         */
        int num7 = 10;      // num7 = 10
        num7 = num7 + 1;    // num7 = 11

        System.out.println("num7 + " + num7);   // num7 = 11

        int num8 = 20;      // num8 = 20
        num7 = num8 + 1;    // num7 = 21 ; num8 = 20

        System.out.println("num8 " + num8);     // num8 = 21

        int inc = 5;
        System.out.println("\ninc = " + inc);       // 5
        inc++;
        System.out.println("inc = " + inc);         // 6
        ++inc;
        System.out.println("inc = " + inc);         // 7

        System.out.println("inc = " + inc++);       // print = 7 , inc=8

        System.out.println("inc = " + ++inc);       // inc=9 , print = 9

        /**
         * post -> use the current value of variable for whatever action/operation
         *          then increment the value in the variable
         *
         * pre -> increment the value in the variable.
         *          then use the latest value of variable for whatever action/operation
         */

        int i1 = 1;                         // i1 = 1
        int i2 = i1++;                      // i2 = 1, i1=2
        System.out.println("i1 = " + i1);   // 2
        System.out.println("i2 = " + i2);   // 1
        i2 = ++i1;                          // i2=3 , i1=3
        System.out.println("i1 = " + i1);   // 3
        System.out.println("i2 = " + i2);   // 3

        int ab = 5;
        System.out.println(ab);     // print-> 5 | ab=5
        System.out.println(ab++);   // print-> 5 | ab=6
        System.out.println(++ab);   // print-> 7 | ab=7
        System.out.println(ab);     // print-> 7 | ab=7
        System.out.println(ab++);   // print-> 7 | ab=8
        System.out.println(ab);     // print-> 8 | ab=8
        System.out.println(ab++);   // print-> 8 | ab=9
        System.out.println(ab++);   // print-> 9 | ab=10
        System.out.println(++ab);   // print-> 11 | ab=11
        System.out.println(ab++);   // print-> 11 | ab=12
        System.out.println(ab);     // print-> 12 | ab=12

        /**
         * decrement (--)
         *  post-decrement and pre-decrement
         *
         * --
         *  decrement the current value in variable by 1
         *  and the new value will be stored in the SAME variable.
         *
         * int b = 10;
         * b--;     --> post-decrement
         * --b;     --> pre-decrement
         */

        System.out.println("\nDecrementing....\n");

        int dec = 10;
        System.out.println(dec--);  // print -> 10 | dec = 9
        System.out.println(--dec);  // print -> 8 | dec = 8
        System.out.println(dec);    // print -> 8 | dec = 8

        int a= 10;
        System.out.println(a++);    // 10, a=11


    }

}

package Class3;

public class JavaOperators_AdvancedAssignment {


    public static void main(String[] args) {

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         * ++   -> increment by 1
         * --   -> decrement by 1
         *
         *
         * int num = 5;
         * using increment operator add 3 in num.
         *
         * num++        // 6
         * num++        // 7
         * num++        // 8
         * sout(num)    // 8
         *
         *
         * num+=3       // num = num + 3
         *
         *
         */

        int var1 = 10;

        var1+=5;    // var1 = var1 + 5
        System.out.println("var1 = " + var1);   // 15

        var1-=2;    // var1 = var1 - 2
        System.out.println("var1 = " + var1);   // 13

        var1*=10;   // var1 = var1 * 10
        System.out.println("var1 = " + var1);   // 130

        var1/=9;    // var1 = var1 / 9
        System.out.println("var1 = " + var1);   //  14

        var1%=9;    // var1 = var1 % 9
        System.out.println("var1 = " + var1);   // 5


    }

}

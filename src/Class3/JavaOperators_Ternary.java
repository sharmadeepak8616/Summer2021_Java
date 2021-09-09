package Class3;

public class JavaOperators_Ternary {


    public static void main(String[] args) {

        /**
         * Ternary Operator (?:)
         *
         * used in situation where you want to assign value to a variable
         * depending upon condition(s).
         *
         */

        /**
         * minimum credit score = 600
         * should be first time home buyer
         * when both conditions satisfy , mortgage rate = 2.0
         * else mortgage rate = 3.0
         *
         * cs = 700, not a first time buyer
         *
         *
         * int creditScore = 700
         * boolean isFirstTimeBuyer = false
         *
         *
         *
         */
        int creditScore = 500;
        boolean isFirstTimeBuyer = true;
        double mortgageRate =  creditScore>=600 || isFirstTimeBuyer ? 2.0 : 3.0;
        System.out.println("Mortgage rate : " + mortgageRate);


        int val = 19;
        int hour = 9;

        int result = hour >= 12 ? ++val : val++;
        System.out.println("result = " + result);   // 19
        System.out.println("val = " + val);         // 20

        char ini = 'a', lIni = 'A';
        int res1 = ini == lIni ? val : val--;
        System.out.println("res1 = " + res1);       // 20
        System.out.println("val = " + val);         // 19



    }

}

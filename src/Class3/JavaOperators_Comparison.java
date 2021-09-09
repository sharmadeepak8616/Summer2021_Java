package Class3;

public class JavaOperators_Comparison {


    public static void main(String[] args) {

        /**
         *  Comparison (>, >=, <, <=, ==, !=)
         *
         *  Result of any comparison operation is always a boolean value
         *
         */
        int com1 = 5, com2 = 7;
        /*
            int com1 = 5;
            int com2 = 7;
         */

        boolean com1GrCom2 = com1 > com2;   // greater than
        System.out.println(com1 + " > " + com2 + " = " + com1GrCom2);
        // 5 > 7 = false

        boolean com1GrEqCom2 = com1 >= com2;    // greater than or equal to
        System.out.println(com1 + " >= " + com2 + " = " + com1GrEqCom2);

        boolean com1LeCom2 = com1 < com2;       // less than
        System.out.println(com1 + " < " + com2 + " = " + com1LeCom2);

        boolean com1LeEqCom2 = com1 <= com2;      // less than or equal to
        System.out.println(com1 + " <= " + com2 + " = " + com1LeEqCom2);

        boolean com1EqCom2 = com1 == com2;       // is com1 equal to com2
        System.out.println(com1 + " == " + com2 + " = " + com1EqCom2);

        // != (not equal operator)
        boolean com1NtEqCom2 = com1 != com2;
        System.out.println(com1 + " != " + com2 + " = " + com1NtEqCom2);


        boolean res = com1++ == --com2;         // com1 = 5 , com2 = 7
        // --com2 -> com2=6
        // com1 == com2 -> 5 == 6 -> false
        // com1++ -> com1=6
        System.out.println("res : " + res);     // false
        System.out.println("com1 : " + com1);   // 6
        System.out.println("com2 : " + com2);   // 6




























    }

}

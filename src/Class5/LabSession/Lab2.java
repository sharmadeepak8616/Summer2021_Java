package Class5.LabSession;

public class Lab2 {
    public static void main(String[] args) {

        String sentence = "Happy world";

        /**
         * Find the length of value stored in sentence
         */
        System.out.println("length of sentence : " + sentence.length());    // 11 - using length method from String class

        // Find the length without using length method from String class
        /*
            Logic - 1
                1. find the last index of ""    // 11
         */
        int lastIndex_Nothing = sentence.lastIndexOf("");
        System.out.println("(Using last index) length of sentence : " + lastIndex_Nothing);

        /*
            Logic - 2
                1. using split("") create an array ["H", "a", "p", "p", "y", " ", "w", "o", "r", "l", "d"]
                2. find the length of step1 array
         */
        String[] sentenceArray = sentence.split("");
        System.out.println("(Using arrayLength) length of sentence : " + sentenceArray.length);

        /*

            balance


         */
        double balance = 25000;     // 25000.0
        double withdrawAmt = -30000;
        /*
            Withdraw is allowed when:
                1. withdrawal amount should be less than or equal to balance
                2. withdrawAmt must be greater than 0

         */
        balance = withdrawAmt <= balance && withdrawAmt > 0 ? balance-withdrawAmt : balance;   // 25000-(-30000) = 55000

        System.out.println("\nbalance : " + balance);


        String cName = "John Doe";
        double cBalance = 10000;

        String enteredName = "";
        double withDraw = 0;
        double deposit = 0;
        /**
         * Allow deposit/withdraw only if:
         *      1. enteredName is same as cName [equals-method(exact format) | equalsIgnoreCase(same value)]
         *      2. After the withdraw, balance amount cannot be less than $1,000
         *      3. satisfy basic requirements of withdraw/deposit
         *          withdraw:
         *              amt should be less or equals to balance-1000
         *              amt > 0
         *          deposit:
         *              amt > 0
         *
         */

        /*
            enteredName is same as cName
            amt should be less or equals to balance-1000
            amt > 0
         */
        cBalance = enteredName.equals(cName) && withDraw <= cBalance-1000 && withDraw > 0 ? cBalance-withDraw : cBalance;


        /*
            enteredName is same as cName
            amt > 0
         */
        cBalance = enteredName.equals(cName) && deposit > 0 ? cBalance+deposit : cBalance;

        /*

            var = condition(s) ? value1 : value2;
            sout(var)

         */




    }
}

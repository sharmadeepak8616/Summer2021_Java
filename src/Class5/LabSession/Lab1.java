package Class5.LabSession;

import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {


        // == (primitive datatypes)

        int num1 = 100;
        int num2 = 200;

        double balance = 9999.99;
        double withdrawAmt = 9000;
        balance = withdrawAmt <= balance && withdrawAmt > 0 ? balance - withdrawAmt : balance;
        System.out.println("balance: " + balance);
        /*
            requested amount should be less or equals to the account balance

            withdrawAmount should be greater than 0
            withdrawAmount should be less or equals to balance amount
            Allow customer to withdraw only if after withdraw, the balance is $1,000 or more
         */
        balance = 9000;
        withdrawAmt = 8000;

        System.out.println(balance != withdrawAmt);


        balance = withdrawAmt <= balance && withdrawAmt > 0 && balance-withdrawAmt >= 1000 ? balance - withdrawAmt : balance;
        System.out.println("\nbalance: " + balance);

        balance = withdrawAmt <= balance-1000 && withdrawAmt > 0 ? balance - withdrawAmt : balance;
        System.out.println("\nbalance: " + balance);



        /*
            if num1 is not equal to num2, print "Not equals"
            else print "equals"

         */

        String result = num1 == num2 ? "Equals" : "Not equals";
        System.out.println("Result --> " + result);


        char oneChar = 'a';
        char secChar = 'z';

        System.out.println(oneChar == secChar);     // should print value of boolean


        String sentence = "Happy World";

        // find the length of given string
        System.out.println("sentence length : " + sentence.length());   // length method from String class

        // find the length of String WITHOUT using length method from String class
        String [] Splitthesentence = sentence.split("");        // ["H", "a", "p", "p", "y", " ", "W", "o", "r", "l", "d"]
        int sentenceLength  = Splitthesentence.length;

        String sentence5 = "I like food";
        String[] sentence5Split = sentence5.split("");
        System.out.println(Arrays.toString(sentence5Split));
        int sentence5Length = sentence5Split.length;
        System.out.println(sentence5Length);




    }
}

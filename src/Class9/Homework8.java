package Class9;

import java.util.Arrays;

public class Homework8 {

    // Due : Aug 01, 2021

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));     // olleh

        System.out.println(reverseString("happy holidays"));     // syadiloh yppah
    }


    /**
     * Write a method to convert given string into Titlecase
     *
     * Input sentence = "happy new year TO You DeaR"
     * Final answer = "Happy New Year To You Dear"
     */

    /**
     * Write a method to reverse a String
     */
    public static String reverseString (String task3String){
        //String task3String = "happy holidays"; //Storing the backwards strings
        String reverse = "";
        for (int m = task3String.length() - 1; m >= 0; m--) {
            reverse = reverse + task3String.charAt(m);
        }
        // System.out.println(reverse);
        return reverse;
    }

    /**
     * Write a method which will return the result, if the given string is a Palindrome
     *
     * return type: boolean
     */

    /**
     * Write a method to return the average of a given int array
     *
     * Input array : {7, 10, 3, 6, 10}
     * ans : 7.2
     *
     */

    /**
     * Write a method to return the maximum value from a given int array
     *
     * Input array: {33, 54, 67, 19, 9, 52}
     * max : 67
     */






}

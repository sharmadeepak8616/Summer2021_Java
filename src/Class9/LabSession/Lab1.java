package Class9.LabSession;

import java.util.Arrays;

public class Lab1 {
    /**
     *
     *
     * level -> level
     * eye -> eye (Palindrome)
     * ear -> rae (not palindrome)
     */


    /**
     * Write code to reverse an int-array
     *
     * [22, 44, 66, 11, 33] -> [33, 11, 66, 44, 22]
     *
     * [22, 11, 33] -> [33, 11, 22]
     */
    public static int[] reverseArray(int[] arraynumbers){
        int[] reverseArray1 = new int[arraynumbers.length];

        /*
            reverseArray1[0] = arraynumbers[lastIndex-0]
            reverseArray1[1] = arraynumbers[lastIndex-1]
            reverseArray1[2] = arraynumbers[lastIndex-2]
            ...
            ...
            reverseArray1[lastIndex] = arraynumbers[lastIndex-lastIndex]


            reverseArray1[i] = arraynumbers[lastIndex-i]        // int i=0 ; i<=lastIndex ; i++     i=0,1,2,3...lastIndex
         */

        for(int i=0 ; i<arraynumbers.length ; i++) {
            reverseArray1[i] = arraynumbers[arraynumbers.length-1-i];
        }
        // System.out.println(Arrays.toString(reverseArray1));
        return reverseArray1;
    }

    /**
     * Write code to count the given alphabet in a string
     *
     * "A sentence is a set of words that is complete in itself, typically containing a subject and predicate."
     * s
     * 15
     *
     * "Kokekimes to understand a word's meaning you need more than a definition"
     * k
     * 0
     *
     */
    // Name: countSentence
    // input:
    // return type= string
    public static int countSentence (String anyString, char letterToFind) {
        int count = 0;
        /*
            if (char(0) == letterToFind)
                count++
            if (char(1) == letterToFind)
                count++
            if (char(2) == letterToFind)
                count++
                ...
                ...
            if (char(lastIndex) == letterToFind)
                count++



            if (char(i) == letterToFind)    // int i=0  ; i <= lastIndex ; i++ (0,1,2,3...lastIndex)
                count++
         */
        for (int i=0  ; i <= anyString.length()-1 ; i++) {
            if (anyString.charAt(i) == letterToFind) {          // how to find char at any index in a String
                count++;
            }
        }
        return count;
    }

    public static int countSentence (String anyString, String letterToFind) {
        int count = 0;
        String[] anyStringSplit = anyString.split(" ");

        for (int i=0  ; i < anyStringSplit.length ; i++) {
            if (anyStringSplit[i].toLowerCase().contains(letterToFind.toLowerCase())) {            // how to find char at any index in a String
                count++;
            }
        }
        return count;
    }


    /**
     * Write code to store values less than 10 in a separate array
     *
     * [90, 10, 3, 5, 7, 89] -> [3, 5, 7]
     *
     * [8, 11, 3, 45] -> [8, 3]
     *
     * [8, 11, 3, 45, 9, 2] -> [8, 3, 9, 2]
     *
     */
    public static int[] lessThanThisFromArray(int[] userArray, int lessThanThis) {

        int count = 0;
        for (int i=0 ; i < userArray.length ; i++) {
            if (userArray[i] < lessThanThis) {
                count++;
            }
        }
        int[] less10NumArray = new int[count];

        int index = 0;
        for (int i=0; i<userArray.length; i++) {
            if(userArray[i] < lessThanThis) {
                less10NumArray[index] = userArray[i];
                index++;
            }
        }
        return less10NumArray;
    }

    public static void main(String[] args) {
        int[] myNumbers = {8, 11, 3, 45, 9, 2};
        int lessThan = 20;
        int[] resultArray =  lessThanThisFromArray(myNumbers, lessThan);
        System.out.println("Given Array -> " + Arrays.toString(myNumbers));
        System.out.println("Array with values less than " + lessThan + " -> " + Arrays.toString(resultArray));
    }

    /**
     * Write code to remove #symbol and letters left and right of it.
     *
     * String = hello#dear#how#areyou -> helleaoreyou
     *
     */

    /**
     * Write code to find the number of different combinations of two-numbers (from given array) that can result into 10
     *
     * [8, 3, 4, 6, 2] -> [8,2 , 4,6] -> 2
     *
     * [5, 10, -2, 8, -5, 0] -> [10,0] -> 1
     *
     * [5, 10, -2, 8, -5, 0, 12, 13, 15] -> [10,0 , 12,-2, 15,-5] -> 3
     *
     */







































}

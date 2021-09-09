package Class17;

import java.util.ArrayList;
import java.util.List;

public class Homework11_Discussion {
    public static void main(String[] args) {
        String[] arr1 = {"happy", "King" , "HAPPY", "PEACeful"};
        String[] arr2 = {"king", "Peace", "HAppY", "connection", "learn"};

        System.out.println("common words -> " + findCommons(arr1, arr2));

        String[] words = {"happy", "peace", "laugh", "joy"};
        System.out.println("Repeated words -> " + findRepeatingValues(words));


    }

        // Due date: Aug 25 '21

        /**
         * Question 1:
         * Create a method that would return the common values between two given arrays
         *
         * ["happy", "King" , "HAPPY", "PEACE"]
         * ["king", "Peace", "happiness", "connection", "learn"]
         *
         * ["king", "peace"]
         *
         * ["happy", "Kingdom" , "HAPPY", "PEACeful"]
         * ["king", "Peace", "happiness", "connection", "learn"]
         *
         * []
         *
         */
        /*
            List<String> commonWords
            pick index-0-array-1
                pick index-0-array-2
                if (index-0-array-1 == index-0-array-2)
                    add index-0-array-1 in commonWords
                pick index-1-array-2
                if (index-0-array-1 == index-1-array-2)
                    add index-0-array-1 in commonWords
                pick index-2-array-2
                if (index-0-array-1 == index-2-array-2)
                    add index-0-array-1 in commonWords

            pick index-1-array-1
                pick index-0-array-2
                if (index-1-array-1 == index-0-array-2)
                    add index-1-array-1 in commonWords
                pick index-1-array-2
                if (index-1-array-1 == index-1-array-2)
                    add index-1-array-1 in commonWords
                pick index-2-array-2
                if (index-1-array-1 == index-2-array-2)
                    add index-1-array-1 in commonWords
         */
        public static List<String> findCommons(String[] arr1, String[] arr2) {
            List<String> commonWords = new ArrayList<>();
            for (String arr1Word : arr1) {
                for (String arr2Word : arr2) {
                    if (arr1Word.equalsIgnoreCase(arr2Word) && !commonWords.contains(arr1Word.toLowerCase())) {
                        commonWords.add(arr1Word.toLowerCase());
                    }
                }
            }
            return commonWords;
        }


        /**
         * Question 2:
         * Create a method that would return the values occurring more than 1 times in given array
         *  String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         *  ["happy", "joy" , "laugh"]
         *
         *
         *  String[] words = {"happy", "peace", "laugh", "joy"};
         *  []
         */
        /*
            List<String> repeatingValues

            index-0-value
                index-1-value
                if (index-0-value == index-1-value)
                    repeatingValues.add(index-0-value)
                index-2-value
                if (index-0-value == index-2-value)
                    repeatingValues.add(index-0-value)
                index-3-value
                if (index-0-value == index-3-value)
                    repeatingValues.add(index-0-value)
                index-4-value
                if (index-0-value == index-4-value)
                    repeatingValues.add(index-0-value)

            index-1-value
                index-2-value
                if (index-1-value == index-2-value)
                    repeatingValues.add(index-0-value)
                index-3-value
                if (index-1-value == index-3-value)
                    repeatingValues.add(index-0-value)
                index-4-value
                if (index-1-value == index-4-value)
                    repeatingValues.add(index-0-value)
         */
        public static List<String> findRepeatingValues(String[] arr) {
            List<String> repeatedValues = new ArrayList<>();
            for (int i=0 ; i < arr.length ; i++) {
                for (int j=i+1 ; j < arr.length ; j++) {
                    if (arr[i].equalsIgnoreCase(arr[j]) && !repeatedValues.contains(arr[i].toLowerCase())) {
                        repeatedValues.add(arr[i].toLowerCase());
                    }
                }
            }
            return repeatedValues;
        }

        /*
            {"happy", "peace", "laugh", "peace", "joy"};
            List<String> repeatedValues = new ArrayList<>();

            convert given array in to a List
            index-0-value
            if (indexOf(index-0-value) != lastIndexOf(index-0-value)) {
                repeatedValues.add(index-0-value);
            }
            index-1-value
            if (indexOf(index-1-value) != lastIndexOf(index-1-value)) {
                repeatedValues.add(index-1-value);
            }
            index-2-value
            if (indexOf(index-2-value) != lastIndexOf(index-2-value)) {
                repeatedValues.add(index-2-value);
            }
         */




        /**
         * Question 3:
         * Create a method that can print the count of given value in the given array
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * String word = "happy"
         *
         * output: 'happy' occurs N times in array.
         *
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * String word = "PEace"
         *
         * output: 'peace' occur only one time in array
         *
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * String word = "Helpful"
         *
         * output: 'Helpful' is not present in array
         */
        /*

            int counter = 0

            String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
            String word = "happy"

            if (words[0] == word)
                counter++
            if (words[1] == word)
                counter++
            if (words[2] == word)
                counter++
            if (words[3] == word)
                counter++
            if (words[4] == word)
                counter++

             for (int i=0 ; i < words.length ; i++) {
                if (words[i] == word) {         // i=0 ; i < words.length ; i++
                    counter++
                }
             }

         */



}

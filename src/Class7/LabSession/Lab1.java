package Class7.LabSession;

import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {

        String sixWordSentence = "happy new year TO You DeaR";

        String[] splitWords = sixWordSentence.split(" ");
        // ["happy", "new", "year", "TO", "You", "DeaR"]

        //System.out.println(Arrays.toString(splitWords));

        sixWordSentence = "";

        for (int i=0; i < splitWords.length-1; i++) {

            sixWordSentence = sixWordSentence + splitWords[i].substring(0, 1).toUpperCase()+splitWords[i].substring(1).toLowerCase() + " ";

            // System.out.println(splitWords[i].substring(0, 1).toUpperCase()+splitWords[i].substring(1).toLowerCase());
        }

        // sixWordSentence = "Happy New year To You Dear "

        // sixWordSentence = sixWordSentence.trim();    // "Happy New year To You Dear"

        /*
            Happy
            New
            Year
            To
            You
            Dear

         */


        /**
         * Count the number of times a given word is present in a given paragraph
         *
         */
        String paragraph = "Are you searching for Essay Writing Topics in English for various competitions and speeches for school events? Then you are on the right page here you will get all kinds of topics for essay writing in English. As we have gathered numerous essay topics in long and short forms for all classes students. Yes, what you heard is correct, this page is filled with Long essays for class 10, 9, 8, 7, and Short essays for class 6, 5, 4, 3, 2, 1. So, anyone can check out this Essay Writing in English Article on AplusTopper for school events & competitions. Moreover, you can also find 10 lines on the selected far topic in English for the speeches in school programs. These Ten lines in English will assists students and teachers at the time of school speeches on special events. Hence, students can refer to the below provided a massive list of essays in English and participate in any kind of events conducted by schools. For the sake of class 1 to 10 students, we have also covered 10 Lines and Essay on ‘My School’ in English and Hindi here.";
        String wordToSearch = "EngLISh";

        int count = 0;

        /*
            Pseudo Code:

            1. use split
            2. loop
                pick each word
                if word contains wordToSearch
                    count++
         */

        String[] myParagraphSplit = paragraph.split(" ");

        for(int i=0; i<myParagraphSplit.length; i++) {
            if(myParagraphSplit[i].toLowerCase().contains(wordToSearch.toLowerCase())) {
                count++;
            }
        }
        System.out.println(count);

        /**
         * Write code to reverse the given int-array
         *
         */
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        // reversedArray -> {55, 44, 33, 22, 11}
        /*
            1. int
            2a) same as original array
         */
        int[] reversedArray = new int[array.length];

        /*
            loop
                pick the last value from array and put in the 0th index of reversedArray

            reversedArray[0] = array[array.length-1]     // reversedArray[0] = array[4]
            reversedArray[1] = array[array.length-2]
            reversedArray[2] = array[array.length-3]
            reversedArray[3] = array[array.length-4]
            reversedArray[4] = array[array.length-5]

            reversedArray[i] = array[array.length-(i+1)]
            reversedArray[i] = array[array.length-i-1]


         */
        for (int i=0 ; i <= reversedArray.length-1 ; i++) {

        }


        for (int i =0 ; i < reversedArray.length ; i++) {
            // reversedArray[i] = array[array.length-1-i];
            reversedArray[i] = array[array.length-(i+1)];
        }
        System.out.println("\n\nGiven array -> " + Arrays.toString(array));
        System.out.println("Reversed array -> " + Arrays.toString(reversedArray));


        /**
         * Store the index of first three words which contains 'happy'
         *
         */
        String[] myWords = {"peace", "Happy", "grow", "happyness", "Help", "ListEN"};
        String searchWord = "help";
        int firstFew = 5;
        // expected: 1, 2, 3 (int[])
        /*
            1. int
            2a) 3
            2b)
         */
        int[] happyIndex = new int[firstFew]; // {0, 0, 0}
        // int[] happyIndex = {-1, -1, -1};
        for (int i=0 ; i<happyIndex.length ; i++) {
            happyIndex[i] = -1;
        }
        // int[] happyIndex = {-1, -1, -1};

         /*
            loop
                i=0
                if myWords[0] contains "happy"


                i=1
                if myWords[1] contains "happy"
                    happyIndex[0] = i;  // happyIndex = [1]
                    0+1

                i=2
                if myWords[2] contains "happy"

                i=3
                if myWords[2] contains "happy"
                    happyIndex[1] = i;  // happyIndex = [1, 2]
                    1+1

                i=4
                if myWords[3] contains "happy"
                    happyIndex[2] = i;  // happyIndex = [1, 2, 3]
          */
         int j=0;
         for (int i=0 ; j<firstFew && i < myWords.length ; i++) {

             if (myWords[i].toLowerCase().contains(searchWord.toLowerCase())) {
                 happyIndex[j] = i;
                 j++;
             }

         }
        System.out.println("\nGiven words -> " + Arrays.toString(myWords));
        System.out.println("Index of first "+ firstFew + " " + searchWord +" -> " + Arrays.toString(happyIndex));


        /**
         * Store the index of ALL 'happy' present in given array
         */
        String[] myWordsAgain = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};
        // expected ans --> [1, 3, 8]












    }
}

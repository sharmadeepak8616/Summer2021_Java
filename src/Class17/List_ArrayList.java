package Class17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {

        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};

        // create code to store all values from words-array into a List/ArrayList
        // wordsList = ["happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"]

        List<String> wordsList = new ArrayList<>();

//        wordsList.add(words[0]);
//        wordsList.add(words[1]);
//        wordsList.add(words[2]);
//        wordsList.add(words[3]);
//        wordsList.add(words[4]);
//        wordsList.add(words[5]);
//        wordsList.add(words[6]);
//        wordsList.add(words[7]);
//        wordsList.add(words[8]);    // i <= 8 ; i < 9


        /*
            convert an Array in to a List - Method-1
         */
//        for (int i=0 ; i < words.length ; i++) {
//            wordsList.add(words[i]);
//        }
//        System.out.println("wordsList -> " + wordsList);



        /*
            convert an Array in to a List - Method-2
         */
//        for (String word : words) {
//            wordsList.add(word);
//        }
//        System.out.println("wordsList -> " + wordsList);



        /*
            convert an Array in to a List - Method-3
         */
        List<String> wordsList3 = Arrays.asList(words);
        System.out.println("wordsList -> " + wordsList3);

    }
}

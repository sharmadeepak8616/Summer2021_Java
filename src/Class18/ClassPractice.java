package Class18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassPractice {
    public static void main(String[] args) {

        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(1111, "Happy");
        ssnData.put(2222, "peace");
        ssnData.put(3333, "John");
        ssnData.put(4444, "Dilya");
        ssnData.put(5555, "Happy");
        ssnData.put(6666, "harry");
        ssnData.put(7777, "john");
        ssnData.put(8888, "king kong");
        ssnData.put(9999, "love");
        ssnData.put(1010, "king");
        ssnData.put(1212, "prince");
        ssnData.put(1313, "morris");
        ssnData.put(8181, "godzilla");
        ssnData.put(9090, "anderson");
        ssnData.put(8989, "nikki");


        // print the ssnNumber where person name contains O (in uppercase/lowercase)
        /*
            3333
            7777
            8888
            9999
            1313
            8181
            9090


            keySet -> [1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, .....]

            1111
            get value for 1111 -> "Happy"
            if (("Happy"-lowercase).contains("o"-lowercase) -> true)
                print 1111

             2222
             get value for 2222 -> "peace"
             if ("peace"-lowercase).contains("o".lowercase)
                print -> 2222

         */
        String letterO = "O";
        Set<Integer> allKeys = ssnData.keySet();
        System.out.println("allKeys -> " + allKeys);

        for (Integer key : allKeys) {
            String value = ssnData.get(key);
            if (value.toLowerCase().contains(letterO.toLowerCase())) {
                System.out.println(key);
            }
        }

        // print the ssnNumber when name length is greater than 7
        /*
            keySet -> [1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, .....]

            1111
            get the value for 1111 -> "Happy"
            if ("Happy".length() > 7)
                sout(1111)


            2222
            get the value for 2222 -> "Peace"
            if ("Peace".length() > 7)
                sout(2222)

         */

        for (Integer key : allKeys) {
            String value = ssnData.get(key);
            if (value.length() > 7) {
                System.out.println(key);
            }
        }

        // Print the average of every student

        Map<Integer, Integer[]> scores = new HashMap<>();

        Integer[] student1Score = {90, 89, 98, 100, 78};
        Integer[] student2Score = {90, 99, 80, 86, 78};
        Integer[] student3Score = {90, 91, 91, 92, 90};
        Integer[] student4Score = {90, 91, 100, 92, 99};

        scores.put(101, student1Score);
        scores.put(102, student2Score);
        scores.put(103, student3Score);
        scores.put(104, student4Score);

        System.out.println("\n\nscores -> " + scores);

        /*
            keySet -> [101, 102, 103, 104]

            101
            get the value for 101 -> {90, 89, 98, 100, 78}
            // using for-loop find average
            print the average found in above step

            102
            get the value for 102 -> {90, 99, 80, 86, 78}
            //  using for-loop find average
            print the average found in above step


            103


            104


         */

        Set<Integer> studentIds = scores.keySet();

        for (Integer id : studentIds) {
            Integer[] studentScore = scores.get(id);
            double sum = 0;
            for (Integer score : studentScore) {    // {90, 89, 98, 100, 78}
                sum = sum + score;
            }
            System.out.println("Id : " + id + " -> Average : " + (sum/studentScore.length));
        }

























    }
}

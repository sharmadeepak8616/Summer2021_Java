package Class17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {

    public static void main(String[] args) {

        /**
         * Map can store a (key-value) pair in every index.
         *
         * { (key->val) , (key->val) , (key->val) , (key->val) , (key->val) , (key->val) }
         *
         *  --> Key is always UNIQUE in a map.
         *  --> Never maintains the order of insertion
         *
         * Syntax to create HashMap/Map
         *
         * HashMap<keyDatatypeClass,valueDatatypeClass> myHashMap = new HashMap<>();
         *      OR
         * Map<keyDatatypeClass,valueDatatypeClass> myMap = new HashMap<>();
         *
         * Wrapper class : class which represents the primitive datatypes.
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         */
        /**
         * ssn-numbers and names of people
         *
         * happy 1234
         * peace 9090
         * john 8790
         *
         * key -> ssn numbers   (Integer)
         * value -> names       (String)
         *
         */


        /**
         *  green, red, black, grey, yellow, white, brown, pink,
         *  blue,green, red, black, grey, yellow, white,
         *  brown, pink,blue,green, red, black, grey,
         *  yellow, white, brown, pink,blue,green, red,
         *  black, grey, yellow, white, brown, pink,blue,green,
         *  red, black, grey, yellow, white, brown, pink,blue,green,
         *  red, black, grey, yellow, white,blue,green,
         *  red, grey, yellow, white, brown, pink,blue,green,
         *  red, black, grey, yellow, pink,blue,green,
         *  red, black,yellow, white, brown, pink,blue,green,
         *  red, black, grey, yellow, white, brown,blue,
         *  red, black, grey, yellow, white, brown, pink,blue
         *
         * green = 10
         * red = 11
         * blue = 19
         * yellow = 11
         *
         */

        /**
         * 101 = A
         * 102 = B
         * 103 = A+
         * 104 = B-
         *
         * Integer, String
         * String, String
         *
         */

        /**
         * Store score of students in a variable.
         * every got the score for 5 subjects
         *
         * 101 = 90, 89, 98, 100, 78
         * 102 = 90, 99, 80, 86, 78
         *
         *
         * Integer -> int[]
         * String -> List<Integer>
         *
         * Integer -> List<Integer>
         * String -> int[]
         */
        Map<Integer,String> ssnData = new HashMap<>();

        /**
         * To add a pair in HashMap/Map
         * method: put()
         *
         */
        ssnData.put(1111, "Happy");
        ssnData.put(2222, "peace");
        ssnData.put(3333, "John");
        ssnData.put(4444, "Dilya");
        ssnData.put(5555, "Happy");

        System.out.println("ssnData -> " + ssnData);


    }
}

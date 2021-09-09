package Class18;

import java.util.*;

public class Map_HashMap {

    public static void main(String[] args) {

        /**
         * Map can store a (key-value) pair in every index.
         *
         * { (key->val) , (key->val) , (key->val) , (key->val) , (key->val) , (key->val) }
         *
         * { val1 , val2 , val3 , val4 }
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
         * Map<String, Integer> colorCount = new HashMap<>();
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
         * 103 = 90, 91, 91, 92, 90
         * 104 = 90, 91, 100, 92, 99
         *
         * int[] student1Score = {90, 89, 98, 100, 78};
         * int[] student2Score = {90, 99, 80, 86, 78};
         * int[] student3Score = {90, 91, 91, 92, 90};
         * int[] student4Score = {90, 91, 100, 92, 99};
         *
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
         * to calculate length of HashMap/Map
         * method: size()
         * return type: int
         */
        int ssnDataSize = ssnData.size();
        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnDataSize + "\n") ;


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
        ssnData.put(6666, "harry");
        ssnData.put(7777, "john");
        ssnData.put(8888, "king kong");
        ssnData.put(9999, "love");
        ssnData.put(1010, "king");
        ssnData.put(1212, "prince");
        ssnData.put(1313, "morris");
        ssnData.put(8888, "godzilla");
        ssnData.put(9090, "anderson");
        ssnData.put(8989, "nikki");

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");


        /**
         * Store score of students in a variable.
         * every got the score for 5 subjects
         *
         * 101 = 90, 89, 98, 100, 78
         * 102 = 90, 99, 80, 86, 78
         * 103 = 90, 91, 91, 92, 90
         * 104 = 90, 91, 100, 92, 99
         *
         * int[] student1Score = {90, 89, 98, 100, 78};
         * int[] student2Score = {90, 99, 80, 86, 78};
         * int[] student3Score = {90, 91, 91, 92, 90};
         * int[] student4Score = {90, 91, 100, 92, 99};
         *
         *
         *
         * Integer -> int[]
         * String -> List<Integer>
         *
         * Integer -> List<Integer>
         * String -> int[]
         */
        /*
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
         */

        /**
         * To remove a pair from HashMap/Map
         * Method: remove()
         *
         * usage:
         * 1. by providing the key
         * 2. by providing the pair
         *
         */

        /**
         * if using remove method as #1: by providing only the key-data
         *
         * if the given key is found
         *      java will remove the pair
         *      return the associated value
         * else
         *      return null
         *
         */
        String valueAssociatedWith_8980 = ssnData.remove(8980);   // Integer, String
        System.out.println("Pair removed, associated value with 8980: " + valueAssociatedWith_8980);

        String valueAssociatedWith_9090 = ssnData.remove(9090);   // Integer, String
        System.out.println("Pair removed, associated value with 9090: " + valueAssociatedWith_9090);

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /**
         * if using remove method as #2: by providing the pair to remove
         *
         * if the given pair is found
         *      java will remove the pair
         *      return true
         * else
         *      return false
         *
         */
        boolean is9090HappyRemoved = ssnData.remove(9090, "Happy");
        System.out.println("is '9090,happy' removed? : " + is9090HappyRemoved);

        boolean is6666HarryRemoved = ssnData.remove(6666, "Harry");
        System.out.println("is '6666,Harry' removed? : " + is6666HarryRemoved);

        boolean is6666harryRemoved = ssnData.remove(6666, "harry");
        System.out.println("is '6666,harry' removed? : " + is6666harryRemoved);

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /**
         * To get the value associated with a key
         * Method: get()
         *
         * if the given key is found
         *      java will return the associated value
         * else
         *      java will return null
         *
         */

        String valueWith_1010 = ssnData.get(1010);
        System.out.println("Value associated with key-1010 : " + valueWith_1010);

        String valueWith_101 = ssnData.get(101);
        System.out.println("Value associated with key-101 : " + valueWith_101);

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /*
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

        Integer[] scoreWith102 = scores.get(102);
        System.out.println(Arrays.toString(scoreWith102));
         */

        /**
         * To find if given data is present as one of the Keys
         * Method: containsKey()
         *
         * if the given data is present as one of the keys
         *      returns true
         * else
         *      returns false
         *
         */
        boolean is9090PresentAsKey = ssnData.containsKey(9090);
        System.out.println("is 9090 present as key? :  " + is9090PresentAsKey);

        boolean is7777PresentAsKey = ssnData.containsKey(7777);
        System.out.println("is 7777 present as key? :  " + is7777PresentAsKey);

        boolean is1313PresentAsKey = ssnData.containsKey(1313);
        System.out.println("is 1313 present as key? :  " + is1313PresentAsKey);

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /**
         * To find if given data is present as one of the Values
         * Method: containsValue()
         *
         * if the given data is present as one of the values
         *      returns true
         * else
         *      returns false
         *
         */
        boolean is_happy_Value = ssnData.containsValue("happy");
        System.out.println("is 'happy' present as value? : " + is_happy_Value);

        boolean is_god_Value = ssnData.containsValue("god");
        System.out.println("is 'god' present as value? : " + is_god_Value);

        boolean is_king_Value = ssnData.containsValue("king");
        System.out.println("is 'king' present as value? : " + is_king_Value);


        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /**
         * To get all the key-data in a variable
         * Method: keySet()
         *
         * return: Set
         *
         */
        // Map<Integer,String> ssnData = new HashMap<>();

        Set<Integer> allSsnKeys = ssnData.keySet();         // allSsnKeys -> [7777, 13131, 3333, 2222, 1111,....]
        System.out.println("All keys -> " + allSsnKeys);

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");


        /**
         * To get all the value-data in a variable
         * Method: values()
         *
         * return: Collection
         *
         */
        // Map<Integer,String> ssnData = new HashMap<>();

        Collection<String> allValues = ssnData.values();
        System.out.println("All values -> " + allValues);

        System.out.println("\nssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /**
         * To find if the HashMap/map is empty
         * method: isEmpty()
         *
         * if the HashMap/map is empty
         *      returns true
         * else
         *      returns false
         */
        boolean isSsnDataEmpty = ssnData.isEmpty();
        System.out.println("is ssnData empty? : " + isSsnDataEmpty);
        System.out.println("ssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");

        /**
         * To empty an HashMap/Map
         * method: clear()
         *
         */
        System.out.println("Clearing all pairs from HashMap/Map");
        ssnData.clear();

        boolean isSsnDataEmptyAfter = ssnData.isEmpty();
        System.out.println("\nis ssnData empty? : " + isSsnDataEmptyAfter);
        System.out.println("ssnData -> " + ssnData) ;
        System.out.println("ssnData size -> " + ssnData.size() + "\n");


    }
}

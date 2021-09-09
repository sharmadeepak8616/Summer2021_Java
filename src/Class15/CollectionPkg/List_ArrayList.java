package Class15.CollectionPkg;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {

        /**
         * Limitations of Array:
         *
         * 1. a) Total number of values that I want to store in array.
         *      int[] num = new int[11];
         *      OR
         *    b) All the values that I want to store in array.
         *      int[] num = {11, 22, 33, 44, 55};
         *
         * 2. Array length is fixed, we cannot increase/decrease the length on runtime.
         *
         * 3. Array can store only ONE datatype at one time.
         *
         */

        /**
         * Syntax to create ArrayList:
         *
         * ArrayList<datatypeClass> arrList = new ArrayList<>();
         *      OR
         * List<datatypeClass> myList = new ArrayList<>();
         *
         * Wrapper class : class which represents the primitive datatypes.
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         *
         * List/ArrayList is a dataype which can store multiple values.
         * It maintains the order of insertion.
         *
         *
         * arrList is variable of datatype ArrayList
         * myList is variable of datatype List
         *
         */

        // Create a List which can store String values.
        List<String> names = new ArrayList<>();     // names is a List which can store String values

        // Create a List to store temp values.
        List<Double> tempValues = new ArrayList<>();    // tempValues is a List which can store Double values

        /**
         * to calculate length of ArrayList/List
         * method: size()
         * return type: int
         */
        int namesLength = names.size();
        System.out.println("names --> " + names);                   // []
        System.out.println("names length --> " + namesLength);      // 0

        /**
         * To add data in arrayList.
         * method: add()
         *
         * -> new data goes to the next available index
         *
         */
        names.add("hApPY");         // ["hApPY"]
        names.add("peace".toUpperCase());         // ["hApPY", "peace"]
        names.add("groW");          // ["hApPY", "peace", "groW"]
        names.add("LEArn");         // ["hApPY", "peace", "groW", "LEArn"]
        names.add("hApPY");         // ["hApPY", "peace", "groW", "LEArn", "hApPY"]
        names.add("peace");         // ["hApPY", "peace", "groW", "LEArn", "hApPY", "peace"]
        names.add("Have fun");      // ["hApPY", "peace", "groW", "LEArn", "hApPY", "peace", "Have fun"]

        System.out.println("\nnames --> " + names);                     // ["hApPY", "peace", "groW", "LEArn", "hApPY", "peace", "Have fun"]
        System.out.println("names length --> " + names.size());         // 7




    }
}

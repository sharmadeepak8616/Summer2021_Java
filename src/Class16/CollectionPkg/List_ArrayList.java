package Class16.CollectionPkg;

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
         *  OR
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
        names.add("peace");         // ["hApPY", "peace"]
        names.add("groW");          // ["hApPY", "peace", "groW"]
        names.add("LEArn");         // ["hApPY", "peace", "groW", "LEArn"]
        names.add("hApPY");         // ["hApPY", "peace", "groW", "LEArn", "hApPY"]
        names.add("peace");         // ["hApPY", "peace", "groW", "LEArn", "hApPY", "peace"]
        names.add("peace");      // ["hApPY", "peace", "groW", "LEArn", "hApPY", "peace", "Have fun"]
        names.add("joyful");
        names.add("good morning");
        names.add("Have Fun");
        names.add("peace");
        names.add("Have fun");
        names.add("Have FUN");
        names.add("good morning");
        names.add("Have Fun");
        names.add("PeacE");
        names.add("HAVE FUn");
        names.add("good morning");
        names.add("Have Fun");
        names.add("PEACE");
        names.add("HAVE fun");


        System.out.println("\nnames --> " + names);                     // [hApPY, peace, groW, LEArn, hApPY, peace, peace, joyful, good morning, Have fun, peace, Have fun, Have fun]
        System.out.println("names length --> " + names.size());         // 13

        /**
         * To remove a value from ArrayList/List
         * Method: remove()
         *
         * usage:
         * 1. by providing the index value from which value to be removed
         * 2. by providing the value which needs to be removed
         *
         */

        /**
         * if using remove method as #1: by providing the index value from which value to be removed
         *
         * if the given index is greater than 0 and less than the length of arraylist
         *      java will remove the value and return the removed value to user
         * else
         *      IndexOutOfBoundsException
         *
         */
        // names -> [hApPY, peace, groW, LEArn, hApPY, peace, peace, joyful, good morning, Have fun, peace, Have fun, Have fun]

        // String removedValue_25 = names.remove(25);
        // System.out.println("\nRemoved value from index 25 : " + removedValue_25);

        String removedValue_5 = names.remove(5);
        System.out.println("\nRemoved value from index 5 : " + removedValue_5);
        System.out.println("\nnames --> " + names);                                 // [hApPY, peace, groW, LEArn, hApPY, peace, joyful, good morning, Have fun, peace, Have fun, Have fun]
        System.out.println("names length --> " + names.size()+"\n");                // 12

        /**
         * if using remove method as #2: by providing the value which needs to be removed
         *
         * if the value is found in the arraylist
         *      java will remove the FIRST occurrence of the value and returns true
         * else
         *      java will return false
         *
         */
        boolean is_Removed_Greetings = names.remove("Greetings");
        System.out.println("is 'Greetings' removed? : " + is_Removed_Greetings);
        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");

        boolean is_Removed_Have_Fun = names.remove("Have Fun");
        System.out.println("is 'Have Fun' removed? : " + is_Removed_Have_Fun);
        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");

        /**
         * To replace a value at specific index
         * method: set
         *
         * if the given index is greater than 0 and less than the length of arraylist/list
         *      java will replace the old-value with given value, and returns the old-value
         * else
         *      IndexOutOfBoundsException
         *
         */
        String replaceValue_index_1 = names.set(1, "peaceful days");
        System.out.println("Replace value at index-1: " + replaceValue_index_1);
        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");


//        String replaceValue_index_19 = names.set(19, "peaceful days");
//        System.out.println("Replace value at index-19: " + replaceValue_index_19);
//        System.out.println("\nnames --> " + names);
//        System.out.println("names length --> " + names.size()+"\n");

        // add, remove, replace, get
        /**
         * String[] names = {"hello", "hi", "bye", "texting", "calling"};
         *
         * // write code which can print the value at index-2
         * sout(names[2]);
         *
         */

        /**
         * To get the value at specific index
         * Method: get()
         *
         * if given index is greater than 0 and less than length of arraylist/list
         *      java will return the value at given index
         * else
         *      IndexOutOfBoundException
         *
         */
        String valueAt1 = names.get(1);
        System.out.println("Value at index-1: " + valueAt1);
        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");


//        String valueAt25 = names.get(25);
//        System.out.println("Value at index-25: " + valueAt25);
//        System.out.println("\nnames --> " + names);
//        System.out.println("names length --> " + names.size()+"\n");

        List<Double> temps = new ArrayList<>();
        temps.add(100.00);
        temps.add(190.9);
        temps.add(22.2);
        temps.add(100.00);
        temps.add(90.98);

        System.out.println("temps -> " + temps);
        /*
            print the data like,
            100.0
            190.9
            22.2
            100.0
            90.98
         */
//        System.out.println(temps.get(0));
//        System.out.println(temps.get(1));
//        System.out.println(temps.get(2));
//        System.out.println(temps.get(3));
//        System.out.println(temps.get(4));
        /*
            int i=0 ; i<temps.size() ; i++
         */
        for (int i=0 ; i < temps.size() ; i++) {
            System.out.println(temps.get(i));
        }

        // [hApPY, peaceful days, groW, LEArn, hApPY, peace, joyful, good morning, peace, Have fun, Have FUN, good morning, Have Fun, PeacE, HAVE FUn, good morning, Have Fun, PEACE, HAVE fun]

        String valueToRemove = "peace";
        /**
         * get index-0 value
         * if (index-0-value equals ignore to "peace")
         *      names.remove("peace")
         *
         * get index-1 vaule
         * if (index-1-value equals ignore to "peace")
         *      names.remove("peace")
         */


        // int i=0 ; i < names.size() ; i++
        for (int i=0 ; i < names.size() ; i++) {
            if (names.get(i).equalsIgnoreCase(valueToRemove)) {
                names.remove(names.get(i));
            }
        }

//        for (int i=0 ; i < names.size() ; i++) {
//            if (names.get(i).equalsIgnoreCase(valueToRemove)) {
//                names.remove(i);
//            }
//        }

        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");

        /**
         * To find the index of given value (of FIRST occurrence) in ArrayList/List
         * method: indexOf
         *
         * if the given value is found in ArrayList/List
         *      it will return the index of FIRST occurrence of the given value
         * else
         *      returns -1
         */
        // [hApPY, peaceful days, groW, LEArn, hApPY, joyful, good morning, Have fun, Have FUN, good morning, Have Fun, HAVE FUn, good morning, Have Fun, HAVE fun]

        int indexOf_good_morning = names.indexOf("good morning");
        System.out.println("Index of 'good morning' : " + indexOf_good_morning);

        int indexOf_Have_funn = names.indexOf("Have funn");
        System.out.println("Index of 'Have funn' : " + indexOf_Have_funn);

        /**
         * To find the last index of given value (of LAST occurrence) in ArrayList/List
         * method: lastIndexOf
         *
         * if the given value is found in ArrayList/List
         *      it will return the index of LAST occurrence of the given value
         * else
         *      returns -1
         */
        int lastIndexOf_good_morning = names.lastIndexOf("good morning");
        System.out.println("\nLast index of 'good morning' : " + lastIndexOf_good_morning);

        int lastIndexOf_Have_funn = names.lastIndexOf("Have funn");
        System.out.println("Last index of 'Have funn' : " + lastIndexOf_Have_funn);

        /**
         * Find the index of last occurrence of "happy" (ignoring cases)
         */
        // names --> [hApPY, peaceful days, groW, LEArn, hApPY, joyful, good morning, HappY, have fun, happy, HAppY, "joy"]    // 10
        /*
            lastHappyIndex = -1
            if (index0value == happy)
                lastHappyIndex = 0
            if (index1value == happy)
                lastHappyIndex = 0
            if (index2value == happy)
                lastHappyIndex = 0
            if (index4value == happy)
                lastHappyIndex = 4
            if (index5value == happy)
                lastHappyIndex = 4
            if (index7value == happy)
                lastHappyIndex = 7
            if (index8value == happy)
                lastHappyIndex = 7
            if (index9value == happy)
                lastHappyIndex = 9
            if (index10value == happy)
                lastHappyIndex = 10
            if (index11value == happy)
                lastHappyIndex = 10
         */
        int lastIndexOfValue = -1;
        for (int i=0 ; i < names.size() ; i++) {
            if (names.get(i).equalsIgnoreCase("have fun")) {
                lastIndexOfValue = i;
            }
        }
        System.out.println("\n\nLast index where 'have fun' found: " + lastIndexOfValue);

        /**
         * To find if the given value is present in the ArrayList/List
         * Method: contains()
         *
         * if the given value is present in the ArrayList/List
         *      returns true
         * else
         *      returns false
         */
        // names --> [hApPY, peaceful days, groW, LEArn, hApPY, joyful, good morning, Have fun, Have FUN, good morning, Have Fun, HAVE FUn, good morning, Have Fun, HAVE fun]
        boolean isContain_happy = names.contains("happy");
        System.out.println("\nis contains 'happy' : " + isContain_happy);


        boolean isContain_good_morning = names.contains("good morning");
        System.out.println("is contains 'good morning' : " + isContain_good_morning);

        /**
         * To find if the ArrayList/List is empty
         * method: isEmpty()
         *
         * if the arrayList/List is empty
         *      returns true
         * else
         *      returns false
         */
        boolean isNamesEmpty = names.isEmpty();
        System.out.println("\nis names empty? : " + isNamesEmpty);
        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");

        /**
         * To empty an ArrayList/List
         * method: clear()
         *
         */
        System.out.println("Clearing the names list");
        names.clear();


        boolean isNamesEmpty_afterClear = names.isEmpty();
        System.out.println("\nis names empty after clear-method? : " + isNamesEmpty_afterClear);
        System.out.println("\nnames --> " + names);
        System.out.println("names length --> " + names.size()+"\n");


    }
}

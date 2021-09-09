package Class17;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {

        /**
         * Set: is a datatype which can store multiple values, BUT NO duplicate values.
         *
         * Hashing is technique to use memory space efficiently.
         *
         *
         * HashSet/Set vs ArrayList/List
         *  1. ArrayList/List maintains the order of insertion
         *      HashSet/Set does not maintain the order of insertion.
         *
         *  2. ArrayList/List can store duplicate values
         *      HashSet/Set does not store duplicate values.
         *
         * Syntax to create HashSet/Set
         *
         * HashSet<datatypeClass> myHashSet = new HashSet<>();
         *      OR
         * Set<datatypeClass> mySet = new HashSet<>();
         *
         * Wrapper class : class which represents the primitive datatypes.
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         *
         */

        Set<Double> mortgageRates = new HashSet<>();

        /**
         * to calculate length of HashSet/Set
         * method: size()
         * return type: int
         */
        int mortgageRatesLength = mortgageRates.size();

        System.out.println("Mortgage rates : " + mortgageRates);                // []
        System.out.println("Mortgage rates length : " + mortgageRatesLength);   // 0

        /**
         * To add data in HashSet/Set
         * method: add()
         *
         */
        mortgageRates.add(1.1);
        mortgageRates.add(2.2);
        mortgageRates.add(1.1);
        mortgageRates.add(3.3);
        mortgageRates.add(43.2);
        mortgageRates.add(6.4);
        mortgageRates.add(2.0);
        mortgageRates.add(32.1);
        mortgageRates.add(21.1);
        mortgageRates.add(2.9);
        mortgageRates.add(90.0);
        mortgageRates.add(100.3);

        System.out.println("\nMortgage rates : " + mortgageRates);                 // [2.0, 6.4, 2.9, 90.0, 100.3, 1.1, 2.2, 3.3, 32.1, 43.2, 21.1]
        System.out.println("Mortgage rates length : " + mortgageRates.size()+"\n");   // 11

        /**
         * To remove a value from HashSet/Set
         * Method: remove()
         *
         * usage:
         * 1. by providing the value which needs to be removed
         *
         * if the value is found in the hashSet/Set
         *      java will remove the value and returns true
         * else
         *      java will return false
         *
         */
        // mortgageRates -> [2.0, 6.4, 2.9, 90.0, 100.3, 1.1, 2.2, 3.3, 32.1, 43.2, 21.1]

        boolean is2_9Removed = mortgageRates.remove(2.9);
        System.out.println("is 2.9 removed successfully? : " + is2_9Removed);

        boolean is2_9Removed1 = mortgageRates.remove(2.9);
        System.out.println("is 2.9 removed successfully? : " + is2_9Removed1);

        boolean is100_9Removed1 = mortgageRates.remove(100.9);
        System.out.println("is 100.9 removed successfully? : " + is100_9Removed1);

        System.out.println("\nMortgage rates : " + mortgageRates);                      // [2.0, 6.4, 2.9, 90.0, 100.3, 1.1, 2.2, 3.3, 32.1, 43.2, 21.1]
        System.out.println("Mortgage rates length : " + mortgageRates.size()+"\n");     // 10

        /**
         * To find if the given value is present in the HashSet/Set
         * Method: contains()
         *
         * if the given value is present in the HashSet/Set
         *      returns true
         * else
         *      returns false
         */
        // // [2.0, 6.4, 2.9, 90.0, 100.3, 1.1, 2.2, 3.3, 32.1, 43.2, 21.1]
        boolean is21_1Contains = mortgageRates.contains(21.1);
        System.out.println("is 21.1 contains : " + is21_1Contains);

        boolean is32_2Contains = mortgageRates.contains(32.2);
        System.out.println("is 32.2 contains : " + is32_2Contains);

        boolean is32_1Contains = mortgageRates.contains(32.1);
        System.out.println("is 32.1 contains : " + is32_1Contains);

        System.out.println("\nMortgage rates : " + mortgageRates);                      // [2.0, 6.4, 2.9, 90.0, 100.3, 1.1, 2.2, 3.3, 32.1, 43.2, 21.1]
        System.out.println("Mortgage rates length : " + mortgageRates.size()+"\n");     // 10

        /**
         * To find if the HashSet/Set is empty
         * method: isEmpty()
         *
         * if the HashSet/Set is empty
         *      returns true
         * else
         *      returns false
         */
        boolean isMortgageRatesEmpty = mortgageRates.isEmpty();
        System.out.println("is MortgageRates empty : " + isMortgageRatesEmpty);
        System.out.println("\nMortgage rates : " + mortgageRates);                      // [2.0, 6.4, 2.9, 90.0, 100.3, 1.1, 2.2, 3.3, 32.1, 43.2, 21.1]
        System.out.println("Mortgage rates length : " + mortgageRates.size()+"\n");     // 10

        /**
         * To empty an HashSet/Set
         * method: clear()
         *
         */
        System.out.println("Clearing all values from mortgageRates Set\n");
        mortgageRates.clear();

        System.out.println("is MortgageRates empty : " + mortgageRates.isEmpty());
        System.out.println("\nMortgage rates : " + mortgageRates);                      // []
        System.out.println("Mortgage rates length : " + mortgageRates.size()+"\n");     // 0















    }
}

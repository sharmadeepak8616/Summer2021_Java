package Class9.LabSession;

public class Lab2 {
    /*

     */

    int a = 10;


//    public static void main(String[] args) {
//        int a = 5;
//        System.out.println(a);
//    }

    public void sayHello() {
        System.out.println(a);
    }


    /**
     * write a method to add all values from a given int-array
     * <p>
     * [1, 2, 3, 4, 5] -> 1+2+3+4+5 -> 15
     * <p>
     * [11, 22] -> 11+22 -> 33
     */
    /*
        name : addValues
        input : 1 (int[])
        return type : int
     */
    // <access-modifier> [static] <void|returnType> <methodName> (blank|create variables based on number of inputs required by user) {
    public static int addValues (int[] userArray) {
        // int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i<userArray.length; i++) {
            sum = sum + userArray[i];
        }
        //System.out.println("The value of all the numbers is :" + sum);
        return sum;
    }

    /**
     * Write method to find if the given string contains a given alphabet
     *
     * "At YourDictionary, we give you the tools to learn"
     * S
     *  true
     *
     * "With our sentence examples, seeing a word within the context"
     * Y
     *  false
     *
     * "simple to complex"
     * A
     *  false
     *
     * "simple to complex"
     * C
     *  true
     *
     *
     */
    /*
        name : findAlph
        input : 2 (String, String)
        return type : boolean
     */
    public static boolean findAlph (String userString, String checkThis) {
//        boolean result = userString.toLowerCase().contains(checkThis.toLowerCase());
//        return result;

        return userString.toLowerCase().contains(checkThis.toLowerCase());

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int arrSum = addValues(arr);
        System.out.println("Sum = " + arrSum);

        int[] arr2 = {11, 33};
        int arrSum2 = addValues(arr2);
        System.out.println("Sum = " + arrSum2);

        String str1 = "At YourDictionary, we give you the tools to learn";
        boolean str1Result = findAlph(str1, "S");
        System.out.println("\nstr1 -> " + str1);
        System.out.println("is above string contains 'S' -> " + str1Result);


        String str2 = "simple to complex";
        boolean str2Result = findAlph(str2, "A");
        System.out.println("\nstr2 -> " + str2);
        System.out.println("is above string contains 'A' -> " + str2Result);

    }





}



















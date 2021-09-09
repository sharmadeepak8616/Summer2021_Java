package Class10.ClassConcept;

public class MyHomework {

    /**
     * method - static or non-static
     *
     * To use static method, user need to use the class-name (in which method is present)
     *
     * To use non-static method, user need to use the object of the class (in which method is present)
     *
     * Syntax of creating an object of a class
     * <className> <variableName> = new <className>();
     *
     *
     */



    public static void main(String[] args) {

        // Reverse a string
        String reversed = MyStringMethods.reverseString("hello");
        System.out.println("Reverse : " + reversed);

        MyStringMethods.toTitleCase("haPPy nEW Year");

        // find average of an int-array
        int[] numbers = {1, 2, 3, 4, 5, 6};
        double avg = MyArrayMethods.findArrayAverage(numbers);
        System.out.println("avg : " + avg);

        // check if "hello" is palindrome
        /*
            use isStringPalindrome from MyStringMethods class
            bcz, isStringPalindrome is non-static
            1. create object of MyStringMethods (if not already created in the scope)
            2. use object to access any non-static method/variable from MyStringMethods
         */
        MyStringMethods strMethods = new MyStringMethods();
        boolean isPalindrome = strMethods.isStringPalindrome("hello");
        System.out.println("is 'hello' a palindrome? : " + isPalindrome);

        // find max from {22, 55, 34, 87, 11}
        /*
            use findMaxFromArray from MyArrayMethods class
            bcz, findMaxFromArray is non-static
            1. create object of MyArrayMethods (if not already created in the scope)
            2. use object to access any non-static method/variable from MyArrayMethods
         */
        int[] myNumbers = {22, 55, 34, 87, 11};
        MyArrayMethods arrayMethods = new MyArrayMethods();
        int maxNum = arrayMethods.findMaxFromArray(myNumbers);
        System.out.println("Max from array : " + maxNum);


        // if "eye" is a palindrome
        /*
            use isStringPalindrome from MyStringMethods class
            bcz, isStringPalindrome is non-static
            1. create object of MyStringMethods (if not already created in the scope)
            2. use object to access any non-static method/variable from MyStringMethods
         */
        System.out.println(strMethods.isStringPalindrome("eye"));

        // create abbreviation for hAppy nEW YEar
        /*
            use createAbbreviation from MyStringMethods class
            bcz, createAbbreviation is non-static
            1. create object of MyStringMethods (if not already created in the scope)
            2. use object to access any non-static method/variable from MyStringMethods
         */
        System.out.println(strMethods.createAbbreviation("hAppy nEW YEar"));


    }





}

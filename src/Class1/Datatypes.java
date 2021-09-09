package Class1;

public class Datatypes {

    public static void main(String[] args) {    // psvm

        /**
         * Data                                 Variables Types (Datatypes)
         * numbers
         *      whole                   ->      byte, short, int, long
         *      decimal                 ->      float, double
         *
         * text
         *      single-character        ->      char
         *      multiple-character      ->      String
         *
         * yes/no
         *      true/false              ->      boolean
         *
         *
         * How many datatypes we have in Java?
         * 2 Types of data types:
         * a) Primitive
         *      byte, short, int, long, float, double, char, boolean
         *
         * b) Non-Primitive
         *      String, Array, User defined Class, Interface
         *
         *
         * Why do we need variables?
         *      To store data/info.
         *
         * IMP: type of data must be SAME as datatype of the variable.
         *
         * Syntax to create a variable:
         *      datatype variableName;  // creates variable (name = variableName) of datatype type.
         *      variableName = value;   // storing value in variableName variable.
         *
         *      -- OR --
         *
         *      datatype variableName = value;
         *
         *      // write code to create float variable of name as fVar?
         *      float fVar;
         *      // fVar is the variable name
         *      // float is the datatype of fVar variable
         *
         *      // Write code to store the number of cars in sam's house (sam has 4 cars)
         *      int samCarCount = 4;
         *
         * Good Practices to provide names:
         * 1. variables:
         *      -> names cannot have spaces
         *      -> variable name should relate to the stored value
         *      -> starts with lowercase
         *      -> never starts with digit or special character
         *      -> should always follow camelCaseFormat     // camel case format  ->  camelcaseformat -> camelCaseFormat
         *      eg: number of cars -> numberofcars -> numberOfCars
         *
         * 2. Class:
         *      -> names cannot have spaces
         *      -> class name should relate to the stored value
         *      -> starts with Uppercase
         *      -> never starts with digit or special character
         *      -> should always follow camelCaseFormat     // camel case format  ->  camelcaseformat -> CamelCaseFormat
         *
         * 3. Package:
         *      -> names cannot have spaces
         *      -> class name should relate to the stored value
         *      -> starts with Uppercase
         *      -> never starts with digit or special character
         *      -> should always follow camelCaseFormat     // camel case format  ->  camelcaseformat -> CamelCaseFormat
         */

        /**
         * Primitive
         *      byte, short, int, long, float, double, char, boolean
         */

        /**
         * byte: is a primitive datatype.
         * can store only whole numbers ranging from -128 to 127
         */
        // storing my age in a variable
        byte myAge = 20;
        // what is the datatype of myAge variable --> byte
        // storing the value (20) in the variable.

        // change the value in the variable (myAge) to 22
        myAge = 22;


        /**
         * short:  is a primitive datatype.
         * can store only whole numbers ranging from -32,768 to 32,767
         */
        short numDaysInYear = 366;
        short year = 2022;

        // store number of cars Sam is having (Sam is having 4 cars)
        short samCarsCount = 4;

        // to print the value of any variable in console.
        // you put the variable in the sout statements, without the double-quote
        System.out.println(numDaysInYear);

        System.out.println("There are 365 days in 2021");

        System.out.println("There are " + numDaysInYear + " days in " + year);
        /*
         System.out.println("There are " + numDaysInYear + " days in " + year);

         There are 365 days in 2021

         */



    }


}

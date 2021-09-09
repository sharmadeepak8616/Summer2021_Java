package Class3;

public class String_Concept {

    public static void main(String[] args) {

        /**
         *
         * Non-Primitive
         *      String, Array, User-defined-Class, User-defined-Interface
         *
         *
         * String: is a non-primitive datatype.
         *  can store single or multiple characters.
         *  To store the value as String, value must be within double-quotes.
         *
         * --> String is a class.
         *
         */

        String myWords = "Happy Peace";
        System.out.println("My words are : " + myWords);

        String singles = "   a  b  cd ef   gh  i  ";
        String info = "Value in singles variable --> ";
        int num = 10;
        System.out.println(info + num + singles);
        // Value in singles variable --> 10   a  b  cd ef   gh  i

        String firstLetter = "A";

        // myWords = "Happy Peace"
        myWords = myWords + "Laugh grow";   // "Happy Peace" + " Laugh grow" --> "Happy Peace Laugh grow"

        System.out.println(myWords);


        // String cityName = "neW yOrK";
        /**
         * neW yOrK
         * 01234567
         *
         * startIndex = 0
         * lastIndex = 7
         * length = 8
         *
         */
        String name = "Deepak Sharma";  // deepak sharma
        /**
         * Deepak Sha r m  a
         * 012345678910 11 12
         *
         * startIndex=0
         * lastIndex=12
         * length=13
         *
         * index is ALWAYS int
         * lastIndex = length - 1
         *
         */


        String cityName = "neW yOrK";
        /**
         * To find the length of a given String
         * method: length()
         */
        int cityNameLength = cityName.length();
        System.out.println("\nLength of '" + cityName + "' is : " + cityNameLength);

        /**
         * To convert the string into all lowercase
         * method: toLowercase()
         *
         * This method is NOT going to change the original value.
         * It will convert the value in lowercase, and return the result to user.
         *
         */
        // String cityName = "neW yOrK";
        String cityNameInLowercase = cityName.toLowerCase();
        /*
            converting the value in cityName to lowercase
            and, storing the all-lowercase value in NEW variable (cityNameInLowercase)
         */
        System.out.println("\nCity name in lowercase : " + cityNameInLowercase);
        System.out.println("City name : " + cityName);


        // cityName = cityName.toLowerCase();
        /*
            converting the value in cityName to lowercase
            and, replacing the original value with the all-lowercase value
         */
        // System.out.println("City name : " + cityName);

    }
}

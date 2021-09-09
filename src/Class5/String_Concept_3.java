package Class5;

import java.util.Arrays;

public class String_Concept_3 {

    public static void main(String[] args) {

        /**
         * To fetch a portion from a String using index values
         * method: subString()
         * return type: String
         *
         * "new YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA";
         *
         * give me portion from index 0 to 5(do not count 5) --> "new Y"
         *
         * give me portion from index 1 to 2(do not count 2) --> "e"
         *
         * give me portion from index 1 --> "ew YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA"
         *
         * give me portion from index 2 to 2005(do not count 2005) -->
         *
         * #1
         * input is begin index:
         *      if beginIndex is valid (within the index range)
         *          returns the string from beginIndex to end of the string
         *      else
         *          StringIndexOutOfBoundsException
         *
         * #2
         * input is begin index and endIndex:
         *      if beginIndex and endIndex are valid (within the index range)
         *          returns the string from beginIndex to endIndex-1 (we don't count endIndex)
         *      else
         *          StringIndexOutOfBoundsException
         *
         *
         * It will NOT change the original value.
         *
         *
         */
        String cityName = "new YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA";

        String cityName_0To5 = cityName.substring(0, 5);
        System.out.println("\nCityname : " + cityName);
        System.out.println("cityName_0To5 : " + cityName_0To5);


        String cityName_1To2 = cityName.substring(1, 2);
        System.out.println("cityName_1To2 : " + cityName_1To2);


        String cityName_1 = cityName.substring(1);
        System.out.println("cityName_1 : " + cityName_1 );

        // String cityName_2To2005 = cityName.substring(2, 2005);
        // System.out.println("cityName_2To2005 : " + cityName_2To2005);


        /**
         * "new york in the best city in the world"
         *
         * To cut the string form a specific point into multiple string values
         * method: split()
         * return type: String[]
         */

        cityName = "new york city is the best cIty in the world";

        String[] cityName_split_i = cityName.split("i"); // "["new york c", "ty ", "s the best cIty ", "n the world"]

        System.out.println("Array after split by 'i' : " + Arrays.toString(cityName_split_i));

        System.out.println("!"+cityName_split_i[1]+"!");

        String[] cityName_split_space = cityName.split(" ");    // [new, york, city, is, the, best, cIty, in, the, world]
        System.out.println("Array after split by ' ' : " + Arrays.toString(cityName_split_space));

        String[] cityName_split_Nothing = cityName.split("");   // ["n", "e", "w", " ", "y", "o", "r",.......]
        System.out.println("Array after split by '' : " + Arrays.toString(cityName_split_Nothing));























    }
}

package Class4;

public class String_Concept_2 {

    public static void main(String[] args) {

        String cityName = "neW yOrK";
        /**
         * To convert the string into all Uppercase
         * method: toUppercase()
         * return type: String
         *
         * This method is NOT going to change the original value.
         * It will convert the value in uppercase, and return the result to user.
         *
         */
        // String cityName = "neW yOrK";
        String cityNameInUppercase = cityName.toUpperCase();
        /*
            converting the value in cityName to uppercase
            and, storing the all-uppercase value in NEW variable (cityNameInUppercase)
         */
        System.out.println("\nCity name in uppercase : " + cityNameInUppercase);
        System.out.println("City name : " + cityName);


        // cityName = cityName.toUpperCase();
        /*
            converting the value in cityName to uppercase
            and, replacing the original value with the all-uppercase value
         */
        // System.out.println("City name : " + cityName);

        System.out.println(cityName.toUpperCase());



        /**
         * For comparison, when we need to verify if two Strings are identical.
         * method: equals()
         * return type: boolean
         *
         *
         * "New York"
         * "New York"
         *
         */
        /*
            cityName = "neW yOrK";
            cityNameInUppercase = "NEW YORK";
         */
        boolean isEqual = cityName.equals(cityNameInUppercase);
        System.out.println("\nis " + cityName + " equals to " + cityNameInUppercase + "? : " + isEqual);


        /**
         * For comparison, when we need to verify if two Strings have same value (while ignoring the cases)
         * method: equalsIgnoreCase()
         * return type: boolean
         *
         *
         * "New York"
         * "new YorK"
         *
         *
         *
         *
         */
        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityNameInUppercase);
        System.out.println("is " + cityName + " equals to (ignore cases) " + cityNameInUppercase + "? : " + isEqualIgnoreCase);

        String abc = "happy land";
        String def = "happy    land";
        System.out.println(abc.equalsIgnoreCase(def));  // false

        /**
         * "happy peace world"
         *
         *
         * "abc" - false
         * "ace" - true
         * "aCe" - false
         *
         * To find if a particular sequence is EXACTLY present in the given String
         * method: contains()
         * return type: boolean
         *
         *
         * cityName = neW yOrK
         *
         */
        boolean isContains_new = cityName.contains("new");
        System.out.println("\nis " + cityName + " contains 'new'? : " + isContains_new);

        /**
         * Task: verify is cityName (neW yOrK) contains "NeW"
         * note: pls ignore the cases
         * expected ans: true
         */
        /*
            -- Pseudo Coding --
            convert cityname into uppercase (toUppercase)   -> NEW YORK
            convert "NeW" into Uppercase                    -> NEW
            check cityName contains NEW (contains)
         */
        // cityName = "neW yOrK" , searchFor = "w yo"
        String cityName_Uppercase = cityName.toUpperCase();     // NEW YORK
        String stringToCheck_Uppercase = "w yo".toUpperCase();  // W YO
        boolean isContains = cityName_Uppercase.contains(stringToCheck_Uppercase);
        System.out.println(isContains);

        System.out.println(cityName.toUpperCase().contains("w yo".toUpperCase()));

        /**
         * To replace a string in a given string
         * method: replace()
         * return type: String
         *
         * This method doesn't change the original value
         * it will replace the data, and returns a new String
         *
         * It will replace all the instances.
         *
         */

        String news = "Power SURGES from lightning can damage comPUtErs, monitors and TVs, and CausE sparks that might start a fire.";
        String newsAfterReplace_e_XXX = news.replace("e", "XXX");   // PowXXXr surgXXXs from .......

        System.out.println(newsAfterReplace_e_XXX);     // PowXXXr surgXXXs from .......
        System.out.println(news);                       // "Power surges from lightning

        /*
            Please replace all instances of e/E with XXX
            1. convert news into lowercase
            2. replace e with XXX

         */
        System.out.println(news.toLowerCase().replace("e", "XXX"));

        // cityName = "neW yOrK";
        System.out.println(cityName.replace("W ", "w york city"));     // new york cityOrK

        /**
         * To find the char present at a particular given index
         * method: charAt()
         * return type: char
         *
         * cityName = "neW yOrK";
         * n e W   y O r K
         * 0 1 2 3 4 5 6 7
         *
         * If given index is within the index-range, it will return the char at given index
         * else, it will throw Exception (StringIndexOutOfBoundsException)
         *
         */

        char charAtIndex4 = cityName.charAt(4);
        System.out.println("\nIn '" + cityName + "' char at index-4: " + charAtIndex4);

//        char charAtIndex1 = cityName.charAt(10);
//        System.out.println("\nIn '" + cityName + "' char at index-1: " + charAtIndex1);

        /**
         * task: Write a code to print the char present at last index of the string
         * String str = "Hello World"
         */
        /*
            Pseudo
            1. length of str
            2. using length value, find lastIndex value (len - 1)
            3. use lastIndex with charAt
         */
        String str = "Hello world, have a great day";
        int strLength = str.length();
        int lastIndex = strLength - 1;
        System.out.println(str.charAt(lastIndex));

        System.out.println(str.charAt(str.length()-1));


        /**
         * To find the index of FIRST OCCURRENCE of the given value
         * method: indexOf()
         * return type: int
         *
         * "new YoRk city is the best town in the world"
         *
         * "n"
         * index of "n" is 0
         *
         * index of "N" is -1
         *
         * if the given value is found in the string,
         *      will return the index of FIRST occurrence of the given value
         * else
         *     will return -1
         */
        String newCityName = "new YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA";
        int indexOf_N = newCityName.indexOf("N");  // -1
        System.out.println("\nIndex of 'N' in '" + newCityName + "' is : " + indexOf_N);

        int indexOf_ew = newCityName.indexOf("ew");
        System.out.println("Index of 'ew' in '" + newCityName + "' is : " + indexOf_ew);

        int indexOf_or = newCityName.indexOf("or");
        System.out.println("Index of 'or' in '" + newCityName + "' is : " + indexOf_or);

        int indexOf_n = newCityName.indexOf("n");
        System.out.println("Index of 'n' in '" + newCityName + "' is : " + indexOf_n);

        /**
         * To find the index of LAST OCCURRENCE of the given value
         * method: lastIndexOf()
         * return type: int
         *
         * "new YoRk city is the best town in the world"
         *
         * "n"
         * index of last "n" is 15
         *
         * index of last "N" is -1
         *
         * if the given value is found in the string,
         *      will return the index of LAST occurrence of the given value
         * else
         *     will return -1
         */
        // String newCityName = "new YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA";

        int lastIndexOf_n = newCityName.lastIndexOf("n");
        System.out.println("\nLast index of 'n' in '" + newCityName + "' is : " + lastIndexOf_n);

        int lastIndexOf_or = newCityName.lastIndexOf("or");
        System.out.println("Last index of 'or' in '" + newCityName + "' is : " + lastIndexOf_or);

        /**
         * To find if the String starts with a given value
         * method: startsWith()
         * return type: boolean
         *
         * newCityName = "new YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA";
         *
         * does it start with "N"? : false
         * does it start with "new"? : true
         */
        boolean isStartsWith_N = newCityName.startsWith("N");
        System.out.println("\nis '" + newCityName + "' starts with 'N'? : " + isStartsWith_N);

        boolean isStartsWith_new = newCityName.startsWith("new");
        System.out.println("is '" + newCityName + "' starts with 'new'? : " + isStartsWith_new);

        /**
         * To find if the String ends with a given value
         * method: endsWith()
         * return type: boolean
         *
         * newCityName = "new YoRk CiTY is ThE BeSt town in the world, and In the AMEriCA";
         *
         * does it end with "N"? : false
         * does it end with "new"? : false
         * does it end with "a"? : false
         * does it end with "ICA"? : false
         * does it end with "riCA"? : true
         */
        boolean isEndsWith_new = newCityName.endsWith("N");
        System.out.println("\nis '" + newCityName + "' ends with 'N'? : " + isEndsWith_new);

        boolean isEndsWith_ICA = newCityName.endsWith("ICA");
        System.out.println("is '" + newCityName + "' ends with 'ICA'? : " + isEndsWith_ICA);

        boolean isEndsWith_riCA = newCityName.endsWith("riCA");
        System.out.println("is '" + newCityName + "' ends with 'riCA'? : " + isEndsWith_riCA);

        /**
         * To remove spaces from the beginning (before the first character in string)
         *      and from the end (after the last character in the string)
         * method: trim()
         * return type: String
         *
         * This method will not change the original value.
         *  it will remove extra spaces and return the new String
         *
         */
        String myCity = "      new        york    city is the      best city   in the world   ";

        String myCityTrim = myCity.trim();  // "new        york    city is the      best city   in the world"

        System.out.println("\n#"+myCity+"#");
        System.out.println("#"+myCityTrim+"#");







    }




}

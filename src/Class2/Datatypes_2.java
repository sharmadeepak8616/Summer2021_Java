package Class2;

public class Datatypes_2 {

    public static void main(String[] args) {

        /**
         * int: is primitive datatype.
         * can store only whole numbers ranging from -2,147,000,000 to 2,147,000,000
         *
         * In general, we use int-variable to store whole number.
         * By default, java treats every whole number as int
         */
        int covidCases = 1000000;
        int myDogAgeInYears = 1;

        // print --> As per today, total covid cases in the country : 1000000

        System.out.println("As per today, total covid cases in the country : " + covidCases);

        /**
         * long: is primitive datatype.
         * can store only whole numbers ranging from
         * -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
         *
         * to store any value as "long" in java-memory
         *  we need to add 'L' after the value then only java will treat the value as 'long'
         *
         * 'L' is just an indicator, not the part of value.
         *
         */
        long numberOfStars = 9819099999L;
        // variable datatype = long ; value = long

        // float, double, char, boolean

        /**
         * float: is a primitive datatype.
         *  can store value with decimal point.
         *
         * By default, java treats every decimal-point number as double.
         *
         * to store any value as 'float" in java memory
         *  we need to add "f" after the value then ony java will treat the value as "float"
         *
         * 'f' is just an indicator, not the part of value.
         *
         */
        float mortgageRate = 1.8f;
        System.out.println("\nCurrent mortgage rate: " + mortgageRate);

        /**
         * double: is a primitive datatype
         *  can store value with decimal point.
         *
         */
        double accountBalance = 100988.88;

        System.out.println("Account Balance : " + accountBalance);

        // changing value in accountBalance variable to 20000000
        accountBalance = 20000;
            // accountBalance = double
            // java will also convert the value into decimal point internally.

        System.out.println("Account Balance : " + accountBalance);

        /**
         * char: is a primitive datatype.
         *  can store ONLY single character.
         *
         * To store the value as char, value must be within single-quotes.
         *
         */
        char symbol = '#';
        System.out.println("My symbol : " + symbol);

        char firstDigit = '1';
        System.out.println("First digit in numerics: " + firstDigit);


        /**
         * boolean: is a primitive datatype
         *  can store either true or false as value.
         */
        boolean isRainingRightNow = true;

        System.out.println("\nIs it raining? : " + isRainingRightNow);


        int num = 10 + 40;
        System.out.println("num = " + num);



    }


}

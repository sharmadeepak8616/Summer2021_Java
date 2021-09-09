package Class6;

public class Conditional_Code {
    public static void main(String[] args) {

        /**
         * Conditional Loops (Conditional Code)
         *
         * 1. if-else block
         * 2. switch block
         *
         * when we have different actions to do (code to execute) depending upon conditions
         *
         */

        /**
         * if you find almond milk at store and it is not expiring in 1 week
         *      buy 2 packets
         *      buy 1 bread
         * else if oat milk is present
         *      buy 1 pack of it
         * else
         *      call me
         */
        /**
         * almond milk is present and not expiring in 1 week
         *      buy 2 packets
         *      buy 1 bread
         *
         *
         * almond milk is present and expiring in 1 week
         * if oat milk is present
         *      buy 1 pack of it
         *
         * almond milk is present and expiring in 1 week
         * oat milk is not present
         *      call
         */

        /**
         * if you find almond milk at store and it is not expiring in 1 week
         *      buy 2 packets
         *      buy 1 bread
         * else if oat milk is present
         *      buy 1 pack of it
         * else if check for full cream or organic milk
         *      buy 4 packets of it
         *      buy 2 boxes of eggs
         * else
         *      call me
         *
         * if its raining
         *      take umbrella
         */

        /**
         * Syntax if-else
         *
         * if (condition(s)) {
         *      // if-block
         *      // code will be executed if the condition(s) is/are true
         * }
         *
         * if (condition(s)) {
         *      // if-block
         *      // code will be executed when the condition(s) resulting in true
         * } else if (condition(s)) {
         *      // else-if-block
         *      // code will be executed when the condition(s) resulting in true
         * } else if (condition(s)) {
         *      // else-if-block
         *      // code will be executed when the condition(s) resulting in true
         * } else {
         *      // else-block
         *      // code will be executed when all above if/else-if are false
         * }
         *
         */

        int num1 = 1;

        // if the number (num1) is less than 5, print "less than 5" else print "greater than 5"
        /*
            num1 < 5
                sout("less than 5")
            else
                sout("greater than 5")
         */

        if (num1 < 5) {
            System.out.println("less than 5");
        } else {
            System.out.println("greater than 5");
        }


        /**
         *  num is divisible by 2 and num < 20
         *      sout(num * 10)
         *      sout(num is divisible by 2)
         *  num is divisible by 5 or 3
         *      sout(remainder of num1 when divided by 2)
         *      sout(num is divisible by 5 or 3)
         *  num < 20
         *      sout("less than 20")
         *
         */
        int num = 8;

        if (num%2 == 0 && num < 20) {
            System.out.println(num + " * 10 = " + (num*10));    // 10 * 10 = 100
            System.out.println(num + " divisible by 2");
        } else if (num%5 == 0 || num%3 == 0) {
            System.out.println("Remainder of " + num + " when divided by 2: " + num%2);
            System.out.println(num + " divisible by 5 or 3");
        } else if (num < 20) {
            System.out.println(num + " less than 20");
        }

        System.out.println("Outside the if-else block");
        System.out.println("Line 121");

        String day = " WeekDaY ";                // weekday or weekend
        String clothes = "";            // casual, formals, suit
        boolean anyMeeting = true;      // true or false

        /**
         * day = weekend ; clothes = casual
         * day = weekdays and I have meetings ; clothes = suit
         * day = weekdays and I have no meetings ; clothes = formals
         */

        // write if-else code block to assign value to 'clothes' variable
        if (day == "weekend") {
            clothes = "casual";
        } else if (day == "weekday" && anyMeeting) {
            clothes = "suit";
        } else if (day == "weekday" && !anyMeeting) {
            clothes = "formals";
        }
        System.out.println("clothes : " + clothes);


        if (day.trim().equalsIgnoreCase("weekend")) {     // equals or equalsIgnoreCase
            clothes = "casual";
        } else if (day.trim().equalsIgnoreCase("weekday") && anyMeeting) {
            clothes = "suit";
        } else if (day.trim().equalsIgnoreCase("weekday") && !anyMeeting) {
            clothes = "formals";
        }
        System.out.println("clothes : " + clothes);


        /**
         * day = weekend ; clothes = casual
         * day = weekdays
         *      if I have meetings ; clothes = suit
         *      else clothes = formals
         */

        if (day.trim().equalsIgnoreCase("weekend")) {     // equals or equalsIgnoreCase
            clothes = "casual";
        } else if (day.trim().equalsIgnoreCase("weekday")) {
            if (anyMeeting) {
                clothes = "suit";
            } else {
                clothes = "formals";
            }
        }
        System.out.println("clothes : " + clothes);

        /**
         * switch block
         *
         * 1. all conditions are related to one variable
         * 2. all conditions are checking the equals of variable vs data
         *
         * Syntax:
         *
         * switch (variable) {
         *      case value1:
         *          // do this
         *          // code to execute if variable is equals to value1
         *          break;
         *      case value2:
         *          // do this
         *          // code to execute if variable is equals to value2
         *          break;
         *      case value3:
         *          // do this
         *          // code to execute if variable is equals to value3
         *          break;
         *      default:
         *          // do this
         *          // code if variable is NOT matching nay above case
         * }
         *
         */
        /*
            int num

            if (num is equals to 5) --> sout("num is five")
            else if (num is equals to 10) --> sout("num is ten")
            else if (num is equals to 15) --> sout("num is fifteen")
            else --> sout("num is other than 5, 10 and 15")
         */
        int num2 = 0;

        if (num2 == 5) {
            System.out.println("num is five");
        } else if (num2 == 10) {
            System.out.println("num is ten");
        } else if (num2 == 15) {
            System.out.println("num is fifteen");
        } else {
            System.out.println("num is other than 5, 10 and 15");
        }

        switch (num2) {
            case 5:
                System.out.println("num is five");
                break;
            case 10:
                System.out.println("num is 10");
                break;
            case 15:
                System.out.println("num is fifteen");
                break;
            default:
                System.out.println("num is other than 5, 10 and 15");
        }

        /*
            if name is happy, print "good name"
            if name is joy, print "have fun"
            if name is hear, print keep listening
            if name is not from above list, print the given name
         */
        String name = "Joy";

        if (name.equals("happy")) {
            System.out.println("Good name");
        } else if (name.equalsIgnoreCase("joy")) {
            System.out.println("have fun");
        } else if (name.equals("hear")) {
            System.out.println("keep listening");
        } else {
            System.out.println(name);
        }

        switch (name.toLowerCase()) {   // Joy  -> joy
            case "happy":
                System.out.println("Good name");
                break;
            case "joy":
                System.out.println("have fun");
                break;
            case "hear":
                System.out.println("keep listening");
                break;
            default:
                System.out.println(name);
        }

        /**
         * based on month name, print the season
         * dec, jan, feb -> winter season
         * mar, apr, may -> summer season
         * jun, jul, aug -> fall season
         * sep, oct, nov -> spring season
         * if any other month name, print "invalid month name entered - ABC"
         */
        String month = "december";

        switch (month.toLowerCase()) {
            case "january":
            case "december":
            case "february":
                System.out.println("Winter season");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Summer season");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Fall season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Spring season");
                break;
            default:
                System.out.println("Invalid month name entered - " + month);
        }











    }
}

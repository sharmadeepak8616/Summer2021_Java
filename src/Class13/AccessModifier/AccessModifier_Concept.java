package Class13.AccessModifier;

public class AccessModifier_Concept {
    /**
     *
     * Access Modifier defines from where the variables/methods can be accessed
     *
     *
     * public - the variable/method can be accessed form anywhere in the project
     * protected - the variable/method can be accessed only within the package.
     * private - the variable/method CANNOT be accessed from outside the class.
     *
     */

    // Variables
    public String name;
    private double number;
    protected int iNumber;

    public static String sName;
    private static double sNumber;
    protected static int siNumber;

    // Methods
    public void setName(String value) {
        name = value;
    }

    public void printName() {
        System.out.println("Name : " + name);
    }


    public static String toTitleCase(String userStr) {
        String formattedStr = "";
        String[] userStrArray = userStr.toUpperCase().split(" ");
        for (String word : userStrArray) {
            formattedStr = formattedStr + word.charAt(0) + word.substring(1).toLowerCase() + " ";
            // formattedStr+=word.charAt(0)+word.substring(1).toLowerCase()+" ";
        }
        return formattedStr.trim();
    }

    private static String reverseString(String userStr) {
        String reversedStr = "";
        for (int i=0 ; i < userStr.length() ; i++) {
            reversedStr += userStr.charAt(userStr.length()-1-i);
        }
        return reversedStr;
    }

    protected static double findArrayAverage(int[] userArray) {
        double sum = 0;
        for (int num : userArray) {
            sum+=num;
        }
        return sum/userArray.length;
    }


    public String createAbbreviation(String userStr) {
        String abr = "";
        String[] userStrArray = userStr.split(" ");
        for (String word : userStrArray) {
            abr+=word.toUpperCase().charAt(0);
        }
        return abr;
    }

    private boolean isStringPalindrome(String userStr) {
        /*
            1. reverse the given string
            2. compare it with original
         */
        boolean isPalindrome = false;
        String reversedString = reverseString(userStr);
        return userStr.equalsIgnoreCase(reversedString);
    }

    protected int findMaxFromArray(int[] userArray) {
        int max = userArray[0];
        for (int i=1 ; i < userArray.length ; i++) {
            if (max < userArray[i]) {
                max = userArray[i];
            }
        }
        return max;
    }

}

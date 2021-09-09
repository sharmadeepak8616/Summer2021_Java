package Class13.AccessModifier;

public class MyStringMethods {

    // Field Variables

    // Methods
    public static String reverseString(String userStr) {
        String reversedStr = "";
        for (int i=0 ; i < userStr.length() ; i++) {
            reversedStr += userStr.charAt(userStr.length()-1-i);
        }
        return reversedStr;
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

    public String createAbbreviation(String userStr) {
        String abr = "";
        String[] userStrArray = userStr.split(" ");
        for (String word : userStrArray) {
            abr+=word.toUpperCase().charAt(0);
        }
        return abr;
    }

    public boolean isStringPalindrome(String userStr) {
        boolean isPalindrome = false;
        String reversedString = reverseString(userStr);
        return userStr.equalsIgnoreCase(reversedString);
    }


}

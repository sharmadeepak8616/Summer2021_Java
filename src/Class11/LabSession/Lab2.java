package Class11.LabSession;

public class Lab2 {

    public static void main(String[] args) {

        String abc = "hello world";     // Hello World
        // code to convert string into Titlecase

        String[] arr1 = abc.split(" ");
        String result = "";
        for (int i=0 ; i<=arr1.length-1 ; i++) {
            result = result + " " + arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1);
        }
        result = result.trim();

        System.out.println("After conversion : " + result);


        String xyz = "how Are you";

        String[] arr2 = xyz.split(" ");
        String result2 = "";
        for (int i=0 ; i<=arr2.length-1 ; i++) {
            result2 = result2 + " " + arr2[i].substring(0, 1).toUpperCase() + arr2[i].substring(1);
        }
        result2 = result2.trim();

        System.out.println("After conversion : " + result2);



        abc.toUpperCase();      // Hello World
        abc.toLowerCase();


        String abcInTitleCase = toTitleCase(abc);       // abc = "hello World"
        // abcInTitleCase = ""

        System.out.println(abc.equalsIgnoreCase(abcInTitleCase));

        System.out.println(toTitleCase("how aRe you"));

    }

    // method to convert given string into Titlecase
    /*
        Input : 1 (String)
        return type : String

        // return the result to user, OR --> return type : String
        // not return and print the final result on console; so that user can see -> return type : void

     */
    public static String toTitleCase(String userString)  {
        String[] arr1 = userString.split(" ");
        String result = "";
        for (int i=0 ; i<=arr1.length-1 ; i++) {
            result = result + " " + arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1);
        }
        result = result.trim();
        return result;
    }









}

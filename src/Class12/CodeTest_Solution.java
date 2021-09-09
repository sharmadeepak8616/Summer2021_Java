package Class12;

import java.text.DecimalFormat;

public class CodeTest_Solution {

    public int[] removedIntFromArray(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        // #2:
        int[] restOfValuesArr = new int[arr.length - count];
        // #3:
        int j=0;
        for (int num : arr) {
            if (num != value) {
                restOfValuesArr[j] = num;
                j++;
            }
        }
        return restOfValuesArr;
    }

    public int missingSmallest(int[] arr) {
        int check = 1;
        for (int i=0 ; i < arr.length ; i++) {
            if (arr[i] == check) {
                check++;
                i = -1;
            }
        }
        return check;
    }

    public static int calculatePoints(double yourSpeed) {
        double speedLimit = 70;
        double extraSpeed = yourSpeed - speedLimit;
        DecimalFormat df = new DecimalFormat("#.##");
        int points = 0;
        System.out.println("Your speed: " + df.format(yourSpeed) + "mph");
        System.out.println("Speed limit: " + speedLimit + "mph");
        if (extraSpeed > 0) {
            System.out.println("You were going " + df.format(extraSpeed) + "mph over the speed limit.");
            points = (int)extraSpeed/5;
            System.out.println("** You get " + points + " points against your license.**");
            if (points >= 12) {
                System.out.println("As points were more than 12, Your license suspended.");
            }
        } else {
            System.out.println("Thank you for driving within the speed limit.");
        }
        return points;
    }

}

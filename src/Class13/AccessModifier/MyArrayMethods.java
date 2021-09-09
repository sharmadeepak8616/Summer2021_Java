package Class13.AccessModifier;

public class MyArrayMethods {


    /**
     * Write a method to return the average of a given int array
     *
     * Input array : {7, 10, 3, 6, 10}
     * ans : 7.2
     *
     */
    public static double findArrayAverage(int[] userArray) {
        double sum = 0;
        for (int num : userArray) {
            sum+=num;
        }
        return sum/userArray.length;
    }

    /**
     * Write a method to return the maximum value from a given int array
     *
     * Input array: {33, 54, 67, 19, 9, 52}
     * max : 67
     */
    public int findMaxFromArray(int[] userArray) {
        int max = userArray[0];
        for (int i=1 ; i < userArray.length ; i++) {
            if (max < userArray[i]) {
                max = userArray[i];
            }
        }
        return max;
    }


}

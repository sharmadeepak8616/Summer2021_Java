package Class3.LabSessions;

public class LabSession_2 {
    public static void main(String[] args) {

        /*
            increment(++)
                increase by 1
            decrement(--)
                decrease by 1
         */

        int num = 10;
        num++;
        System.out.println(num);    // 11

        System.out.println(num++);  // 11 , num=12
        /*
            print / post-increment
         */

        System.out.println(num);    // 12

        System.out.println(++num);  // num=13 , 13
        /*
            pre-increment / print
         */

        int newNum = num++;         // newNum=13  , num=14
        /*
            assignment / post-increment
         */

        System.out.println(newNum); // 13

        System.out.println(num);    // 14


    }
}

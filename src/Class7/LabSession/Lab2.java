package Class7.LabSession;

public class Lab2 {
    public static void main(String[] args) {

        // print the values form index-0 to index-last
        int[] numbers = {11, 22, 33, 44, 55};

        /*
            print here value present at index-0
            print here value present at index-1
            print here value present at index-2
            print here value present at index-3
            print here value present at index-4
         */

//        System.out.println(numbers[0]);     // i=0 ; i <= numbers.length-1 ; i++
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        // System.out.println(numbers[5]);

//        for (int i=0 ; i <= numbers.length-1 ; i++) {   // 5 <= 4
//            System.out.println(numbers[i]);     // 0, 1, 2, 3, 4 (i <= 4)
//        }

        /**
         * print the numbers from 5 to -5 in reverse order
         *
         * 5
         * 4
         * 3
         * 2
         * 1
         * 0
         * -1
         * -2
         * -3
         * -4
         * -5
         */
//        System.out.println(5);
//        System.out.println(4);
//        System.out.println(3);
//        System.out.println(2);
//        System.out.println(1);
//        System.out.println(0);
//        System.out.println(-1);
//        System.out.println(-2);
//        System.out.println(-3);
//        System.out.println(-4);
//        System.out.println(-5);     // 5,4,3,2,1,0,-1,-2,-3,-4,-5   i >= -5


        // System.out.println(i);   int i=5 ; i >= -5 ; i--

//        for (int i=5 ; i >= -5 ; i--) {
//            System.out.println(i);
//        }

        /**
         * print the values from last-index to index-0
         *
         */
        String[] names = {"haPPy", "LeaRn", "GrOw", "MediTate", "LiSTen", "PEAce"};
        /*

            PEAce       names[names.length-1]               // 6-1 = 5
            LiSTen      names[names.length-2]               // 6-2 = 4
            MediTate    names[names.length-3]               // 6-3 = 3
            GrOw        names[names.length-4]               // 6-4 = 2
            LeaRn       names[names.length-5]               // 6-5 = 1
            haPPy       names[names.length-6]    // 6-6 = 0


            names[names.length-i]   // i=1 ; i <= names.length ; i++     // 1, 2, 3, 4.....names.length

         */
//
//        for (int i=6 ;  i >= -6 ; i--) {    // i=6 <--> 6 >= -6
//            System.out.println(i);
//        }

        for (int i=1 ; i<=names.length ; i++) {
            System.out.println(names[names.length-i]);
        }


//        for ( int i=0 ; i <= names.length-1 ; i--);{
//            System.out.println(names[]);
//        }
//
        for (int result3=names.length-1; result3 >= 0; result3--) {
            System.out.println(names[result3]);
        }

        /**
         * Print the value from int-array only if it is divisible by 5
         */
        int[] myNumbers = {11, 55, 33, 65, 70, 78, 77, 35};
        /*
            expected ans:
            55
            65
            70
            35
         */
        /*
            Pseudo Code:
            if myNumbers[0]%5 == 0
                sout(myNumbers[0])

            if myNumbers[1]%5 == 0
                sout(myNumbers[1])

            if myNumbers[2]%5 == 0
                sout(myNumbers[2])
            ...
            ...
            if myNumbers[lastIndex]%5 == 0
                sout(myNumbers[lastIndex])


            if myNumbers[i]%5 == 0      // i = 0 ; i <= myNumbers.length-1 ; i++       // 0,1,2,3....lastIndex
                sout(myNumbers[i])


         */

        for (int i=0 ; i <= myNumbers.length-1 ; i++) {
            if (myNumbers[i]%5 == 0) {
                System.out.println(myNumbers[i]);
            }

        }

        /**
         * Count the number of times a given word is present in a given paragraph
         *
         */
        String paragraph = "Are you searching for Essay Writing Topics in English for various competitions and speeches for school events? Then you are on the right page here you will get all kinds of topics for essay writing in English. As we have gathered numerous essay topics in long and short forms for all classes students. Yes, what you heard is correct, this page is filled with Long essays for class 10, 9, 8, 7, and Short essays for class 6, 5, 4, 3, 2, 1. So, anyone can check out this Essay Writing in English Article on AplusTopper for school events & competitions. Moreover, you can also find 10 lines on the selected far topic in English for the speeches in school programs. These Ten lines in English will assists students and teachers at the time of school speeches on special events. Hence, students can refer to the below provided a massive list of essays in English and participate in any kind of events conducted by schools. For the sake of class 1 to 10 students, we have also covered 10 Lines and Essay on ‘My School’ in English and Hindi here.";
        String wordToSearch = "EngLISh";

        int counter = 0;

        /*
            Pseudo Code:

            #1 -> paragraph.split(" ") -> String[] words = ["Are", "you", "searching", "for", "Essay", "Writing", "Topics", "in"]

                if words[0] contains wordToSearch
                    counter++

                if words[1] contains wordToSearch
                    counter++

                if words[2] contains wordToSearch
                    counter++
                ...
                ...
                if words[lastIndex] contains wordToSearch
                    counter++


            #2 -> loop
            if words[i] contains wordToSearch       // int i=0 ; i<=words.length-1 ; i++   // 0,1,2,3,4....lastIndex
                counter++

            #3 -> print the value of counter with appropriate message
         */










    }
}

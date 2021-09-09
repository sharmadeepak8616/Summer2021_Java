package Class13.ExceptionsPkg;

import Class13.AccessModifier.MyStringMethods;
import Class14.ConstructorPkg.MyConstructor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Concept {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please enter your first name: ");
            String userFirstName = MyStringMethods.toTitleCase(input.nextLine());     // assign value to variable during runtime (use: Scanner)

            System.out.println("Please enter your age as years: ");
            int age = input.nextInt();

            System.out.println(age);                     // 10
            System.out.println(userFirstName);           // whatever user entered

        } catch (InputMismatchException e) {
            System.out.println("Incorrect form of data supplied.\nHence shutting down the program");
            // e.printStackTrace();
        }

        /*
            may 1 1998
            05/01/1998
            month:
                may|05 (nextLine)
            date:
                01
            year:
                1998
         */



    }
}

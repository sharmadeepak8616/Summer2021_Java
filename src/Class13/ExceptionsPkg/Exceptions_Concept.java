package Class13.ExceptionsPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.FileSystem;

public class Exceptions_Concept {
    public static void main(String[] args) {

        /**
         * Exceptions: Unhandled Situation
         *
         * Types:
         * 1. Compile-Time Exceptions (InterruptedException)
         * 2. Run-Time Exceptions (StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException)
         *
         * How to handle exceptions:
         *  1. use "throws" keyword (DO NOT USE IT)
         *  2. use try-catch block
         *
         * try:
         *      code which can throw exception
         * catch:
         *      for every exception, we create a catch block
         *
         * Syntax:
         *  try {
         *      // code which can
         *      // throw exception(s)
         *  } catch (Exception-1 e) {
         *      // code to execute if Exception-1 occurs
         *  } catch (Exception-2 e) {
         *      // code to execute if Exception-2 occurs
         *  } catch (Exception-3 e) {
         *      // code to execute if Exception-3 occurs
         *  } catch (Exception-4 e) {
         *      // code to execute if Exception-4 occurs
         *  } finally {
         *      // code to run always whether an exception occurs or not
         *  }
         *
         *
         * --> As soon an exception occurs inside the try-block.
         * java will come out of the try-block, and
         *  enters in the catch block which can catch/handle the exception
         *  AND, does NOT go back in the try block.
         *
         * finally:
         *  It's a block associated with try-catch block.
         *  Code in the block will always execute irrespective exception.
         *  --> There can be ONLY ONE block with every try-catch block
         *
         *  finally vs final:
         *      finally: code block associated with try-catch block.
         *      final: is a keyword use to create constant variable.
         *
         *
         */

        int index = 1;
        int arrIndex = 100;

        try {
            String myName = "happy";

            System.out.println(myName.charAt(index));       // StringIndexOutOfBoundsException - RunTime Exception

            int[] numbers = {11, 32, 87};

            // print the value at index-1 of this array
            System.out.println(numbers[arrIndex]);             // ArrayIndexOutOfBoundsException - RunTime Exception

            // print the value at first index of this array
            System.out.println(numbers[0]);

            // to pause java execution for given number of milliseconds (1 seconds = 1000 milliseconds)
            Thread.sleep(2000);                     // InterruptedException - CompileTime Exception

            // print the value at last index of this array
            System.out.println(numbers[0]);

            Thread.sleep(2000);

            FileInputStream fis = new FileInputStream("./Desktop/file1.xlsm"); // FileNotFoundException


        } catch (StringIndexOutOfBoundsException strExcep) {
            System.out.println("Incorrect index given to charAt method.");
            strExcep.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException arrExcep) {
            System.out.println("Incorrect index for array");
            arrExcep.printStackTrace();
        } catch (InterruptedException sleepExcep) {
            System.out.println("Exception occurred in sleep method");
            sleepExcep.printStackTrace();
        } catch (FileNotFoundException e) {

            try {

                System.out.println("File not found");
                // pause the execution for 5 seconds
                // sout "Check the file at given location"
                Thread.sleep(5000);
                System.out.println("Check the file at given location");

            } catch (InterruptedException sleepExcepVar) {
                sleepExcepVar.printStackTrace();
                System.out.println("Sleep exception while file not found exception");
            }

        } finally {
            System.out.println("In the finally block.");
        }

        System.out.println("Outside the try-catch block");

        /*
            try {
                make internet connection
                open web page
                read the content
            } catch (WebSiteNotFound) {
                sout(website not found)
            } finally {
                close internet connection
            }


            try {
                make connection with File System
                find and open file1.xlsm
                write/read the file
            } catch (WebSiteNotFound) {
                sout(website not found)
            } finally {
                close connection with File System
            }

         */



    }
}

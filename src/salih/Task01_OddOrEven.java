package salih;

import java.util.Scanner;

public class Task01_OddOrEven {

    /*
       Write a method that can identify  a given number is even or odd.

      EX:

             identify(5) --> "Odd"
             identify(6) --> "Even"
    */

    public static void main(String[] args) {

        identify(6);

    }

    public static void identify(int num) {

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}

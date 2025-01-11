package umut;

public class Task01_OddOrEven {

    /*
    Write a method that can identify a given number is odd or even.

   EX:    identify(5) --> "Odd"
          identify(6) --> "Even"
 */
    public static void main(String[] args) {

        identify(5);
        identify(6);
        identify(7);
        identify(8);
    }

    /**
     * returns the given number if it is odd or even.
     *
     * @param number;
     */

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else System.out.println(number + " is Odd");
    }
}

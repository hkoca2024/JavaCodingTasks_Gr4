package umut;

public class Task02_Finra {

    /*
    Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
    print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
    For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
    */

    public static void main(String[] args) {

        finra(17);

    }

    /**
     *
     * @param number
     */

    public static void finra(int number) {

        if (number >= 1 && number <= 30) {

            for (int i = 1; i <= number; i++) {

                if (i % 15 == 0) {                //Both 3 and 5 can divide
                    System.out.print("FINRA ");

                } else if (i % 3 == 0) {          //Only 3 can divide
                    System.out.print("FIN ");

                } else if (i % 5 == 0) {          //Only 5 can divide
                    System.out.print("RA ");

                } else
                    System.out.print(i + " ");

            }
        } else {
            System.out.println("The number is out of bound, we can't run finra function");

        }
    }
}
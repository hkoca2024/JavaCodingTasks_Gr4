package oguz;

public class Task02_FinRa {

     /*
    Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
    print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
    For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
    */

    public static void main(String[] args) {

        // Call the method to print numbers with FINRA replacements
        printFinra();


    }

    /**
     * This method prints numbers from 1 to 30. For numbers that are multiples of 3,
     * it prints "FIN" instead of the number. For numbers that are multiples of 5,
     * it prints "RA" instead. If a number is a multiple of both 3 and 5,
     * it prints "FINRA".
     */

    public static void printFinra() {
        for (int i = 1; i <= 30; i++) {
            // Check if the number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            }
            // Check if the number is a multiple of 3
            else if (i % 3 == 0) {
                System.out.println("FIN");
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("RA");
            }
            // Print the number if it's not a multiple of 3 or 5
            else {
                System.out.println(i);
            }
        }

    }
}

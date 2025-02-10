package oguz;

public class Task04_ReverseNegativeNumbers {

    /*
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
     */


    public static void main(String[] args) {

        int num = -35;
        System.out.println("Original Number: " + num);

        int reversedNum = reverseNegative(num);
        System.out.println("Reversed Number: " + reversedNum);

    }

    /**
     * Reverses the digits of a negative number using String manipulation.
     *
     * @param num The negative number to reverse.
     * @return The reversed number as a negative integer.
     */
    public static int reverseNegative(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("The number must be negative!");
        }

        String numStr = Integer.toString(num).substring(1);

        String reversedStr = new StringBuilder(numStr).reverse().toString();

        return Integer.parseInt(reversedStr) * -1;
    }
}

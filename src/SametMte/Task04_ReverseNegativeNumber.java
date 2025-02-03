package SametMte;

public class Task04_ReverseNegativeNumber {
    /*
    Write a return method that can reverse digits of a negative number and return it as int
            input: -35  output: -53
     */
    public static void main(String[] args) {
        int input=-35;
        int result=reserveNagetiveNumber(input);
        System.out.println(result);

    }

    /**
     *  This method takes a negative number and swaps its first and last digits.
     * @param number takes given value
     * @return return last value
     */

    public static int reserveNagetiveNumber(int number) {
        if (number < 0) {
            number = -number;
            String numberString = String.valueOf(number);
            String reversedString = "";
            for(int i=numberString.length()-1; i>=0; i--) {
                reversedString = reversedString + numberString.charAt(i);
            }
            int temp = -Integer.parseInt(reversedString);
            return temp;
        }
        else {
            throw new IllegalArgumentException("The number must be negative!");
        }
    }
}

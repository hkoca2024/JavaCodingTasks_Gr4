package oguz;

public class Task03_SwapNumbers {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20;

        System.out.println("Original Values: num1 = " + num1 + ", num2 = " + num2);

        swapWithTemp(num1, num2);

        swapWithoutTemp(num1, num2);





    }

    /**
     * Swaps two numbers using a third (temporary) variable.
     *
     * @param a First number
     * @param b Second number
     */
    public static void swapWithTemp(int a, int b) {
        System.out.println("\n[Swapping with a temporary variable]");

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Result: num1 = " + a + ", num2 = " + b);
    }

    /**
     * Swaps two numbers without using a third variable.
     *
     * @param a First number
     * @param b Second number
     */
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("\n[Swapping without a temporary variable]");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Result: num1 = " + a + ", num2 = " + b);
    }

}

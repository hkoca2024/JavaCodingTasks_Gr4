package ozge;

public class Task03_SwapTwo_Int_Numbers {

    /*
    Swap two integer variable values (including both ways; with using a third variable and without it)
     */

    public static void main(String[] args) {

        int a = 5, b = 10;
        firstSwapMethod(a, b);
        secondSwapMethod(a, b);


    }

    //first way

    /**
     * swaps using the third variable
     */
    public static void firstSwapMethod(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a + ", b: " + b);
    }

    //second way

    /**
     * swap using with mathematical operation
     */
    public static void secondSwapMethod(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a + ", b: " + b);
    }
}

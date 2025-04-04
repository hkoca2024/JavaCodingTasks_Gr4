package SametMte;

public class Task03_SwapTwo_Int_Numbers {

    /*
    Swap two integer variable values (including both ways; with using a third variable and without it)
     */
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        System.out.println("original\n"+"Num1 : "+num1+"\nNum2 : "+num2);
        System.out.println("-------------------------------------");
        String result1 = swapNumbers1(num1, num2);
        System.out.println(result1);
        System.out.println("-------------------------------------");
        String result2 = swapNumbers2(num1, num2);
        System.out.println(result2);
    }
    // first method
    /**
     *
     * @param num1 takes given first value
     * @param num2 takes given second value
     * @return retun num1 and num2 value
     */
    public static String swapNumbers1(int num1,int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        return "first method\n"+"Num1 : "+num1+"\nNum2 : "+num2;
    }

    // second method

    /**
     *
     * @param num1 takes given first value
     * @param num2 takes given second value
     * @return retun num1 and num2 value
     */
    public static String swapNumbers2(int num1,int num2) {
        num1= num1+num2; // num1= 15+30
        num2= num1-num2; // num2= 45-30
        num1= num1-num2; // num1= 45-15
        return "second method\n"+"Num1 : "+num1+"\nNum2 : "+num2;
    }
}

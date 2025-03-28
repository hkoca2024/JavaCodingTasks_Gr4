package oguz;

public class Task01_OddOrEven {

    /*
        Write a method that can identify  a given number is even or odd.

       EX:

              identify(5) --> "Odd"
              identify(6) --> "Even"
     */


    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(6);

    }



    /**
     * This method checks whether the integer value sent as a parameter is odd or even.
     * @param num
     */
   public static void oddOrEven(int num){

        if (num%2==0)
            System.out.println("The "+num+" is 'Even'");
        else
            System.out.println("The "+num+" is 'Odd'");


   }



}

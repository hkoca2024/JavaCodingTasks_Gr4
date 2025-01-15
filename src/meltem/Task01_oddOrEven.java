package meltem;

public class Task01_oddOrEven {
    /*
       Write a method that can identify  a given number is even or odd.

      EX:

             identify(5) --> "Odd"
             identify(6) --> "Even"
    */
    public static void main(String[] args) {
        oddOrEven(8);

    }
    /**
     * returns the gıven number ıf ıt ıs odd or even
     * @param number
     */
    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


    }
}

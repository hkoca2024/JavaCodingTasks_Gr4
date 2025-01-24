package hamit;

public class Task01_oddOrEven {
    /*
        Write a method that can identify  a given number is even or odd.

       EX:

              identify(5) --> "Odd"
              // codes from Umut
              identify(6) --> "Even"
     */
    public static void main(String[] args) {
         oddOrEven(5);
         oddOrEven(6);
    }

    /**
     * returns the gıven number ıf ıt ıs odd or even
     * @param number
     */
    public static void oddOrEven(int number){
        if(number%2!=0){
            System.out.println("this number is an odd number");
        }else{
            System.out.println("Even number");
        }

    }
}

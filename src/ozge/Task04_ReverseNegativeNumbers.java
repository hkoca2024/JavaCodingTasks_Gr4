package ozge;

public class Task04_ReverseNegativeNumbers {

    /*
   Write a return method that can reverse digits of a negative number and return it as int
   input: -35  output: -53
    */

    public static void main(String[] args) {

        System.out.println( "-"+ reverseNegativeNumbers(-35));
    }

    /**
     * inverts the parameter
     */
    public static String reverseNegativeNumbers(int i) {

        if (i >= 0) {
            throw new IllegalArgumentException("The number must be negative!");
        }

        String str = i + "";//-35""
        String reversedStr = new StringBuilder(str).reverse().toString();//""53-
        String result =reversedStr.substring(0, reversedStr.length()-1);//53
        return result;


    }


}

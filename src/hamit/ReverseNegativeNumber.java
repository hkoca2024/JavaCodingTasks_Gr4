package hamit;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
           reverseNegNum(567);
        /**
         *  //  this method takes a negative number and return reverse
          */

    }
    public static void reverseNegNum(int number){
        if(number>=0){
            throw new IllegalArgumentException("number must not be greater than 0 or equal");
        }

        number=-1*number;//   make number positive to be ready for using with string
           String str=""+number;//  number becomes a string with  concatenation
           String revrstr="";
        for (int i= 0; i <str.length() ; i++) {
               revrstr+=str.charAt(str.length()-1-i);
        }
        int reverseNumber=Integer.parseInt(revrstr)*-1;
        System.out.println("number = " + number);
        System.out.println("reverseNumber = " + reverseNumber);
    }
}

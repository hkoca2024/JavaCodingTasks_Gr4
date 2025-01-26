    package hamit;

    public class SwapTwo_Int_Numb {
    public static void main(String[] args) {
      swapTwoIntNumbers(2,5);
    }

    /**
     *
     * @param a  /   this method swap given two int numbers
     * @param b  /
     */
    public static void swapTwoIntNumbers(int a, int b){
         int temp=0;
          temp=a;
          a=b;
          b=temp;
         System.out.println("a= "+a+"  "+"b= "+b);
     }

}

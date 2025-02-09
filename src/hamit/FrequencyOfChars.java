package hamit;

public class FrequencyOfChars {
    /*Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {

        String str="AAABBCD2";
        System.out.println("the given str = "+str);
        System.out.println("frequencyOfChars(str) = " + frequencyOfChars(str));


    }
    /**
     * this method count the frequency of each character and
     *  return each character and frequency
     *      *       side by side
     * @param
     */
    public static String frequencyOfChars(String str) {
        StringBuilder newStr=new StringBuilder();
        //String newStr="";
        int count=1;
        for (int i = 0; i <str.length()-1 ; i++) {// to avoid boundary problem it is used
            if(str.charAt(i)==str.charAt(i+1)){  // str.length()-1 instead of str.length()
                if(count==1){
                    newStr.append(str.charAt(i));// at the  first we add character to string
                }
                count++;//  count  equals character
                if(i==str.length()-2){
                    newStr.append(count);//  when i  comes to the last element due to no changing
                }                        //  java doesn't go else body and count is added here to string
            }else{
                if(count==1){
                    newStr.append(str.charAt(i));
                }
                newStr.append(count);//  when equals character finish count is added to string
                count=1;
            }

        }
               return newStr.toString();
    }
}

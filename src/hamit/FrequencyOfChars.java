package hamit;

public class FrequencyOfChars {
    /*Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {

        String str="AAAGGGBBCDDEEFAAA";
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
        if(str.isEmpty()){
            throw new IllegalArgumentException("The given String can not be empty");
        }
        StringBuilder newStr=new StringBuilder();
        while (!str.isEmpty()){
            Character first=str.charAt(0);
            String firstS=""+str.charAt(0);
            int frequencyOfChar=frequency(first,str);
            newStr.append(first).append(frequencyOfChar);
            str=str.replaceAll(firstS,"").trim();
        }
           return newStr.toString();
    }

    public static int frequency(Character c,String str) {
        int count=0;
        for(Character each:str.toCharArray()){
            if(each==c){
                count++;
            }
        }


        return count;
    }
}

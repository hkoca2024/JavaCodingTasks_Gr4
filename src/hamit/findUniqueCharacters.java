package hamit;

import java.util.Collections;
import java.util.List;

public class findUniqueCharacters {
     /*Write a return method that can find the unique character   of the given String
         Ex: frequencyOfChars("ABBCDD") ==>AC */


    public static void main(String[] args) {


        String str = "AAAGBBCDDET";//GCET
        System.out.println("the given str = " + str);
        System.out.println("frequencyOfChars(str) = " + find_UniqueCharacters(str));
        System.out.println("find_UniqueCharacters2(str) = " + find_UniqueCharacters2(str));

    }

    /**
     * this method find the unique character of the given string and
     * return
     * *
     *
     * @param
     */
    public static String find_UniqueCharacters(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The given String can not be empty");
        }
        StringBuilder newStr = new StringBuilder();
        while (!str.isEmpty()) {
            Character first = str.charAt(0);
            String firstS = "" + str.charAt(0);
            int frequencyOfChar = frequency(first, str);
            if (frequencyOfChar == 1) {
                newStr.append(first);
            }

            str = str.replaceAll(firstS, "").trim();
        }
        return newStr.toString();
    }

    /**
     * this method take a character and a string  and find the character's frequency in the string
     * @param c character
     * @param str
     * @return
     */
    public static int frequency(Character c, String str) {
        int count = 0;
        for (Character each : str.toCharArray()) {
            if (each == c) {
                count++;
            }
        }


        return count;
    }

    /**
     *
     * @param str
     * @return the unique characters of a String
     */
    public static String find_UniqueCharacters2(String str){
        List<String> str2= List.of(str.split(""));
        String uniques=" ";
        for(String each:str2){
            int freq= Collections.frequency(str2,each);
            if(freq==1) {
                uniques += each;
            }
        }
        return uniques;
    }
}


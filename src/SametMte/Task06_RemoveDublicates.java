package SametMte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task06_RemoveDublicates {
    public static void main(String[] args) {
        String str="AAAGGGBBCDDEEFAAA";
        String result = removeDublicates(str);
        System.out.println(result);
    }

    private static String removeDublicates(String givenString) {
        String[] givenStringArray = givenString.split("");//gelen String i array e çevirdik.
        List<String> givenStringList=new ArrayList<>(Arrays.asList(givenStringArray));// çevirdiğimiz Array i "givenStringList" adında bir List e atadık
        List<String> uniqList=givenStringList.stream().distinct().toList(); // "givenStringList" ten uniq bir List ürettik
        String solution="";
        for (int i = 0; i < uniqList.size(); i++) {
            solution+=uniqList.get(i)+" ";
        }

        return solution;
    }


}

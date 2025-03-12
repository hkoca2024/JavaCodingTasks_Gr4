package SametMte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07_FindUniq {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String result = findUniq(str);
        System.out.println(result);
    }

    private static String findUniq(String givenString) {
        String[] givenStringArray = givenString.split("");//gelen String i array e çevirdik.
        List<String> givenStringList=new ArrayList<>(Arrays.asList(givenStringArray));// çevirdiğimiz Array i "givenStringList" adında bir List e atadık
        List<String> uniqList=givenStringList.stream().distinct().toList(); // "givenStringList" ten uniq bir List ürettik

        int counter=0;
        String solution="";
        for (int i = 0; i < uniqList.size(); i++) {
            for (int i1 = 0; i1 < givenStringList.size(); i1++) {
                if (uniqList.get(i).equals(givenStringList.get(i1))){
                    counter++;
                }
            }
            if (counter==1){
                solution+=uniqList.get(i);
            }
            counter=0;// bir sonraki farklı harf için sayıcıyı sıfırladık

        }
        return solution;
    }
}

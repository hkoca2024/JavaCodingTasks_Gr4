package SametMte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task05_FrequencyOfChars {
    /*Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {
        String givenString="AABBCABBADA";
        //AABBCABBADA
        //AABBCABBADA
        String result = frequencyOfCharsMethod(givenString);
        System.out.println(result);

    }

    private static String frequencyOfCharsMethod(String givenString) {
        int counter=0;
        String solution="";

        //harflerde bir dizi oluşturduk.
        String[] givenStringChar = givenString.split("");
        List<String> givenStringList=new ArrayList<>();
        givenStringList.addAll(Arrays.asList(givenStringChar));
        System.out.println(givenStringList);

        //uniq bir karakterden oluşan bir dizi yaptık.
        List<String> uniqList= givenStringList.stream().distinct().toList();
        System.out.println(uniqList);

        //uniq listeden seçilen elemanın kaç defa tekrar ettiğini bulma
        for (int i = 0; i < uniqList.size(); i++) {
            for (int i1 = 0; i1 < givenStringList.size(); i1++) {
                if (uniqList.get(i).equals(givenStringList.get(i1))){
                    counter++;
                }
            }
            solution+=uniqList.get(i)+counter;// uniqleştirilmiş listedeki harfi ve sayısını solution içerisine ekledik
            counter=0;// bir sonraki farklı harf için sayıcıyı sıfırladık

        }
        return solution;

    }
}

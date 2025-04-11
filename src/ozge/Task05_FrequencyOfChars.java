package ozge;

import java.util.HashMap;
import java.util.Map;


public class Task05_FrequencyOfChars {

     /*
     Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

      */

    public static void main(String[] args) {
        String str = "AAABBCDD";
        Map<Character, Integer> frequencyMap = getCharacterFrequency(str);

        System.out.println("Karakter Sayıları:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     *This method count of characters in its parameter inside a Map and returns it
     * @param str
     * @return
     */
    public static Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

}

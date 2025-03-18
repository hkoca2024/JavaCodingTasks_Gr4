package enes;

import java.util.HashMap;
import java.util.Map;

public class Task05_FrequencyOfChars {

    /**
     * Verilen string içerisindeki karakterlerin frekansını (tekrar sayısını) bulur.
     *
     * @param str karakter frekanslarını bulmak istediğimiz string
     * @return her karakterin frekansını içeren string (örnek: "A3B2C1D2")
     */
    public static String frequencyOfChars(String str) {
        // 1. Adım: Karakterlerin frekansını tutmak için bir HashMap oluşturuyoruz.
        // Her karakteri anahtar (key), frekansını ise değer (value) olarak tutar.
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // 2. Adım: String'in her bir karakterini kontrol etmek için döngü kullanıyoruz.
        for (char ch : str.toCharArray()) {  // String'i karakter dizisine dönüştürüyoruz.
            // Eğer karakter map'te varsa, mevcut frekansını alıp bir artırıyoruz.
            // Eğer yoksa, varsayılan olarak frekansını 0 alıp, bir artırıyoruz.
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // 3. Adım: Sonuç stringini oluşturmak için StringBuilder kullanıyoruz.
        // StringBuilder, string'leri daha verimli bir şekilde birleştirir.
        StringBuilder result = new StringBuilder();

        // 4. Adım: Her bir karakterin frekansını alarak sonuç stringine ekliyoruz.
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            // Her bir karakteri ve onun frekansını sonuç stringine ekliyoruz.
            result.append(entry.getKey()).append(entry.getValue());
        }

        // 5. Adım: Sonuç olarak oluşturduğumuz string'i geri döndürüyoruz.
        return result.toString();
    }

    public static void main(String[] args) {
        // Test etmek için örnek string
        String input = "AAABBCDD";

        // frequencyOfChars metodunu çağırarak karakter frekanslarını buluyoruz.
        String result = frequencyOfChars(input);

        // Sonucu ekrana yazdırıyoruz. Beklenen çıktı: "A3B2C1D2"
        System.out.println(result);
    }
}

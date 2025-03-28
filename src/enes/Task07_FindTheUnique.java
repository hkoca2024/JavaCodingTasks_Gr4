package enes;

import java.util.Collections;
import java.util.List;

public class Task07_FindTheUnique {
    /*
     * Bu program, bir string içindeki yalnızca bir kez geçen (benzersiz) karakterleri tespit eder.
     * Örnek: "AAAGBBCDDET" -> "GCET" (çünkü G, C, E, T birer kez geçiyor)
     */

    public static void main(String[] args) {
        String input = "AAAGBBCDDET"; // Test için kullanılacak string
        System.out.println("Orijinal string: " + input); // Başlangıç string’ini yazdırıyoruz
        System.out.println("Benzersiz karakterler (1. yöntem): " + extractUniqueChars(input)); // İlk yöntemle benzersizleri buluyoruz
        System.out.println("Benzersiz karakterler (2. yöntem): " + getUniqueChars(input)); // İkinci yöntemle benzersizleri buluyoruz
    }

    /**
     * Bu metod, string içindeki yalnızca bir kez geçen karakterleri çıkarır
     * @param text - Analiz edilecek string
     * @return - Yalnızca bir kez geçen karakterlerden oluşan string
     */
    public static String extractUniqueChars(String text) {
        // String boşsa hata fırlatıyoruz, geçersiz inputu engellemek için
        if (text.isEmpty()) {
            throw new IllegalArgumentException("String boş olamaz!");
        }

        // Benzersiz karakterleri biriktirmek için StringBuilder kullanıyoruz
        StringBuilder uniqueResult = new StringBuilder();
        String remainingText = text; // İşlenecek string’i kopyalıyoruz

        // String tamamen işlenene kadar devam ediyoruz
        while (!remainingText.isEmpty()) {
            char currentChar = remainingText.charAt(0); // İlk karakteri alıyoruz
            String charAsString = String.valueOf(currentChar); // Karakteri string’e çeviriyoruz

            // Bu karakterin text içindeki tekrar sayısını hesaplıyoruz
            int charCount = countCharOccurrences(currentChar, remainingText);

            // Eğer karakter bir kez geçiyorsa, sonuca ekliyoruz
            if (charCount == 1) {
                uniqueResult.append(currentChar);
            }

            // Mevcut karakterin tüm tekrarlarını string’den çıkarıyoruz
            remainingText = remainingText.replaceAll(charAsString, "").trim();
        }

        // Benzersiz karakterleri içeren string’i döndürüyoruz
        return uniqueResult.toString();
    }

    /**
     * Bir karakterin string içindeki tekrar sayısını hesaplar
     * @param targetChar - Sayılacak karakter
     * @param text - Karakterin aranacağı string
     * @return - Karakterin tekrar sayısı
     */
    public static int countCharOccurrences(char targetChar, String text) {
        int occurrence = 0; // Karakterin kaç kez geçtiğini tutacak sayaç

        // String’in her bir karakterini kontrol ediyoruz
        for (char current : text.toCharArray()) {
            if (current == targetChar) { // Eğer karakter eşleşirse sayacı artırıyoruz
                occurrence++;
            }
        }

        return occurrence; // Toplam tekrar sayısını döndürüyoruz
    }

    /**
     * Alternatif bir yöntemle string’deki benzersiz karakterleri bulur
     * @param text - Analiz edilecek string
     * @return - Yalnızca bir kez geçen karakterlerden oluşan string
     */
    public static String getUniqueChars(String text) {
        // String’i karakterlere ayırıp bir List’e dönüştürüyoruz
        List<String> charList = List.of(text.split(""));

        // Benzersiz karakterleri biriktirmek için bir string başlatıyoruz
        String uniqueChars = "";

        // List’teki her bir karakteri kontrol ediyoruz
        for (String currentChar : charList) {
            // Collections.frequency ile karakterin kaç kez geçtiğini buluyoruz
            int frequency = Collections.frequency(charList, currentChar);

            // Eğer karakter yalnızca bir kez geçiyorsa, sonuca ekliyoruz
            if (frequency == 1) {
                uniqueChars += currentChar;
            }
        }

        // Benzersiz karakterleri içeren string’i döndürüyoruz
        return uniqueChars;
    }
}
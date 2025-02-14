package umut;

public class Task05_FrequencyOfChars {

    public static void main(String[] args) {

        System.out.println( frequencyOfChars("AAABBCDDNNNNSS") );
        System.out.println( frequencyOfChars("ABCCEEEMMMMM") );

    }

    /**
     *
     * @param str parametre olarak bir string alır.
     * @return bu stringdeki ardaşık karakterlerin sayısını hesaplar ve
     *         karakter+adet sayısı formatında string olarak çevirir.
     */
    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        int count;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 1;

            // Ardaşık aynı karakter sayısını bulmak için.
            while (i + 1 < str.length() && str.charAt(i + 1) == ch) {
                count++; // Aynı karakterin sayısı.
                i++;     // Bir sonraki karaktere geçiyoruz.
                         // Mevcut kararkteri atlıyoruz ki tekrar sayılmasın.
            }

            result.append(ch).append(count); //result değişkenine ekliyoruz.
        }

        return result.toString(); //String olarak sonucu döndürüyoruz.
    }


}


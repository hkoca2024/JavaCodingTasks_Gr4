package enes;

public class Task08_ReverseAString {

    // Programın başlangıç noktası olan main metodu
    public static void main(String[] args) {
        // Örnek bir string tanımlıyoruz
        String originalString = "Merhaba Dünya";
        System.out.println("Orijinal String: " + originalString);

        // String'i tersine çevirmek için reverseString metodunu çağırıyoruz
        String reversedString = reverseString(originalString);
        System.out.println("Tersine Çevrilmiş String: " + reversedString);
    }

    // Verilen string'i tersine çeviren metot
    public static String reverseString(String input) {
        // Eğer giriş null veya boşsa, girişi olduğu gibi geri döndür
        if (input == null || input.isEmpty()) {
            return input;
        }

        // String'i bir karakter dizisine çeviriyoruz (çünkü String'ler değiştirilemez)
        char[] characters = input.toCharArray();

        // İki işaretçi tanımlıyoruz: biri baştan, diğeri sondan başlar
        int left = 0;               // Baştaki işaretçi
        int right = characters.length - 1; // Sondaki işaretçi

        // İşaretçiler ortada buluşana kadar karakterleri takas et
        while (left < right) {
            // Karakterleri takas etmek için geçici bir değişken kullanıyoruz
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // İşaretçileri merkeze doğru kaydırıyoruz
            left++;  // Baştan sona doğru
            right--; // Sondan başa doğru
        }

        // Tersine çevrilmiş karakter dizisini yeni bir String olarak döndürüyoruz
        return new String(characters);
    }
}

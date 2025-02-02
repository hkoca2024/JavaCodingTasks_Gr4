package enes;

public class Task04_Reverse_Negative_Number {

    /**
     * Bu metot, negatif bir sayının rakamlarını ters çevirir ve sonucu int olarak döndürür.
     * Örneğin, girdi -35 ise çıktı -53 olur.
     *
     * @param number Rakamları ters çevrilecek negatif sayı.
     * @return Rakamları ters çevrilmiş sayı.
     */
    public static int reverseNegativeNumber(int number) {
        // 1. Negatif sayıyı pozitif yap
        // Sayının negatif olup olmadığını kontrol ediyoruz.
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // Negatif işaretini kaldırıyoruz, böylece sayı pozitif oluyor.
        }

        // 2. Sayının rakamlarını ters çevir
        int reversedNumber = 0; // Ters çevrilen sayıyı saklamak için bir değişken oluşturuyoruz.
        while (number != 0) {
            int digit = number % 10; // Sayının son rakamını alıyoruz.
            reversedNumber = reversedNumber * 10 + digit; // Ters çevrilen sayıya bu rakamı ekliyoruz.
            number = number / 10; // Sayının son rakamını çıkarıyoruz.
        }

        // 3. Negatif işaretini geri ekle
        // Eğer orijinal sayı negatifse, ters çevrilen sayıya negatif işaretini geri ekliyoruz.
        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        // 4. Sonucu döndür
        return reversedNumber; // Ters çevrilen sayıyı döndürüyoruz.
    }

    public static void main(String[] args) {
        // Test için bir negatif sayı belirliyoruz.
        int input = -35;

        // reverseNegativeNumber metodunu çağırarak sayının rakamlarını ters çeviriyoruz.
        int output = reverseNegativeNumber(input);

        // Girdi ve çıktıyı ekrana yazdırıyoruz.
        System.out.println("Input: " + input);  // Çıktı: Input: -35
        System.out.println("Output: " + output); // Çıktı: Output: -53
    }
}
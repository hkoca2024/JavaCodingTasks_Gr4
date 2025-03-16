package enes;

public class Task06_Remove_Dublicates {
    public static void main(String[] args) {
        String str = "AAAGGGBBCDDEEFAAA"; // Test için bir string tanımlıyoruz
        System.out.println("the given str = " + str); // Orijinal string’i ekrana yazdırıyoruz
        System.out.println("remove_Dublicates(str) = " + remove_Dublicates(str)); // Tekrarları kaldırılmış haliyle yazdırıyoruz
    }

    /**
     * @param str - Girdi olarak bir string alıyor
     * @return - Tekrar eden karakterlerin kaldırıldığı bir string döndürüyor
     */
    public static String remove_Dublicates(String str) {
        // Eğer string boşsa, hata fırlatıyoruz ki metod boş inputla çalışmasın
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The given String can not be empty");
        }

        // Yeni string’i oluşturmak için StringBuilder kullanıyoruz, çünkü performanslı
        StringBuilder newStr = new StringBuilder();

        // String boşalana kadar döngü devam edecek
        while (!str.isEmpty()) {
            // İlk karakteri alıyoruz (örneğin "AAAGGGBBCDDEEFAAA" için 'A')
            char firstChar = str.charAt(0);
            // Bu karakteri yeni string’e ekliyoruz
            newStr.append(firstChar);
            // İlk karakterin tüm tekrarlarını string’den silip kalanını alıyoruz
            // Mesela "AAAGGGBBCDDEEFAAA" -> "GGGBBCDDEEF" oluyor
            str = str.replaceAll(str.substring(0, 1), "").trim();
            // trim() baştaki/sondaki boşlukları temizliyor (bu örnekte pek gerek yok ama genel bir önlem)
        }

        // Sonucu string olarak döndürüyoruz
        return newStr.toString();
    }
}
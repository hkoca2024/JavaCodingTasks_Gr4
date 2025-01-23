package enes;

public class Task02_Finra {

    public static void main(String[] args) {

        finra(60);

    }

    /**
     * finra metodu, bir tamsayı parametresi alır ve bu sayının 3, 5 veya 15'e bölünüp bölünmediğini kontrol eder.
     *
     * @param num Kontrol edilecek sayı.
     */

    public static void finra(int num) {
        // Sayının 0'dan büyük ve 30'dan küçük veya eşit olup olmadığını kontrol ediyoruz.
        if (num > 0 && num <= 30) {

            // Sayı 15'e tam bölünüyorsa (15, 3 ve 5'in ortak katıdır).
            if (num % 15 == 0) {
                System.out.println("FINRA"); // Ekrana "FINRA" yazdırılır.
            }
            // Sayı 3'e tam bölünüyorsa.
            else if (num % 3 == 0) {
                System.out.println("FIN"); // Ekrana "FIN" yazdırılır.
            }
            // Sayı 5'e tam bölünüyorsa.
            else if (num % 5 == 0) {
                System.out.println("RA"); // Ekrana "RA" yazdırılır.
            }
            // Sayı 3, 5 veya 15'e bölünemiyorsa.
            else {
                System.out.println("This number can not be divided by 3, 5 or 15"); // Uyarı mesajı yazdırılır.
            }
        }

        // Sayı 0'dan küçük veya 30'dan büyükse bu mesaj yazdırılır.
        System.out.println("The number can not be less than 1 or greater than 30");
    }
}
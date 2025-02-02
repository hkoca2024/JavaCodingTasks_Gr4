package enes;

public class Task03_Swap_Numbers {

    /**
     * Bu program, iki tam sayı değişkeninin değerlerini takas eder (swap).
     * Örneğin, a = 5 ve b = 10 ise, takas işleminden sonra a = 10 ve b = 5 olur.
     * Bu işlem, geçici bir değişken (temp) kullanılarak gerçekleştirilir.
     */
    public static void main(String[] args) {
        // İki tam sayı değişkeni tanımlanıyor.
        int a = 5;
        int b = 10;

        // Takas işlemi için geçici bir değişken kullanılıyor.
        int temp = a; // a'nın değeri temp'e atanıyor. (temp = 5)
        a = b;        // b'nin değeri a'ya atanıyor. (a = 10)
        b = temp;     // temp'te saklanan değer b'ye atanıyor. (b = 5)

        // Takas işlemi sonrası değişken değerleri ekrana yazdırılıyor.
        System.out.println("a: " + a); // Çıktı: a: 10
        System.out.println("b: " + b); // Çıktı: b: 5
    }
}
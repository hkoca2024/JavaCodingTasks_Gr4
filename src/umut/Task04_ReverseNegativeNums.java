package umut;

import java.util.Scanner;

public class Task04_ReverseNegativeNums {

    public static void main(String[] args) {

        System.out.println("Çok basamaklı negatif bir sayı girin: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        //Aşağıda oluşturduğumuz metodu çağırıyoruz
        reverseNegativeNumber(num);
    }


    /**
     * Bu method, negatif bir sayının rakamlarını ters çevirir
     *
     * @param number Rakamları ters çevrilecek negatif sayı
     */

    public static void reverseNegativeNumber(int number) {

        // 1. Alınan negatif sayıyı pozitif yap
        if (number < 0) {
            number = -number;
        }

        // 2. Sayıyı Stringe dönüştür
        StringBuilder strNumber = new StringBuilder(String.valueOf(number));

        // 3. Sayının (yani şuanki Stringin) yazılışını ters çevir
        String reversedStr = strNumber.reverse().toString();

        // 4. Şuanki Stringi, integer a çevir ve -1 ile çarparak yazdır
        System.out.println(Integer.parseInt(reversedStr) * -1);

    }
}


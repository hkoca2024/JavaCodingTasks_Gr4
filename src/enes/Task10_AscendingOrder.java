package enes;

/*
Görevimiz bir int dizisini artan sırayla (ascending order) sıralamak
ve bunu Arrays sınıfını kullanarak yapmak.

Örnek dizi {10, 9, 8, 7, 9, 10} ve beklenen çıktı {7, 8, 9, 9, 10, 10}
 */

// Gerekli kütüphaneyi import ediyoruz. Arrays sınıfını kullanmak için bu lazım.
import java.util.Arrays;

public class Task10_AscendingOrder {
    // sort adında bir metod tanımlıyoruz. Parametre olarak int tipinde bir dizi (arr) alıyor.
    // Bu metod diziyi sıralayacak ve void olduğu için bir şey döndürmeyecek (direkt diziyi değiştirecek).
    public static void sort(int[] arr) {
        // Arrays.sort() metodunu kullanıyoruz. Bu metod, verilen diziyi artan sırayla sıralar.
        // Örneğin: {10, 9, 8, 7, 9, 10} -> {7, 8, 9, 9, 10, 10}
        Arrays.sort(arr);

        // Not: Arrays.sort() metodu, diziyi "in-place" sıralar, yani orijinal diziyi değiştirir.
        // Yeni bir dizi oluşturmaz, arr'nin içeriği direkt değişir.
    }

    // main metodu, kodu test etmek için kullanıyoruz.
    public static void main(String[] args) {
        // Örnek diziyi oluşturuyoruz: {10, 9, 8, 7, 9, 10}
        int[] arr = {10, 9, 8, 7, 9, 10};

        // Diziyi sıralamadan önce orijinal halini yazdıralım ki farkı görelim.
        System.out.println("Sıralamadan önce: " + Arrays.toString(arr));
        // Arrays.toString() metodu, diziyi okunabilir bir string'e çevirir: [10, 9, 8, 7, 9, 10]

        // sort metodunu çağırıyoruz, bu dizi üzerinde çalışacak.
        sort(arr);

        // Sıralamadan sonra diziyi yazdıralım.
        System.out.println("Sıralamadan sonra: " + Arrays.toString(arr));
        // Çıktı: [7, 8, 9, 9, 10, 10]
    }
}
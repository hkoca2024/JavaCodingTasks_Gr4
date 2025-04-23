package enes;

/*
Görev: isValidPassword adında bir metod yazacağız.
Bu metod bir şifreyi (String) alacak ve geçerli olup olmadığını kontrol edecek.

Kurallar:
Şifre en az 6 karakter olmalı ve boşluk içermemeli.
Şifrede en az bir büyük harf (uppercase letter) olmalı.
Şifrede en az bir küçük harf (lowercase letter) olmalı.
Şifrede en az bir özel karakter (special character) olmalı.
Şifrede en az bir rakam (digit) olmalı.
Sonuç: Eğer tüm kurallar sağlanıyorsa true, yoksa false dönecek.
 */

public class Task09_PasswordValidator {
    // isValidPassword metodu: Şifreyi kontrol edecek ve boolean bir değer döndürecek.
    public static boolean isValidPassword(String password) {
        // Kural 1: Şifre en az 6 karakter olmalı ve boşluk içermemeli.
        // password.length() ile şifrenin uzunluğunu kontrol ediyoruz.
        // password.contains(" ") ile şifrede boşluk olup olmadığını kontrol ediyoruz.
        if (password.length() < 6 || password.contains(" ")) {
            System.out.println("Kural 1 başarısız: Şifre 6 karakterden kısa veya boşluk içeriyor.");
            return false;
        }

        // Kural 2: Şifrede en az bir büyük harf olmalı.
        // Her karakteri kontrol etmek için bir döngü kullanıyoruz.
        boolean hasUpperCase = false; // Büyük harf var mı?
        for (char c : password.toCharArray()) {
            // Character.isUpperCase() metodu, bir karakterin büyük harf olup olmadığını kontrol eder.
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break; // Bir tane bulduk, döngüden çıkabiliriz.
            }
        }
        if (!hasUpperCase) {
            System.out.println("Kural 2 başarısız: Şifrede büyük harf yok.");
            return false;
        }

        // Kural 3: Şifrede en az bir küçük harf olmalı.
        boolean hasLowerCase = false; // Küçük harf var mı?
        for (char c : password.toCharArray()) {
            // Character.isLowerCase() metodu, bir karakterin küçük harf olup olmadığını kontrol eder.
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            System.out.println("Kural 3 başarısız: Şifrede küçük harf yok.");
            return false;
        }

        // Kural 4: Şifrede en az bir özel karakter olmalı.
        // Özel karakterleri bir String içinde tanımlıyoruz (örneğin: !@#$%^&* gibi).
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        boolean hasSpecialChar = false; // Özel karakter var mı?
        for (char c : password.toCharArray()) {
            // specialCharacters.contains() ile karakterin özel karakterler içinde olup olmadığını kontrol ediyoruz.
            if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            System.out.println("Kural 4 başarısız: Şifrede özel karakter yok.");
            return false;
        }

        // Kural 5: Şifrede en az bir rakam olmalı.
        boolean hasDigit = false; // Rakam var mı?
        for (char c : password.toCharArray()) {
            // Character.isDigit() metodu, bir karakterin rakam olup olmadığını kontrol eder.
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            System.out.println("Kural 5 başarısız: Şifrede rakam yok.");
            return false;
        }

        // Eğer buraya kadar geldiysek, tüm kurallar sağlanmış demektir.
        System.out.println("Tüm kurallar sağlandı: Şifre geçerli!");
        return true;
    }

    // main metodu: Test etmek için kullanıyoruz.
    public static void main(String[] args) {
        // Test şifreleri oluşturuyoruz.
        String password1 = "Ab1@def"; // Geçerli: 6 karakter, büyük harf (A), küçük harf (b, d, e, f), özel karakter (@), rakam (1)
        String password2 = "abc123";  // Geçersiz: Özel karakter yok, büyük harf yok
        String password3 = "Ab@ def"; // Geçersiz: Boşluk içeriyor
        String password4 = "A1@";     // Geçersiz: 6 karakterden kısa

        // Testleri çalıştırıyoruz.
        System.out.println("Test 1: " + password1 + " -> " + isValidPassword(password1));
        System.out.println("Test 2: " + password2 + " -> " + isValidPassword(password2));
        System.out.println("Test 3: " + password3 + " -> " + isValidPassword(password3));
        System.out.println("Test 4: " + password4 + " -> " + isValidPassword(password4));
    }
}

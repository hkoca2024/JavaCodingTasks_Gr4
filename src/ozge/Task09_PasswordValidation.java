package ozge;

public class Task09_PasswordValidation {
    /*
    write a return method that can verify if a password is valid or not requirements
    1.must 6 karakter ve no space
    2.en az 1 büyük,1 küçük harf,1 özel ch, 1 rakam olmalı
    3.kriterler uyarsa true yoksa false dönsün
     */
    public static void main(String[] args) {
        String password="Aa1@bc";
        Boolean result=isValidPassword(password);
        System.out.println(result);

    }
    public static boolean isValidPassword(String password) {
       //kriterler
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()-_=+{}[]|;:'\",.<>?/";

        //password inceleme
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            else if (Character.isLowerCase(ch)) hasLowerCase = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (specialChars.contains(String.valueOf(ch))) hasSpecialChar = true;
        }

        // kriterler ile password inceleme uyuşuyor mu kontrol et sonucu dön
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }


}

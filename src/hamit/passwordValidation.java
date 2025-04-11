package hamit;



public class passwordValidation {
    //String .....password validation
    public static void main(String[] args) {
        String str = "B.1cc";

        System.out.println("passwordCheck(str) = " + passwordCheck(str));
    }

    /**
     * this method checks the given password whether it is valid or invalid password.
     * @param str is the given password as a string
     */
    public static boolean passwordCheck(String str) {
        int countSp = 0;
        int countCl = 0;
        int countLl = 0;
        int countDg = 0;


        if (str.length() < 6) {
            throw new IllegalArgumentException("String must be at least 6 characters long.");
        }

        for (int i = 0; i < str.length(); i++) {//with for loop  we count all different character group by using ASCII code
            char ch = str.charAt(i);

            if (Character.isWhitespace(ch)) {  //space control
                throw new IllegalArgumentException("String cannot contain spaces.");
            }

            if (Character.isUpperCase(ch)) {
                countCl++;
            } else if (Character.isLowerCase(ch)) {
                countLl++;
            } else if (Character.isDigit(ch)) {
                countDg++;
            } else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || // if character special character
                    (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126)) {
                countSp++;
            }
        }


        return  (countLl >= 1 && countDg >= 1 && countCl >= 1 && countSp >= 1);

    }

}

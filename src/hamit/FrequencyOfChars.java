package hamit;

public class FrequencyOfChars {
    /*Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {

        String str = "AAABBBFFGGGAAAFFFEEAA";
        System.out.println("the given str = " + str);
        System.out.println("frequencyOfChars(str) = " + frequencyOfChars(str));


    }

    /**
     * this method count the frequency of each character and
     * return each character and frequency
     * *       side by side
     *
     * @param
     */
    public static String frequencyOfChars(String str) {
        if(str.isEmpty()){
            throw  new IllegalArgumentException("string can not be empty");
        }
        StringBuilder newStr = new StringBuilder();
        while (!str.isEmpty()) {
            Character first = str.charAt(0);
            String firstChar = "" + str.charAt(0);
            int count = frequency(first, str);
            newStr.append(firstChar).append(count);
            str=str.replaceAll(firstChar,"").trim();
        }
        return newStr.toString();
    }

    public static int frequency(Character c, String str) {
        int count = 0;
        for (Character each : str.toCharArray()) {
            if (each == c) {
                count++;
            }
        }
        return count;
    }
}

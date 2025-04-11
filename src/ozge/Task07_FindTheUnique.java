package ozge;

public class Task07_FindTheUnique {
    /*
    Write a return method that can find the unique characters from the string
    Ex: unique("AAABBBCCCDEF") ==> "DEF"
     */
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String result = unique(str);
        System.out.println(result);
    }

    /**
     * This method finds the unique characters
     * @param str
     * @return
     */
    public static String unique(String str) {

        StringBuilder uniqueChars = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                uniqueChars.append(ch);
            }
        }

        return uniqueChars.toString();
    }


}
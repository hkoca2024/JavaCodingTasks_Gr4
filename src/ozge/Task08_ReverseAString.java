package ozge;

public class Task08_ReverseAString {
    /*
    reverse the given String
     */

    public static void main(String[] args) {
        String str="rengarenk";
        String result= reverse(str);
        System.out.println(result);
    }

    /**
     * This method reverses the order of the characters
     * @param str
     * @return
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }


}

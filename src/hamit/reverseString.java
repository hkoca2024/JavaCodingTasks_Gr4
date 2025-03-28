package hamit;

public class reverseString {
    /*
    reverse the given String
     */
    public static void main(String[] args) {
        String str="abDgF23t";
        System.out.println("str = " + str);
        System.out.println("reverse_String(str) = " + reverse_String(str));
    }

    /**
     *
     * @param str
     * @return reverse of str  takes one argument
     */
    public static String  reverse_String(String str) {
        if(str.isEmpty()){
            throw new IllegalArgumentException("The given String can not be empty");
        }
        String revStr=" ";//  to keep  reverse string we create an empty string
        while (!str.isEmpty()) {
        String  last=str.substring(str.length()-1);// we take last element from str
            revStr+=last;// we get  last element of str and add to revStr
            str=str.replace(last,"");// we delete last element of str
            str=str.trim();// send to beginning of loop if it is not empty
        }
        return revStr;
    }
}

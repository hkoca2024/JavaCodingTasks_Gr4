package hamit;

public class removeDublicates {
    public static void main(String[] args) {
        String str="AAAGGGBBCDDEEFAAA";
        System.out.println("the given str = "+str);
        System.out.println("remove_Dublicates(str) = " + remove_Dublicates(str));


    }

    /**
     *
     * @param str
     * @return remove dublicates from the given string
     */
    public static String remove_Dublicates(String str) {
        if(str.isEmpty()){
            throw new IllegalArgumentException("The given String can not be empty");
        }
        StringBuilder newStr=new StringBuilder();
        while (!str.isEmpty()){

            newStr.append(str.charAt(0));
            str=str.replaceAll(str.substring(0,1),"").trim();
        }
        return newStr.toString();


    }


}

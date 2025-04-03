package ozge;

public class Task06_RemoveDublicates {
    /*
    Verilen stringteki tekrarlar kaldırılıp uniq hale getirilecek
    ex. str="AAAGGGBBCDDEEFAAA"; --> str="AGBCDEF";
     */
    public static void main(String[] args) {
        String str = "AAAGGGBBCDDEEFAAA";
        String result = removeDuplicates(str);
        System.out.println(result);

    }

    /**
     *If the first character is different, take it
     * @param str
     * @return
     */
    public static String removeDuplicates(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The given String can not be empty");
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!str.isEmpty()) {
            char firstChar = str.charAt(0);
            stringBuilder.append(firstChar);
            str = str.replaceAll(str.substring(0, 1), "");
        }

        return stringBuilder.toString();
    }
}

package umut;

/*
   Write a return method that can find the unique characters from the string
   Ex: unique("AAABBBCCCDEF) ==> "DEF
*/

public class Task07_FindTheUnique {
    public static void main(String[] args) {
        String givenWord = "ABB33nnAN+BB5B+CKzH-NP7RRV";

        System.out.println(findTheUnique(givenWord));

    }

    /**
     * Finds the unique characters in a string.
     * @param str The input string.
     * @return a string containing only the characters which appear only once.
     */
    public static String findTheUnique(String str) {

        StringBuilder buildString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    counter++;
                }
            }

            if (counter == 1) {
                buildString.append(current);
            }

        }
        return buildString.toString();
    }
}
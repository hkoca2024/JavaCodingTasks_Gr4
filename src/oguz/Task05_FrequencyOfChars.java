package oguz;

public class Task05_FrequencyOfChars {

    /**
     * This method calculates the frequency of each character in a given string without using HashMap.
     * @param str The input string for which character frequencies need to be calculated.
     * @return A string representation of characters and their frequencies.
     */
    public static String findFrequency(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        StringBuilder checkedChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (checkedChars.toString().indexOf(currentChar) != -1) {
                continue; // Skip if character is already counted
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            result.append(currentChar).append(count);
            checkedChars.append(currentChar);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input = "AAABBCDD";
        System.out.println("String: " + input);
        System.out.println(findFrequency(input)); // Output: A3B2C1D2
        System.out.println("=========================================");
        input = "AABBACCCABDDABCDEABCDEE";
        System.out.println("String: " + input);
        System.out.println(findFrequency(input)); // Output: A6B5C5D4E3

    }

}

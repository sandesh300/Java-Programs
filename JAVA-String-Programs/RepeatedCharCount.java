// Program to print the number of repeated characters. 

public class RepeatedCharCount {

    static int countRepeatedCharacters(String str) {
        str = str.toLowerCase();

        char[] charArray = str.toCharArray();

        // Array to track character counts for 'a' to 'z'
        int[] charCounts = new int[26];
        int repeatedCount = 0;

        // Count the occurrences of alphabetic characters
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            // Check if the character is a letter (ignore numbers and special characters)
            if (ch >= 'a' && ch <= 'z') {
                charCounts[ch - 'a']++;
            }
        }

        // Count the characters that appear more than once
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                repeatedCount++;
            }
        }

        return repeatedCount;
    }

    public static void main(String[] args) {
        String str = "Hello World 123!! How are you?";
        int result = countRepeatedCharacters(str);
        System.out.println("Number of repeated characters: " + result);
    }
}

/*
 * Number of repeated characters: 6
 */
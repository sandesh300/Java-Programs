/* Remove All Duplicates from a String.
Problem Statement: Given a String remove all the duplicate characters from the given String.

Example 1:
Input: s = "bcabc"
Output: “bca"

Example 2:
Input: s = "cbacdcbc"
Output: "cbad" 
*/

public class RemoveDuplicateChar {
    public static String removeDuplicateLetter(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    String str = "bcabc";
    System.out.println("The String after removing all the duplicate characters is: " + removeDuplicateLetter(str)); 
    }
}

// The String after removing all the duplicate characters is: bca

// Time Complexity: O(n^2)
// Space Complexity: O(1)
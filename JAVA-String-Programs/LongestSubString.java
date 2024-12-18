// Q - Length of Longest Substring without any Repeating Character
/* 
Example 1:
Input: s = ”abcabcbb”
Output: 3
Explanation: The answer is abc with length of 3.

Example 2:
Input: s = ”bbbbb”
Output: 1
Explanation: The answer is b with length of 1 units.
*/

import java.util.*;

public class LongestSubString {
    static int longestSubstring(String str) {

        if (str.length() == 0)
            return 0;
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) 
        {
            Set<Character> se = new HashSet<>();
            for (int j = i; j < str.length(); j++) 
            {
                if (se.contains(str.charAt(j))) // if element found so mark it as ans and break from the loop
                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        return maxans;
    }

    public static void main(String args[]) {
        String str = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + longestSubstring(str));

    }
}

/*
The length of the longest substring without repeating characters is: 3
 */
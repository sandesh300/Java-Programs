// Program to check the given string is anagram or not.

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "Brag";
		String str2 = "Grab";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("String not a anagram");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			if (Arrays.equals(string1, string2) == true) {
				System.out.println("String is anagram");
			} else {
				System.out.println("String not anagram");
			}
		}
	}
}

// output - String is anagram
// Time Complexity: O(n log n) for sorting the strings, where n is the length of the strings.
// Space Complexity: O(n) for storing the character arrays.
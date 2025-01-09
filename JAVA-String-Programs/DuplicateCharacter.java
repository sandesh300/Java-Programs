// Program to print the duplicate characters from the string.

public class DuplicateCharacter {
	public static void main(String[] args) {

		String str = "Great responsibility";
		int count;

		char string[] = str.toCharArray();

		System.out.println("Duplicate character of string: ");

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = '0';
				}
			}
			if (count > 1 && string[i] != '0') {
				System.out.println(string[i]);
			}
		}
	}
}

// op - Duplicate character of string: r, e, t, s, i
// Time Complexity: O(n^2) where n is the length of the string.
// Space Complexity: O(n) for storing the character array.
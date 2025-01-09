// Program to print the duplicate word from the string.

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "Big black dog, big Black cat";
		int count;

		str = str.toLowerCase();
		String words[] = str.split(" ");

		System.out.println("Duplicate words in a given String: ");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0")

				System.out.println(words[i]);
		}
	}
}

// op - Duplicate words in a given String: big, black
// Time Complexity: O(n^2) where n is the length of the string.
// Space Complexity: O(n) for storing the words array.
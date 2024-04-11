// //Find the number of occurrences of a character in a String?

public class NumberOfOccuranceCharacter {
	public static int countOccurrences(String str, char targetChar) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == targetChar) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "Hello, world!";
		char targetChar = 'l';
		int occurrences = countOccurrences(str, targetChar);
		System.out.println("Number of occurrences of '" + targetChar + "' in the string: " + occurrences); // Number of
																											// occurrences
																											// of 'l' in
																											// the
																											// string: 3

	}
}

// Program to count the characters from the string.

public class CountCharacters {
	public static void main(String[] args) {
		int count = 0;
		String str = "Good morning sandy";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		System.out.println("The characters in string is= " + count);
	}
}

// output - The characters in string is= 16
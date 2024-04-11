
public class StringPalindrome {
	public static void main(String[] args) {

		String str = "radar";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		if (reverse.equals(str)) {
			System.out.println("String is palindrome. ");
		} else {
			System.out.println("String is not palindrome.");
		}
	}
}

// op = String is palindrome.
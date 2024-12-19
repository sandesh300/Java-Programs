// Print all permutations of a string in Java

public class PermutationString {

	static void printPermutn(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			// Rest of the string after excluding the ith character
			String values = str.substring(0, i) +
					str.substring(i + 1);

			// Recursive call
			printPermutn(values, ans + ch);
		}
	}

	public static void main(String[] args) {
		String s = "sandesh";
		printPermutn(s, "");
	}
}

/*
ab
ac
ba
bc
ca
cb
 */
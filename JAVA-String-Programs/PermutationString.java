// Print all permutations of a string in Java

public class PermutationString {

	static void printPermutn(String str, String ans) {
		
		if (str.length() == 0)    //if the length of the input string str becomes 0, it means that all characters have been used to form a permutation. In this case, it prints the current permutation ans and returns.
			{
		    System.out.println(ans + " ");
		  	return;
		    }

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding the ith character
			String values = str.substring(0, i) +
					str.substring(i + 1);

			// Recursive call
			printPermutn(values, ans + ch);
		}
	}

	public static void main(String[] args) {
		String s = "sandy";
		printPermutn(s, "");
	}
}

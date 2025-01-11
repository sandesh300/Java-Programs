
public class ReplaceSpace {
	public static void main(String[] args) {

		String str = "Once upon a time in mumbai";
		char ch = '+';

		str = str.replace(' ', ch);

		System.out.println("String after replace space= " + str);
	}
}

// op - String after replace space= Once+upon+a+time+in+mumbai
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LowerToUpper {

	public static void main(String[] args) {
		String str = "Great Power";
		StringBuffer newstr = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}

			else if (Character.isUpperCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));

			}

		}
		System.out.println("The character is: " + newstr); // The character is: gREAT pOWER
	}

}

// Time Complexity: O(n)
// Space Complexity: O(n)
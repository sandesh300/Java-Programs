
public class VowelsANDConsonant {
	public static void main(String[] args) {
		int vCount = 0, cCount = 0;

		String str = "This is my first program in java ";

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;

			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Vovels are " + vCount);
		System.out.println("consonant are " + cCount);
	}
}

/*
Vovels are 8
consonant are 18
 */

// Time Complexity: O(n)
// Space Complexity: O(1)
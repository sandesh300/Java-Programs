
public class ReverseStringusingStaticMethod {
	static String reverseStr(String str) {
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + (str.charAt(i));
		}
		return reverse;
	}

	public static void main(String[] args) {

		String str = "Sandesh";
		System.out.println("Reverse string is = " + reverseStr(str));
	}

}

// op - Reverse string is = hsednaS
// Time Complexity: O(n)
// Space Complexity: O(1)
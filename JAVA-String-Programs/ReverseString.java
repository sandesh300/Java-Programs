// Program to reverse the string.

public class ReverseString {

	public static void main(String[] args) {

		String str = "Sandesh";
		String reversestr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversestr = reversestr + str.charAt(i);
		}

		System.out.println("Reverse String is = " + reversestr);  // Reverse String is = hsednaS
	}
}

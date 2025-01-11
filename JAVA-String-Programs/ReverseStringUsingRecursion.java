//reverse a string word by word using recursive function

public class ReverseStringUsingRecursion {

	public static String reverseString(String s) {
		if (s.isEmpty())
			return s;
		return reverseString(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		String str = "I am going to school";
		String reversed = reverseString(str);

		System.out.println("The reversed string is= " + reversed);

	}

}

// op = The reversed string is= loohcs ot gniog ma I

// Time Complexity: O(n)
// Space Complexity: O(n)
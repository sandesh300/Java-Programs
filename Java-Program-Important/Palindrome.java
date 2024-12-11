// Program to check the number is palindrome or not.

public class Palindrome {
	public static void main(String[] args) {

		int no = 121;
		int temp = no;
		int reverse = 0, rem;

		while (temp > 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}

		if (no == reverse) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}
	}

}

// output = Palindrome number
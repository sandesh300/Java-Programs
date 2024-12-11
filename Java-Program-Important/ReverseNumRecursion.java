// Program to reverse the numbner by recursion.

public class ReverseNumRecursion {

	public static void reverseNumber(int number) {
		if (number < 10) {
			System.out.println(number);
		} else {
			System.out.print(number % 10);
			reverseNumber(number / 10);
		}
	}

	static public void main(String[] args) {
		int num = 12345;

		reverseNumber(num);

	}
}

/*
  output =
  5
  4
  3
  2
  1
 */
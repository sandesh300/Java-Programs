// Program to print the ArmStrong Number

public class ArmstrongNumber {

	public static void main(String[] args) {

		int no = 153;
		int temp = no;
		int result = 0, rem;

		while (temp > 0) {
			rem = temp % 10;
			result = result + (rem * rem * rem);
			temp = temp / 10;
		}

		if (no == result) {
			System.out.println(no + " is an Armstrong number");
		} else {
			System.out.println(no + " is not an Armstrong number");
		}
	}
}

// output = 153 is an Armstrong number
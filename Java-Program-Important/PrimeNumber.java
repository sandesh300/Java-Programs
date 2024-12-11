// Program to check number is prime or not.

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 9;
		int temp = 0;

		for (int i = 2; i < no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}

		if (temp == 0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not prime number");
		}

	}

}

// output = Prime number

/* ------------------------------------------------------------------------------------------------------------------------------
// Program to print prime numbers between 1 to 100

	public static void main(String[] args) {
		for (int no = 1; no < 100; no++)

		{
			int temp = 0;
			for (int i = 2; i < no - 1; i++) {
				if (no % i == 0) {
					temp = temp + 1;
				}
			}

			if (temp == 0) {
				System.out.println(no);
			} else {
				temp = 0;
			}
		}
	}
}

// output = 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

*/

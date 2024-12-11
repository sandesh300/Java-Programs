//Recursion program of fibonacci numbers.

public class FibonacciSeriesRecursion {

	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {

		int count = 10;
		System.out.println(n1 + " " + n2);
		printFibonacci(count - 2);
	}

}

// output = 0 1 1 2 3 5 8 13 21 34
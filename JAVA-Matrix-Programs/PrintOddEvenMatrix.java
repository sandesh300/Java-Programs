// Print the count of odd and even numbers in a matrix

public class PrintOddEvenMatrix {
	public static void main(String[] args) {
		int rows, cols, countOdd = 0, countEven = 0;

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rows = a.length;
		cols = a[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] % 2 == 0)
					countEven++;
				else
					countOdd++;
			}
		}
		System.out.println(" Even number= " + countEven);
		System.out.println(" odd number= " + countOdd);

	}
}

// output - Even number= 4
//          odd number= 5
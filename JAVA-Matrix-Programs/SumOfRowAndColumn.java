// Program to find the sum of each row and each column of a matrix

public class SumOfRowAndColumn {
	public static void main(String[] args) {
		int rows, cols, sumRow, sumCol;

		int a[][] = new int[][] {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};

		rows = a.length;
		cols = a[0].length;

		for (int i = 0; i < rows; i++) {
			sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow = sumRow + a[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " rows: " + sumRow);
		}

		for (int i = 0; i < cols; i++) {
			sumCol = 0;
			for (int j = 0; j < rows; j++) {
				sumCol = sumCol + a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " Column : " + sumCol);
		}

	}
}

/*
Sum of 1 rows: 6
Sum of 2 rows: 15
Sum of 3 rows: 24
Sum of 1 Column : 12
Sum of 2 Column : 15
Sum of 3 Column : 18
 */
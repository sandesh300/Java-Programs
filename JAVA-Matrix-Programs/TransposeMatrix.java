// Transpose of a matrix is obtained by changing rows to columns and columns to rows.

public class TransposeMatrix {
	public static void main(String[] args) {

		int rows, cols;
		int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rows = a.length;
		cols = a[0].length;

		int t[][] = new int[cols][rows];

		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				t[i][j] = a[j][i];
			}
		}

		System.out.println("Showing the Transporse of matrix");
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}

	}
}

/*
Showing the Transporse of matrix
1 4 7
2 5 8
3 6 9
 */
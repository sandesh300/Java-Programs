// Write a Java Program to Multiply Two Matrices.

public class ProductMatrix {
	public static void main(String[] args) {
		int rows1, cols1, rows2, cols2;

		// int a[][]=new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };

		// int b[][]=new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };

		// Initialize matrix a
		int a[][] = {
				{ 1, 3, 2 },
				{ 3, 1, 1 },
				{ 1, 2, 2 }
		};

		// Initialize matrix b
		int b[][] = {
				{ 2, 1, 1 },
				{ 1, 0, 1 },
				{ 1, 3, 1 }
		};

		rows1 = a.length;
		cols1 = a[0].length;

		rows2 = b.length;
		cols2 = b[0].length;

		if (cols1 != rows2) {
			System.out.println("Matrices cannot be multiplied");
		} else {
			int prod[][] = new int[rows1][cols2];

			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < cols2; j++) {
					for (int k = 0; k < rows2; k++) {
						prod[i][j] = prod[i][j] + a[i][k] * b[k][j];

					}
				}
			}
			System.out.println("product of Matrix== ");
			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < cols2; j++) {
					System.out.print(prod[i][j] + " ");
				}
				System.out.println();
			}
		}

	}
}

/*
product of Matrix==
7 7 6 
8 6 5 
6 7 5 
 */
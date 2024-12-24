// Program to add two matrix in java.

public class AddtwoMatrix {
	public static void main(String[] args) {

		int a[][] = { { 10, 12, 13 }, { 4, 5, 11 }, { 6, 8, 5 } };
		int b[][] = { { 6, 1, 4 }, { 8, 5, 2 }, { 9, 5, 4 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] * b[i][j]; // if you set " - " sign then subtraction operation, if you set
												// " * " sign then multiplication operation occurs

				System.out.print(c[i][j] + " ");
			}

			System.out.println();
		}
	}
}

/*
output - 
60 12 52 
32 25 22 
54 40 20 
 */
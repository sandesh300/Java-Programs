// Program to print the maximum element from the array.

public class LargestArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 10, 23, 45, 56, 77 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) // > sign for max array, if you change this to < sign it print small element
				max = arr[i];
		}
		System.out.println("largest: " + max); // largest: 77
	}
}

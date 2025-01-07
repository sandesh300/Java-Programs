// Program to print the minimum element from the array.

public class SmallestArray {

	public static void main(String[] args) {

		int arr[] = { 100, 23, 11, 45, 56, 77 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) // > sign for max array if you change this to < sign it print small array
				min = arr[i];
		}
		System.out.println("smallest: " + min);  // smallest: 11
	}
}

/*
Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(1).
 */
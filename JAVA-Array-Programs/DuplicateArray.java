// Program to print the duplicate array elements.

public class DuplicateArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 7, 8, 8, 7, 3 };

		System.out.println("Displaying duplicate array elemnts= ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}
}

// output = Displaying duplicate array elemnts= 2, 3, 7, 8
// Time Complexity: O(n^2), where n is the number of elements in the array.
// Space Complexity: O(1).

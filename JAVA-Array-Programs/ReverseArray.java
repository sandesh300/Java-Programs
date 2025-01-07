// Program to reverse the array.

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println("displaying an orginal array= ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("\ndisplaying an reverse array= ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}

/*
displaying an orginal array= 
1 2 3 4 5 

displaying an reverse array= 
5 4 3 2 1 

Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(1).
 */
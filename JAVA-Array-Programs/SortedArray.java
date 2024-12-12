
public class SortedArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 21, 34, 223, 45, 667 };
		int temp = 0;

		// System.out.println("");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) // (>) greater than sign for sorted array in ascending order, and (<) less than
										// sign for sorted array in descending order
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("sorted array in Ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

/*
sorted array in Ascending order: 
21 34 45 223 667 
 */
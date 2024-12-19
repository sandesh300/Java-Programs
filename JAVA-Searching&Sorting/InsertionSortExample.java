// Insertion Sort Algorithm. Time Complexity = 0(n^2)

public class InsertionSortExample {
	public static void insertionSort(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 9, 14, 3, 2, 43, 11, 58, 22 };

		System.out.println("Before insertion sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

		insertionSort(arr);
		System.out.println("After insertion sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}
}

/*
Before insertion sort
9  14  3  2  43  11  58  22  
After insertion sort
2  3  9  11  14  22  43  58  
 */ 
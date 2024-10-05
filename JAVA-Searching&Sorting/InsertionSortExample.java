
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

		int arr1[] = { 9, 14, 3, 2, 43, 11, 58, 22 };

		System.out.println("Before insertion sort");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();

		insertionSort(arr1);
		System.out.println("After insertion sort");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}

	}

}

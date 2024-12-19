// Binary-search algorithm.Time Complexicity = 0(log n)

public class BinarySearchExample {
	public static int binarySearch(int arr[], int first, int last, int key) {

		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, last, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int key = 60;
		int last = arr.length - 1;
		int result = binarySearch(arr, 0, last, key);

		if (result == -1) {
			System.out.println("element is not present");
		} else {
			System.out.println("Element present at index: " + result);
		}

	}
}

// output - Element present at index: 5

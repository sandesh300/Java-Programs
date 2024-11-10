// Binary-search algorithm.

public class BinarySearchExample {
	public static int BinarySearch(int arr[], int first, int last, int key) {

		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return BinarySearch(arr, first, mid - 1, key);
			} else {
				return BinarySearch(arr, mid + 1, last, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int key = 60;
		int last = arr.length - 1;
		int result = BinarySearch(arr, 0, last, key);

		if (result == -1) {
			System.out.println("element is not present");

		} else {
			System.out.println("Element present at location= " + result);
		}

	}
}

// output - Element present at location= 5

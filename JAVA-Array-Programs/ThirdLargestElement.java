// Program to print the third largest number from array.

public class ThirdLargestElement {

	public static int getThirdLargest(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length - 3]; // if we write [total-2] then it will print second largest element of an array
	}

	public static void main(String[] args) {
		int arr[] = { 11, 25, 65, 99, 36, 24 };

		System.out.println("third largest number: " + getThirdLargest(arr)); // third largest number: 36

	}
}

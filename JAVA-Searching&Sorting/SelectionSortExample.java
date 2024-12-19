// Selection Sort Algorithm. Time Complexity = 0(n^2)

public class SelectionSortExample {

	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {	
					index = j;
				}
			}
			int smallnumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallnumber;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("array before selction sort ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

		SelectionSort(arr);
		System.out.println("array After selction sort ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

	}
}

/*
array before selction sort 
9  14  3  2  43  11  58  22  
array After selction sort    
2  3  9  11  14  22  43  58 
*/
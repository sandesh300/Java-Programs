// Program to Copy elements form one array to other array.

public class CopyElement {

	public static void main(String[] args) {

		int arr1[] = { 11, 22, 33, 44, 55 }; 
		int arr2[] = new int[arr1.length]; 

		for (int i = 0; i < arr1.length; i++) 
		{
			arr2[i] = arr1[i];
		}

		System.out.println("displaying arr1= ");   
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");  // displaying arr1= 11 22 33 44 55
		}

		System.out.println("displaying arr2 = ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");  // displaying arr2= 11 22 33 44 55
		}

	}
}

 /*  ------------------------------------------------------------------------------------------------------------------------------------
	// Copying char array elements from arr1[] into arr2[] using clone() method.

		char arr1[] = new char[] { 'S', 'A', 'N', 'D', 'E', 'S', 'H' };
		char arr2[] = arr1.clone();

		System.out.println("Elements of arr1[]: ");
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");   // Elements of arr1[]: S A N D E S H 


		System.out.println("\n\nElements of arr2[]: ");
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");   //Elements of arr1[]: S A N D E S H 


*/
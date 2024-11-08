// write the program to print even and odd number from the array.
 
public class EvenOddNumber {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,6};
	
	System.out.println("Even Numbers = ");
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] % 2 == 0)
		{
			System.out.println(arr[i]);     // Even Numbers = 2, 4, 6
		}
	}


	
	System.out.println("Odd Numbers = ");
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] % 2 != 0)
		{
			System.out.println(arr[i]);    // Odd Numbers = 1, 3, 5
		}
	}	

	
}
}

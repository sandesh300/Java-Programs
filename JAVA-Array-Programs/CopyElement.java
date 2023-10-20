import java.util.Scanner;

public class CopyElement {

	public static void main(String[] args) {
		
 	
		int arr1[]=new int[] {11,22,33,44,55};      //creating one array
		int arr2[]=new int[arr1.length];    //creating 2nd array with the size of 1st array
		
		for(int i=0; i<arr1.length; i++)     //copying one array into another
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("displaying first array= ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
	
		System.out.println("\ndisplaying second array = ");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
//------------------------------------------------------------------------------------------------------------------------------------		
		// Copying char array elements from oArray[ ] into nArray[] using clone method.

		   char[ ] oArray =new char[] {'S', 'A', 'N', 'D', 'E', 'S', 'H'};
		    char[ ] nArray = oArray.clone();
		   
		 System.out.println("Elements of oArray[]: ");
		 for (int i = 0; i < oArray.length; i++)
		     System.out.print(oArray[i] + " ");

		 System.out.println("\n\nElements of nArray[]: ");
		 for (int i = 0; i < nArray.length; i++)
		     System.out.print(nArray[i] + " ");
		
	}
}

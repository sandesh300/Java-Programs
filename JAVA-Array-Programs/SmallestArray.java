
public class SmallestArray {

public static void main(String[] args) {
	
	int arr[]=new int[] {10,23,45,56,77};
	int min=arr[0];
	
	for(int i=1; i<arr.length; i++)
	{
		if(arr[i]< min)  // > sign for max array if you change this to < sign it print small array
			min=arr[i];
	}
	System.out.println("largest "+min);
}
}




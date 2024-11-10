// Bubble Sort algorithm.

public class BubbleSortExample {

	public static void BubbleSort(int arr[])
	{
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<(arr.length-i); j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {30,15,5,2,99,60,70,45};
		
		System.out.println("Array before bubble sort= ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	
	BubbleSort(arr);
	System.out.println("Array after bubble sort= ");
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}


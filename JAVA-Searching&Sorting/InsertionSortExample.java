
public class InsertionSortExample {
public static void InsertionSort(int arr[])
{
	for(int j=1; j<arr.length; j++)
	{
		int key=arr[j];
		
		int i=j-1;
		while((i>-1) && (arr[i]>key))
		{
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=key;
	}
}
	
  public static void main(String[] args) {
	
	  int arr1[]= {9,14,3,2,43,11,58,22};
	  
	  System.out.println("Before insertion sort");
	  for(int i=0; i<arr1.length; i++)
	  {
		  System.out.print(arr1[i]+"  ");
	  }
	  System.out.println();
	  
	  
	  InsertionSort(arr1);
	  System.out.println("After insertion sort");
	  for(int i=0; i<arr1.length; i++)
	  {
		  System.out.print(arr1[i]+"  ");
	  }
	  
}
	
}

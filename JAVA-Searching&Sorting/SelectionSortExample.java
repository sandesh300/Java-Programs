
public class SelectionSortExample {

	public static void SelectionSort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			int index=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int smallnumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallnumber;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int arr1[]= {9,14,3,2,43,11,58,22};
		System.out.println("array before selction sort ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+"  ");
		}
		System.out.println();
		
		
		SelectionSort(arr1);
		System.out.println("array After selction sort ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+"  ");
		}
		System.out.println();
		
		
		
		// we can use for each
//		System.out.println("array After selction sort ");
//		for(int p:arr1)
//		{
//			System.out.print(p+"  ");
//		}
		
		
	}
}


public class ThirdLargestElement {
	
	public static int getThirdLargest(int a[], int total)
	{
		int temp;
		for(int i=0; i<total; i++)
		{
			for(int j=i+1; j<total; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];   // if we write [total-2] then it will print second largest element of an array 
	}
										
  public static void main(String[] args) 
  {
  int arr[] = {11,25,65,99,36,24};	

	System.out.println("third largest number = "+getThirdLargest(arr, 6));
	//getThirdLargest(a, 6);
	
}
}

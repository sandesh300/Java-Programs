// Linear-Search program.

public class LinearSearchExample {

	public static int LinearSearch(int arr[], int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				return i;
		}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
	int a1[]= {10,20,30,40,50,60,70,80,90,100};
	
	int key=50;
	
	System.out.println(key+"is found at " +LinearSearch(a1, key));
	
	}
	
}

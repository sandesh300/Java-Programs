
public class EvenOddNumber {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6};
	
	System.out.println("Even Numbers = ");
	for(int i=0; i<a.length; i++)
	{
		if(a[i] % 2 == 0)
		{
			System.out.println(a[i]);     // Even Numbers = 2, 4, 6
		}
	}


	
	System.out.println("Odd Numbers = ");
	for(int i=0; i<a.length; i++)
	{
		if(a[i] % 2 != 0)
		{
			System.out.println(a[i]);    // Odd Numbers = 1, 3, 5
		}
	}	

	
}
}

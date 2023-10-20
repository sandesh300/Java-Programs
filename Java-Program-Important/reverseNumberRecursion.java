import java.util.Scanner;

public class reverseNumberRecursion {

	public static void reverseNumber(int number)
	{
		if(number<10)
		{
			System.out.println(number);
		}
		else
		{
			System.out.print(number%10);
			reverseNumber(number/10);
		}
	}
	
	static public void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ==== ");
		int num=s.nextInt();
		
		reverseNumber(num);
		
	}
	
}

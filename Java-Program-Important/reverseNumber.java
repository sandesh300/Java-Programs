// Program to reverse the number.

public class ReverseNumber {
public static void main(String[] args) {
	
	int num = 12345;
	int reverse = 0;
	int rem;
	
   while(num > 0)
	
	{
		rem = num % 10;
		reverse = reverse * 10 + rem;
		num = num / 10;
	}
	System.out.println("The reversed number is: " + reverse);  //The reversed number is: 54321
}
}

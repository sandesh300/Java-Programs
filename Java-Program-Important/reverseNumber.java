
public class reverseNumber {
public static void main(String[] args) {
	
	int num=12345;
	int reverse=0;
	int remainder;
	
   while(num!=0)
	
	   //for(;num!=0;)
	{
		remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
	System.out.println("The reversed number is "+reverse);
}
}

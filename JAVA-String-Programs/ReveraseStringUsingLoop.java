
public class ReveraseStringUsingLoop {
public static void main(String[] args) {
	
	String str="Javatpoint";
	
	System.out.println("reverse string is= ");
	for(int i=str.length(); i>0; i--)
	{
		System.out.print(str.charAt(i-1));
	}
	
}
}

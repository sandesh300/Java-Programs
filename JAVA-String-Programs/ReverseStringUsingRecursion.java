//reverse a string word by word using recursive function
public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str="I am going to school";
		String reversed=reverseString(str);
		
		System.out.println("The reversed string is= "+reversed);
		 
	}
	
	
	public static String reverseString(String s)
	{
		if(s.isEmpty())
		return s;
		return reverseString(s.substring(1))+s.charAt(0);
	}
	
	
}

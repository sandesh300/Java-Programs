
public class ReverseStringusingStaticMethod {
public static void main(String[] args) {
	
	ReverseStringusingStaticMethod rev=new ReverseStringusingStaticMethod();
	
    String s="Javatpoint";
    System.out.println("Reverse string is "+rev.reverse(s));
}


 public static String reverse(String str)
 {
	 String rev=" ";
	 for(int i=str.length(); i>0; i--)
	 {
		 rev=rev+(str.charAt(i-1));
	 }
	 return rev;
 }
}

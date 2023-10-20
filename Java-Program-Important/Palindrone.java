import java.util.Scanner;

public class Palindrone {
	public static void main(String[] args) {
    
		
		int  no=121;
		 int temp=no;
		 int reverse=0, rem;
		 
		 while(temp>0)
		 {
			 rem= temp%10;
			 reverse = reverse*10 + rem;
			 temp= temp/10;
		 }
		 
		 if(no==reverse)
		 {
			 System.out.println(no+ " Palindrone");
		 }
		 else
		 {
			 System.out.println(no +" not palindrone");
		 }
	}

}

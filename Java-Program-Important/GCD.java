
public class GCD {
public static void main(String[] args) {
	
	int n1= 5021956;
	int n2= 2991019;
	
	while(n1!=n2)
	{
		if(n1>n2)
		
			n1=n1-n2;
		
		else
		
			n2=n2-n1;
		
	}
	System.out.println("the GCD is== "+n2);
}
}


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int no=1634;
		int t1=no;
		int length=0;
		while(t1!=0)
		{
			length=length+1;
			t1=t1/10;
		}
		
		
		int t2=no;
		int arm=0;
		int rem;
		while(t2!=0)
		{
			int mult=1;
			rem=t2%10;
		for(int i=1;i<=length;i++)
		{
			mult=mult*rem;
		}
		arm=arm+mult;
		t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println("it is an Armstrong");
		}
		else
		{
			System.out.println("It is not Armstrong");
		}
	}

}

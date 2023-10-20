
//to check number is prime or not
//7=1 & 7....no-1=2,3,4,5,6...(logic part)

public class PrimeNumber 
{	
	public static void main(String[] args)
	{
    int no=9;      	
    int temp=0;
    
    for(int i=2;i<no-1;i++)
    {
   	 if(no%i==0)
   	 {
   		 temp=temp+1;
   	 }
    }
	
    if(temp==0)
    {
   	 System.out.println(no+" Is Prime");
    }
    else {
   	 System.out.println(no+" Is not prime ");
    }
	
	}
}

	
	//------------------------------------------------------------------------------------------------------------------------------
     //to print prime numbers between 1 to 100....
	///we need 2 for loop 1 for print no and 1 for check condition

	public static void main(String[] args)
	{	
    		for (int no=1;no<100;no++)
    			
    		{
    			int temp=0;
    			for(int i=2;i<no-1;i++)
    			{
    				if(no%i==0)
    				{
    					temp=temp+1;
    				}
    			}
    			
    			if(temp==0)
    			{
    				System.out.println(no);
    			}
    			else
    			{
    				temp=0;
    			}
    		}
	}
}
	



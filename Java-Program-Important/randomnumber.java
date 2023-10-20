import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

////import java.util.concurrent.ThreadLocalRandom;
//
public class randomnumber {

	public static void main(String[] args)
	{
	  Random random=new Random();
	  
	  int x=random.nextInt(1000000);
	  
	  System.out.println(x);
}		
}


//public class randomnumber{
//	public static void main(String[] args)
//	{
//	System.out.println("the 6 digit random number is= ");
//	System.out.println(ThreadLocalRandom.current().nextInt(100000,999999));
//	}
//} 
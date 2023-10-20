import java.util.Random;

public class RandomForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Random rand=new Random();
		System.out.println("Random Number");
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(rand.nextInt(200));
			
		}
	}

}

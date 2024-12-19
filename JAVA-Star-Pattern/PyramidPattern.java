
public class PyramidPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

/*
 

   *    
  * *   
 * * *  
* * * * 


 */
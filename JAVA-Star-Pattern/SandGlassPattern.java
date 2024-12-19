
public class SandGlassPattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

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
 

* * * * 
 * * *  
  * *   
   *    
   *    
  * *   
 * * *  
* * * * 


 */
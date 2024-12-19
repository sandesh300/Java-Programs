// pascals triangle 

public class PascalsTriangle {
	public static void main(String[] args) {

		// right triangle
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

		// downward triangle
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}
}

/*


*  
*  *        
*  *  *     
*  *  *  *  
*  *  *     
*  *        
* 


 */
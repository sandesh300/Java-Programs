
public class RightTrianglePattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
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


 */

// Time Complexity: O(n^2)
// Space Complexity: O(1)
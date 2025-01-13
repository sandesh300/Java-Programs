
public class leftStarPattern {

	public static void main(String[] args) {

		// Loop for each row
		for (int i = 1; i <= 5; i++) {
			// Print spaces for alignment
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			// Print stars for the current row
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}

}

/*


    *
   **
  ***
 ****
*****


 */

// Time Complexity: O(n^2)
// Space Complexity: O(1)
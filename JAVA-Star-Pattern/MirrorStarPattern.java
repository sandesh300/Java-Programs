
public class MirrorStarPattern {
	public static void main(String[] args) {
		for (int i = 4; i >= 1; i--) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}

/*


****
 ***
  **
   *
   * 


 */

// Time Complexity: O(n^2)
// Space Complexity: O(1)
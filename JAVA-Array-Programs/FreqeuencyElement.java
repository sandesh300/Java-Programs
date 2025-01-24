// Write the program to find frequency of elements.

import java.util.Arrays;

public class FreqeuencyElement {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 1, 3, 3, 4, 9 };
		int n = arr.length;
		countFreq(arr, n);
	}

	public static void countFreq(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (visited[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;

				}
			}
			System.out.println(arr[i] + ": " + count);
		}
	}
}

/*
output =
1: 2
3: 3
5: 1
7: 1
9: 2
4: 1

 */

 // Time Complexity: O(n^2), where n is the number of elements in the array.
 // Space Complexity: O(n).

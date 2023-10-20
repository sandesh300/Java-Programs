import java.util.Arrays;


public class RemoveDuplicate {
	
	 public static void main(String[] args) {
	        // Sample array with duplicates
	        int[] arr = {1, 2, 2, 3, 4, 4, 5};

	        // Call the removeDuplicates method to get a new array without duplicates
	        int[] uniqueArr = removeDuplicates(arr);

	        // Print the original array with duplicates and the new array without duplicates
	        System.out.println("Array with duplicates: " + Arrays.toString(arr));
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
	    }

	    public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;

	        // Check for empty or single-element array
	        if (n <= 1) {
	            return arr;
	        }

	        // Sort the array to group duplicates together
	        Arrays.sort(arr);

	        // Count the number of unique elements
	        int uniqueCount = 1;
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                uniqueCount++;
	            }
	        }

	        // Create a new array to store unique elements
	        int[] uniqueArr = new int[uniqueCount];  

	        // Copy unique elements to the new array
	        uniqueArr[0] = arr[0];
	        int j = 1;
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                uniqueArr[j] = arr[i];
	                j++;
	            }
	        }

	        return uniqueArr;
	    }
	}

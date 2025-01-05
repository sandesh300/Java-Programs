import java.util.Arrays;

public class PairCounter {
    static int countPairsWithSum(int[] arr, int sum) {
        // Sort the array
        Arrays.sort(arr);

        int count = 0;
        int left = 0; // Pointer to the leftmost element
        int right = arr.length - 1; // Pointer to the rightmost element

        // Iterate until left pointer is less than right pointer
        while (left < right) {
            int currentSum = arr[left] + arr[right];

            // If currentSum is equal to the target sum, increment count and move both
            // pointers
            if (currentSum == sum) {
                count++;
                left++;
                right--;
            }
            // If currentSum is less than the target sum, move the left pointer to the right
            else if (currentSum < sum) {
                left++;
            }
            // If currentSum is greater than the target sum, move the right pointer to the
            // left
            else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;

        int pairCount = countPairsWithSum(arr, sum);
        System.out.println("Number of pairs with sum " + sum + ": " + pairCount);
    }
}

// output = Number of pairs with sum 6: 2
// Time Complexity: O(n log n), where n is the number of elements in the array.
// Space Complexity: O(1).
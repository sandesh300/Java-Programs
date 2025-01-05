// Find Min and Max element from an Array using less number of Comparisons.

public class MinMaxElement {

    static int[] findMinMax(int[] arr, int low, int high) {
        int[] result = new int[2];

        // Base case: If there is only one element
        if (low == high) {
            result[0] = arr[low]; // Minimum
            result[1] = arr[high]; // Maximum
            return result;
        }

        // If there are two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                result[0] = arr[high]; // Minimum
                result[1] = arr[low]; // Maximum
            } else {
                result[0] = arr[low]; // Minimum
                result[1] = arr[high]; // Maximum
            }
            return result;
        }

        // If there are more than two elements, divide the array and find min/max of
        // each half
        int mid = (low + high) / 2;
        int[] leftMinMax = findMinMax(arr, low, mid);
        int[] rightMinMax = findMinMax(arr, mid + 1, high);

        result[0] = Math.min(leftMinMax[0], rightMinMax[0]); // Minimum
        result[1] = Math.max(leftMinMax[1], rightMinMax[1]); // Maximum

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = 6;
        int[] minMax = findMinMax(arr, 0, arr_size - 1);
        System.out.println("Minimum element: " + minMax[0]);
        System.out.println("Maximum element: " + minMax[1]);
    }
}

/* 
Output:
Minimum element: 1
Maximum element: 3000
Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(log n).
*/
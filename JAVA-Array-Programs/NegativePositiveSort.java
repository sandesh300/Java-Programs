//  Move all the negative numbers to begining and positive number to end in array.

import java.util.Arrays;

public class NegativePositiveSort {
    static void rearrange(int[] arr) {
        int left = 0; // Pointer to the leftmost element
        int right = arr.length - 1; // Pointer to the rightmost element

        // Continue until left pointer crosses right pointer
        while (left <= right) {
            // If the element at left pointer is negative, move the left pointer forward
            if (arr[left] < 0) {
                left++;
            }
            // If the element at right pointer is positive, move the right pointer backward
            else if (arr[right] >= 0) {
                right--;
            }
            // If the element at left pointer is positive and the element at right pointer is negative, swap them
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

        System.out.println("Original array: " + Arrays.toString(arr));
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}

/* 
output - Original array: [-12, 11, -13, -5, 6, -7, 5, -3, -6]
Rearranged array: [-12, -6, -13, -5, -3, -7, 5, 6, 11]
Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(1).
*/

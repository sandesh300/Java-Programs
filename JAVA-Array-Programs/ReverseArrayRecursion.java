// Reverse a given Array in Recursion Approach

import java.util.Arrays;

public class ReverseArrayRecursion {
    
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1 };

        reverseArray(arr, 0, n - 1);  
        System.out.println(Arrays.toString(arr));  // [5, 4, 3, 2, 1]
    }
}

/*
Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(n) for the recursive call stack.
 */
// 6. find wheather one array is subset of another array.

import java.util.Arrays;

public class SubSetChecker {
    static boolean isSubset(int[] arr1, int[] arr2) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        // Iterate through both arrays
        while (i < arr1.length && j < arr2.length) {
            // If arr1[i] is smaller, move pointer i forward
            if (arr1[i] < arr2[j]) {
                i++;
            }
            // If arr1[i] is equal to arr2[j], move both pointers forward
            else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            }
            // If arr1[i] is greater, arr2[j] is not in arr1, return false
            else {
                return false;
            }
        }

        // If all elements of arr2 are found in arr1, return true
        return j == arr2.length;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 1, 5 };

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}

// output = arr2 is a subset of arr1
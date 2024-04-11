// Union oftwo array

import java.util.Arrays;

public class UnionArray {
    static void printUnion(int[] arr1, int[] arr2) {
        // Merge both arrays into a single array
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            mergedArray[index++] = num;
        }
        for (int num : arr2) {
            mergedArray[index++] = num;
        }

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Print the first element
        System.out.print(mergedArray[0] + " ");

        // Traverse the sorted merged array and print elements that are not duplicates
        for (int i = 1; i < mergedArray.length; i++) {
            if (mergedArray[i] != mergedArray[i - 1]) {
                System.out.print(mergedArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5 };
        int[] arr2 = { 2, 3, 5, 6 };

        System.out.println("Union of arrays:");
        printUnion(arr1, arr2);
    }
}

// Union of arrays: 1 2 3 4 5 6
// Program to find intersection of two arrays.

import java.util.Arrays;

public class IntersectionArray {

    static int[] findIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] intersection = new int[Math.min(n1, n2)]; // Intersection can't be larger than the smaller array

        int i = 0, j = 0, k = 0; // Pointers for arr1, arr2, and intersection array respectively

        // Traverse both arrays while both pointers are within their bounds
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) { // If both elements are equal, it's an intersection
                // Add the element to the intersection array
                intersection[k++] = arr1[i];
                // Move both pointers forward
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) { // If element in arr1 is smaller, move pointer in arr1 forward
                i++;
            } else { // If element in arr2 is smaller, move pointer in arr2 forward
                j++;
            }
        }

        // Resize intersection array if necessary
        return Arrays.copyOf(intersection, k);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };

        int[] intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection of arrays: " + Arrays.toString(intersection));
    }
}

// output = Intersection of arrays: [3, 4, 5]
// Time Complexity: O(n * log(n) + m * log(m)), where n and m are the number of elements in the two arrays.
// Space Complexity: O(min(n, m)), where n and m are the number of elements in the two arrays.
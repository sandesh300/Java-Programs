/*
Check if an Array is Sorted.
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.

Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
 */

public class CheckSortedArray {

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(arr1)); // true

        int[] arr2 = { 5, 4, 6, 7, 8 };
        System.out.println(isSorted(arr2)); // false
    }
}


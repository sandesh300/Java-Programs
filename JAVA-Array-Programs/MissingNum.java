public class MissingNum {

    static int findMissingNumber(int[] arr) {
        // Calculate the sum of all integers from 1 to n
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
        }

        // The missing number is the difference between the total sum and the    array sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber); // The missing number is: 3
    }
}

/*
 note : if array starting from the 0 then change : int n = arr.length;
 
 Time Complexity: O(n), where n is the number of elements in the array.
 Space Complexity: O(1).
 
 */
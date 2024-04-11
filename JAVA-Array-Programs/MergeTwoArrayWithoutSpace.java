// Merge two Sorted Arrays Without Extra Space

public class MergeTwoArrayWithoutSpace {

    static void mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Iterate through all elements of arr2
        for (int i = n2 - 1; i >= 0; i--) {
            int last = arr1[n1 - 1];
            int j;

            /*
             * Find the smallest element greater than arr2[i].
             * Move all elements one position ahead till the smallest greater
             * element is not found
             */
            for (j = n1 - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }

            // If there was a greater element
            if (j != n1 - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 8, 10 };
        int arr2[] = { 2, 3, 9 };

        mergeArrays(arr1, arr2);

        System.out.println("Merged array 1:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println("\nMerged array 2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
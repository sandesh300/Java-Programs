// Program to print the merge array.

public class MergeArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 4, 16, 1, 2, 3, 22 };
        int[] mergedArray = mergeArray(a, b);

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");  // 1 2 3 4 4 16 1 2 3 22 
        }
    }

    public static int[] mergeArray(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            merged[count++] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            merged[count++] = b[j];
        }

        return merged;
    }
}

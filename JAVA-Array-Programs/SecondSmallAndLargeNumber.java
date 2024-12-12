// Find Second Smallest and Second Largest Element in an array

public class SecondSmallAndLargeNumber {

    static int secondLargestNum(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }

    static int secondSmallestNum(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 3, 5 };
        System.out.println("Second Largest number is = " + secondLargestNum(arr));
        System.out.println("Second Smallest number is = " + secondSmallestNum(arr));

    }
}

/*
Second Largest number is = 5
Second Smallest number is = 2
 */
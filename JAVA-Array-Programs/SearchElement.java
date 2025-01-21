// Program to search an element in an array

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 40, 80, 100 };

        int searchElement = 20;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Element found in the array");
        else
            System.out.println("Element not found in the array");
    }
}

/*
Output: Element found in the array

time complexity: O(n)
space complexity: O(1)

 */
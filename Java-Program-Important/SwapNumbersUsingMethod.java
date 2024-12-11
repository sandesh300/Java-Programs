// Program to swaps two numbers using method

public class SwapNumbersUsingMethod {
    public static void swap(int a, int b) {
        a = (a & b) + (a | b); // a = a + b

        b = a + (~b) + 1; // b = a - b

        a = a + (~b) + 1; // a = a - b

        System.out.println("After swapping : a= " + a + "b= " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 200;
        swap(a, b);

    }
}

// output = After swapping : a= 200 b= 10

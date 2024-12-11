// Program to print factorial number.

public class FactorialNumber {
    public static void main(String[] args) {
        int no = 5;
        int fact = 1;

        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("factorial no is " + fact);
    }
}

// output = factorial of 5 is 120
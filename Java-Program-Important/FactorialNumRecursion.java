// Recursion program of factorial number.

public class FactorialNumRecursion {

    static int factorial(int no) {

        if (no == 0) {
            return 1;
        } else {
            return (no * factorial(no - 1));
        }
    }

    public static void main(String[] args) {
        int no = 5;
        int fact = factorial(no);
        System.out.println("factorial no: " + fact); // factorial no: 128
    }
}

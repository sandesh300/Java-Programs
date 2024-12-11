// Program to check number is Palindrome Number or not. (Optimal solution)

public class PalindromeNumMethod {

    static boolean palindromeNum(int no) {

        int temp = no;
        int reverse = 0, rem;

        while (temp > 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        if (no == reverse) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int no = 121;
        if (palindromeNum(no)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not palindrome number");
        }
    }
}

// output = palindrome number
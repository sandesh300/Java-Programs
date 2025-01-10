// Program to check string is palindrome or not.

public class PalindromeString {
   public static void main(String[] args) {
      String str = "radar";
      String reverse = "";

      for (int i = str.length() - 1; i >= 0; i--) {
         reverse = reverse + str.charAt(i);
      }
      if (str.equals(reverse)) {
         System.out.println("Palindrome String");
      } else {
         System.out.println("Not Palindrome");
      }
   }
}

// op = Palindrome String
// Time Complexity: O(n)
// Space Complexity: O(n)
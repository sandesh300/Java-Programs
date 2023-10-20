
public class NumberOfOccuranceCharacter {
	   public static int countOccurrences(String str, char targetChar) {  //Find the number of occurrences of a character in a String?
	        int count = 0;

	        for (char c : str.toCharArray()) {
	            if (c == targetChar) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String str = "Hello, world!";
	        char targetChar = 'l';
	        int occurrences = countOccurrences(str, targetChar);
	        System.out.println("Number of occurrences of '" + targetChar + "' in the string: " + occurrences);
	    
}
}

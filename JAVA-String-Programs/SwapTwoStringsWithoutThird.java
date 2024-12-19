
public class SwapTwoStringsWithoutThird {
	public static void main(String[] args) {

		String str1 = "Morning", str2 = "Afternoon";

		System.out.println("Strings Before Swapping = " + str1 + " " + str2);

		str1 = str1 + str2; // concate the both the strings str1 and str2 and store it in str1

		str2 = str1.substring(0, str1.length() - str2.length()); // Extract str2 from updated str1

		str1 = str1.substring(str2.length()); // Extract str1 from updated str1

		System.out.println("After swappig the strings are = " + str1 + " " + str2);

	}
}
/*
Strings Before Swapping = Morning Afternoon
After swappig the strings are = Afternoon Morning
 */

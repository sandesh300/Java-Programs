// Program to print the frequency of characters.

public class FrequencyCharacter {
	public static void main(String[] args) {

		String str = "Sandesh Bhujbal";
		str = str.toLowerCase();

		int freq[] = new int[str.length()]; 

		char string[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;
					string[j] = 'O'; // capital O, to mark characters that have already been counted for frequency calculation
				}
			}
		}

		System.out.println("Character and their frequencies = ");

		for (int i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != 'O') {
				System.out.println(string[i] + " " + freq[i]);
			}
		}

	}
}

/*
Character and their frequencies = 
s 2
a 2
n 1
d 1
e 1
h 2
b 2
u 1
j 1
l 1
*/

// Time Complexity: O(n^2)
// Space Complexity: O(n)
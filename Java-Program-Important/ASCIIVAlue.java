// Program to print the ASCII value of character.

public class ASCIIVAlue {
	public static void main(String[] args) {

		char ch = 'A';
		int asciiValue = (int) ch;

		System.out.println("ASCII value of " + ch + " is = " + asciiValue); // ASCII value of A is = 65

	}
}


/*
to print ASCII values from 0 to 255

for(int i=0; i<255; i++)
 {

 System.out.println("AScii value of " +(char)i+"-"+i);
 }
 */
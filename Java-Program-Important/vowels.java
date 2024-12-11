// Program to check character is vowel or consonant

public class vowels {
	public static void main(String[] args) {

		char ch = 'A';

		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch + " it is vowel");
				break;
			default:
				System.out.println(ch + " It is consonant");
		}
	}

}

// output = A it is vowel

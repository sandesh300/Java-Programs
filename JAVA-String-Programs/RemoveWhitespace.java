
public class RemoveWhitespace {

	public static void main(String[] args) {

		String str = "My NAme is Sandesh..";

		str = str.replaceAll("\\s", "");

		System.out.println("String after the removing white spaces== " + str);
	}
}

// op - String after the removing white spaces== MyNAmeisSandesh.
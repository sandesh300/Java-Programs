// Write the code to count the panctuation from the given string.

public class CountPanctuation {
	public static void main(String[] args) {
		int count = 0;
		String str = "He said  !, she loves you : ? ";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ':' || str.charAt(i) == '?'
					|| str.charAt(i) == '-') {
				count++;
			}
		}
		System.out.println("The Number of panctuation= " + count);
	}
}

// op - The Number of panctuation= 4
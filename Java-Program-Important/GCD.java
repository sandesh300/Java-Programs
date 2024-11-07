// find the Greatest Common Divisor (GCD)

public class GCD {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 15;

		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}

		}
		System.out.println("GCD is = " + n2);
	}

}

// output = GCD is = 5
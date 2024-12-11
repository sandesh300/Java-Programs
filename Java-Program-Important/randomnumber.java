// Program to generate random number.

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();

		int x = random.nextInt(1000000);

		System.out.println("random number: " + x); // random number: 300420
	}
}

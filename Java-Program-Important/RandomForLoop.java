// Program to print the random number.

import java.util.Random;

public class RandomForLoop {

	public static void main(String[] args) {

		Random rand = new Random();
		System.out.println("Random Number: ");

		for (int i = 1; i <= 5; i++) {
			System.out.println(rand.nextInt(200));

		}
	}

}

/*
Random Number: 
73
163
21
122
68
 */
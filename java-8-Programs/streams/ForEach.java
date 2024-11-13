package streams;

import java.util.*;

public class ForEach {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(15);
		arr.add(25);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		System.out.println(arr);

		arr.stream().forEach(System.out::println);

		arr.stream().forEach(i -> {
			System.out.println("the square of " + i + " is = " + (i * i));
		});

	}
}

// [10, 15, 25, 20, 30, 40, 50]
// 10
// 15
// 25
// 20
// 30
// 40
// 50
// the square of 10 is = 100
// the square of 15 is = 225
// the square of 25 is = 625
// the square of 20 is = 400
// the square of 30 is = 900
// the square of 40 is = 1600
// the square of 50 is = 2500


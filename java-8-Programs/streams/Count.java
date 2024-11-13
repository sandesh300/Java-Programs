package streams;

import java.util.ArrayList;
import java.util.*;

public class Count {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(10);
		arr.add(15);
		arr.add(25);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		System.out.println(arr);

		long l2 = arr.stream().filter(i -> i > 15).count();

		System.out.println(l2);
	}
}

// [0, 10, 15, 25, 20, 30, 40, 50]
// 5

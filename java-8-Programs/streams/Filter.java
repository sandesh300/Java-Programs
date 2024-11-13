package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
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

		List<Integer> l2 = arr.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		System.out.println(l2);

	}
}

// [0, 10, 15, 25, 20, 30, 40, 50]
// [15, 25]

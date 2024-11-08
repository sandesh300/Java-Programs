package streams;

import java.util.*;

public class Max {
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
		
		Integer max = arr.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		
		System.out.println(max);
	}

}

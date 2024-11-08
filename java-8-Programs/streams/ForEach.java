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
		
		arr.stream().forEach(System.out :: println);
		
		arr.stream().forEach(i -> {
			System.out.println("the square of " + i + " is = " + (i * i));
		});
		
	}

}

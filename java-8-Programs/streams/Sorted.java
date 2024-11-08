package streams;
import java.util.*;
import java.util.stream.Collectors;

public class Sorted {
 public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(10);
		arr.add(60);
		arr.add(25);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println(arr);
		
		List<Integer> l2 = arr.stream().sorted().collect(Collectors.toList());
		
		System.out.println(l2);
}
}

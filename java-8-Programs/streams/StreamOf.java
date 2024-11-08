package streams;
import java.util.*;
import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		Stream<Integer> s = streamOf(9, 99, 999, 9999);
		s.forEach(System.out::println);
	}

}

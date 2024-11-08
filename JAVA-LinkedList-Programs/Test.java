import java.util.*;

public class Test {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("sandesh");
        ll.add("sanket");
        ll.add("harasha");
        System.out.println(ll);

        String element = ll.get(1);
        System.out.println("Element at index 1 is: " + element); // Corrected the typo in "element"
    }
}

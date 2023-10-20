
public class SwapNumbers {
public static void main(String[] args) {
	
	int x=10;
	int y=200;
	
	  x = x + y;
	  y = x - y;
	  x= x + y;
	
	System.out.println("After swapping=\n  x= " +x+",\n  y= "+y);
}
}



//swap number without using third variable
//  int temp = x;
//  x = y;
//  y = temp;

//swap number using bitwise x-or operator 
// x = x ^ y;
// y = x ^ y;
// x = x ^ y;
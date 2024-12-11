// Program to swap the numbers without using the third variable.

public class SwapNumbers {
	public static void main(String[] args) {

		int x = 10;
		int y = 200;

		System.out.println("Before swapping:  x= " + x + ",  y= " + y);  // Before swapping:  x= 10,  y= 200

		x = x + y;
		y = x - y;
		x = x + y;

		System.out.println("After swapping:  x= " + x + ",  y= " + y);  // After swapping:  x= 220,  y= 10
	}
}


/* 
// swap numbers using third variable

int temp = x;
x = y;
y = temp;


// swap numbers without using third variable
// swap number using bitwise x-or operator

x = x ^ y;
y = x ^ y;
x = x ^ y;

*/
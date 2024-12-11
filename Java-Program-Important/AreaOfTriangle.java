// Program to print the area of triangle.

public class AreaOfTriangle {

	public static double areaTriangle(double height, double breadth) {
		return (height * breadth / 2);

	}

	public static void main(String[] args) {

		double height = 10.56;
		double breadth = 14.45;

		System.out.println("area of triangle= " + areaTriangle(height, breadth));
	}
}

/*
 * double breadth = 20.5;
 * double height = 10.5;
 * 
 * double area=(height * breadth) / 2;
 * 
 * System.out.println("area of triangle is = " + area);
 */
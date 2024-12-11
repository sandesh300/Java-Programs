// Find the Sum of array and average of array.

import java.util.*;

public class AverageNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array  ");
		int size = s.nextInt();
		int[] arr = new int[size];

		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}

		int length = arr.length;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum of number: " + sum);

		double average = sum / length;
		System.out.println("average of number " + average);

	}

}

/*
Enter the size of Array: 
5
enter the elements: 
10
20
30
40
50
sum of number: 150
average of number: 30.0
*/

/*
int[] array= {10,20,30,40,50,60};
int length=array.length;
int sum=0;

for(int i=0; i<array.length; i++)
{
sum+=array[i];
}
double average=sum/length;
System.out.println("average of number "+average);
*/
import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // using for loop
		
//          		 int[] array= {10,20,30,40,50,60};
//           	     int length=array.length;
//		   int sum=0;
//		   
//		   for(int i=0; i<array.length; i++)
//			 {
//				 sum+=array[i];
//			 }
//			 double average=sum/length;
//			 System.out.println("average of number "+average);
//		
//			 
			 
		//int size, length, sum=0, value;
		//double average;
		
		//using input from user
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array  ");
		 int size=s.nextInt();
		 int[] array=new int[size];
		 
		 
		 System.out.println("enter the elements");
		 for(int i=0; i<size; i++)
		 {
			 int value=s.nextInt();
			 array[i]=value;
		 }
		 
		 
		int length=array.length;
		 int sum=0;
		 for(int i=0; i<array.length; i++)
		 {
			 sum+=array[i];
		 }
		 double average=sum/length;
		 System.out.println("average of number "+average);

	}

}

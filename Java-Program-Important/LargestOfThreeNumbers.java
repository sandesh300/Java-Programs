/// Find the larg number from the three numbers.

public class LargestOfThreeNumbers {
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 15;
        int n3 = 44;
       
        int temp, largest;
        
        temp = n1 > n2 ? n1 : n2;
        
        largest = temp > n3 ? temp : n3;
        
		System.out.println("The largest number is = " + largest);

	}
}


// output = The largest number is = 44
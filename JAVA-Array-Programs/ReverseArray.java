
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[]=new int[] {1,2,3,4,5};
		
		System.out.println("displaying an orginal array= ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		System.out.println("\ndisplaying an reverse array= ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

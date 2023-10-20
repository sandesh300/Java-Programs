import java.util.Arrays;
public class SortArraySortMethod {
public static void main(String[] args) {
	
	int arr[]=new int[] {11,22,99,56,54,34,4};

   System.out.printf ("originl array = %s ",Arrays.toString(arr));
   
   Arrays.sort(arr);
   
   System.out.printf("\n Sorted arrray  =  %s",Arrays.toString(arr));
}
}

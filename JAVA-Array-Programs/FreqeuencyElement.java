import java.util.Arrays;
import java.util.Scanner;
public class FreqeuencyElement 
{	
 public static void main(String[] args) {
	int[] arr = {1,3,5,7,9,1,3,3,4,9};
	int n=arr.length;
   countfreq(arr, n);
}
 public static void countfreq(int[] arr, int n)
 {
	 boolean[] visited = new boolean[n];
	 Arrays.fill(visited, false);
	 
	 for(int i=0 ; i<n; i++)
	 {
		 if(visited[i] == true)
			 continue;
		 
		 int count = 1;
		 for(int j=i+1; j<n; j++)
		 {
			 if(arr[i] == arr[j])
			 {
				 visited[j] = true;
				 count++;
				 
			 }
		 }
    System.out.println(arr[i] +" "+ count);
	 }
 }
}
  
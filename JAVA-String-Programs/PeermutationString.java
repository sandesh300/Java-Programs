
public class PeermutationString {

	public static String swapString(String a, int i, int j)
	{
		char b[]=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		
		return String.valueOf(b);
	}
	
	
	public static void main(String[] args) 
	{
		String str="SANDY";
		int len=str.length();
		System.out.println("All the permutations are = ");
		generatePermutation(str, 0, len);
	}
	public static void generatePermutation(String str, int start, int end)
	{
		if(start == end-1)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=start; i<end; i++)
			{
				str=swapString(str, start, i);    //Swapping the string
				
				generatePermutation(str, start+1, end);   //recursively calling the function 
				
				str=swapString(str, start, i);          //backtracking and swapping the character
			}
		}
		
		
		
	}
}

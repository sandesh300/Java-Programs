
public class TriangleMatrix {
public static void main(String[] args) {
	int rows, cols;
	
	int a[][]= {{1,1,1},{1,1,1},{1,1,1}};
	
	rows=a.length;
	cols=a[0].length;
	
	if(rows != cols)
	{
		System.out.println("MAtrices should be square");
	}
	else
	{
		System.out.println("Lower Triangular matrix ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(i<j)   //if you change < to > greater than sign it will print upper triangular matrix
					
					System.out.print("0 ");
				else
					System.out.print(a[i][j]+ " ");
			}
				System.out.println();
			
		}
	}
	
	
	
	
}
}

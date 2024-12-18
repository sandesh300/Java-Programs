// Program to print the substring of string.

public class FindSubsetOfString {
	public static void main(String[] args) {
		String str = "Sandesh";
		int temp = 0;
		int len = str.length();

		String[] arr = new String[len * (len + 1) / 2];

		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("The Subset of String: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

/*
The Subset of String: 
S       
Sa      
San     
Sand    
Sande   
Sandes  
Sandesh 
Sandesh 
a       
an
and
ande
andes
andesh
andesh
n
nd
nde
ndes
ndesh
ndesh
d
de
des
desh
desh
e
es
esh
esh
s
sh
sh
h
h
 */
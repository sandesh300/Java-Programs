
public class FrequencyCharacter {
public static void main(String[] args) {
	
	String str="Picture Perfect";
	str=str.toLowerCase();
	
	int freq[]=new int[str.length()];
	
	char string[]=str.toCharArray();
 	
    for(int i=0; i<str.length(); i++)
    {
    	freq[i]=1;
    	for(int j=i+1; j<str.length(); j++)
    	{
    		if(string[i]==string[j])
    		{
    			freq[i]++;
    			string[j]='O';  // capital O
    		}
    	}
    }
    
    System.out.println("Character and their frequencies = ");
    
    for(int i=0; i<freq.length; i++)
    {
    	if(string[i] !=' ' && string[i]!='O')
    	{
    		System.out.println(string[i]+" "+freq[i]);
    	}
    }
    
    
    
}
}

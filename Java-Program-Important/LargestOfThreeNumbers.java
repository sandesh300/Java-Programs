public class LArgestOfThreeNumbers 
{
public static void main(String[] args) {
	
	int a=220, b=445, c=1190;
	
	int temp, largest;
	
	temp=a>b ? a: b;
	
	largest= temp>c ? temp : c;
	
	System.out.println(largest);
	
}
}

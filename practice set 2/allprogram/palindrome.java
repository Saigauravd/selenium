package allprogram;

public class palindrome {

	
	public static void main(String[] args) {
		int a= 121,rev=0,rim=0,temp = a;
		
		while(a>0)
		{
			
			rim = a%10;
			rev = rev*10+rim;
			a = a/10;
					
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}
}

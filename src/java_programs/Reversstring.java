package java_programs;

public class Reversstring {
	
	public static void main(String[] args) {
		// Reverse String by alphabets
		String string = "esreveR retfA";
		int nos = string.length();
	String rev="";
		System.out.println(nos);
		for (int i= nos-1 ;i>=0;i--)
		{
			rev = rev+string.charAt(i);
			
		}System.out.println(rev);
		
		
		// Reverse String by Word to word
		
		
		String string1 = "After Reverse Number";
		
		 String[] space = string1.split(" ");
		
		int s = space.length-1;
		
		for (int i = s; i>=0;i--)
		{
			System.out.print(space[i]+" ");
		}
														
	} 

}

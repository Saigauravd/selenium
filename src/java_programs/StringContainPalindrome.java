package java_programs;

public class StringContainPalindrome {
	
	
	public static void main(String[] args) {
		String s= "Mom dad is coming";
		s=s.toLowerCase();
		String [] words = s.split(" ");
		for( String word : words) {
			if (test(word))
			{
				System.out.println(word);
			}
		}
		
	}
	
	public static boolean test(String s)
	{
		int i1=0;
		int i2=s.length()-1;
		
		while(i2>i1)
		{
			if(s.charAt(i1)!=s.charAt(i2))
			{
				return false;
				
			}
			i1++;
			i2--;
		}return true;
	}

}

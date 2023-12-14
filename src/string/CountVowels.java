package string;

public class CountVowels {
	
	
	public static void main(String[] args) {
		
		String a= "Saigaurav Dambhe";
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='i')
			{
				count++;
			}
		}System.out.println(count);
		
		
	}

}

package allprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String a ="Saigauravdambhe1997@gmail.com";
		String b = "Dambhe1997@gmail.comsaigaurav";
		a= a.toLowerCase();
		   b=b.toLowerCase();
		
		   char ac[ ]=a.toCharArray();
		   char bc[ ] = b.toCharArray();
		
		   
		   if (a.length()!=b .length())
		   {
			   System.out.println("not an anagram");
		   }
		   else
		   {
			   Arrays.sort(ac);
			   Arrays.sort(bc);
			   
			 boolean result = Arrays.equals(ac, bc);
			   
			 
			 if(result)
			 {
				 System.out.println("Anagram");
			 }
			 else
			 {
				 System.out.println("not");
			 }
			   }
		 
	} 


}

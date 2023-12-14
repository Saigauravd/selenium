package java_programs;

public class AddingNoinString {

	  public static void main(String[] args) {
	  
		   String a="hkjsdfhs89hd1kj3hh78hlkch0nds32j";
		    
		   int sum  =0;
		   for(int i = 0; i <a.length();i++)
		   {
			   
			  
			   
				   if (Character.isDigit(a.charAt(i)))
						   {
					    sum += Character.getNumericValue(a.charAt(i));
						   }
		   }System.out.println(sum);
	//***************************************************************************************	    
	sum=0;
	
		   for(int i = 0; i <a.length();i++)
		   {
	  if (a.charAt(i)>='0'&&a.charAt(i)<='9')
	  {
		  sum+=(a.charAt(i)-'0');
	  }
		   }System.out.println(sum);
	  }   
	
	  
}

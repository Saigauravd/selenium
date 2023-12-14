package allprogram;

public class sumofcharacter {
 public static void main (String[ ]args) {
	String a = "Asfs4djd5fjy3dj7vt65fj";
	
	int j = 0;
	 for (int i = 0; i<a.length();i++)
	 {
		 if (Character.isDigit(a.charAt(i)))
		 {
			 j+=Character.getNumericValue(a.charAt(i));
		 }
		 
	 }
	 System.out.println(j);
	 
	 //*******************************************************************
 }

}
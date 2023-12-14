package java_programs;



public class rough {
	
	 
public static void main(String[] args) {
	String a = "this is String";
	String rev = "",ST="";
	String[] st  = a.split("");int sq = a.length()-1;
	
	for (int i =sq ; i>=0;i--)
	{
	 rev = rev+st[i];
	 ST=ST+rev+" ";
	}System.out.println(rev);
}

	
}	


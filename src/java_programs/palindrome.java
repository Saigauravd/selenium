package java_programs;

public class palindrome {
 public static void main(String[] args) {
	


	int s = 12121;
	int rim = 0;
	int rev =0;
	
	int temp = s;
	while(s>0)
	{
	rim = s%10;//121%10 = 1
	rev =rev*10+rim;// 0+
	s=s/10;
		
	}
	if (temp == rev)
	{
	System.out.println("Palindrome");
}else
{
	System.out.println(" not Palindrome");

}
	
	
 }
}

package java_programs;

public class Primeornot {

	
	 public static void main(String[] args) {
		 
		 int flag = 0;
		 
		 int n = 9; // number to be check
				 
		 if (n==0||n==1)
		 {
			 System.out.println(n+" in not prime");
		 }else
		 {
			 
			 for (int i = 2; i<n;i++)
			 {
				 if(n%i==0)
				 {
					 System.out.println(n+" is not prime");
					  flag =1;
					 break;
				 }}
				 if (flag ==0)
				 {
					 System.out.println(n+" is prime");
				 }
			 }
		 
			 
	 
			 
	 }
	 
	
}

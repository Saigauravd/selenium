package java_programs;

public class Fibonacci {
 public static void main(String[] args) {
	 int a=0;
	 int b=0;
	 int temp = 1;
	 for (int i = 0 ; i<10;i++)
	 { 
		 
		 b= temp+a;
		 temp = a;
		 a=b;
		 System.out.println(a);
	 }
}
}

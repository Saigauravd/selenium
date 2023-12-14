package java_programs;

public class swap {
	public static void main(String[] args) {
		
		//with temp veriable 
		int a = 5;
		int b = 7;
		int temp = 0;
		System.out.println("Before swapping A is "+a+" and B is "+b);
		 temp = a;
		 a=b;
		 b= temp;
		 
		 System.out.println("After swapping A is "+a+" and B is "+b);
		 
		 //without temp
		 
		 
		 a=a+b;//5+7=12
		 b=a-b;//12-5=7
		 a=a-b;//12-7=5
		 
		 System.out.println("After swapping A is "+a+" and B is "+b);
		 
			}
}

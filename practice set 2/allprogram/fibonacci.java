package allprogram;

public class fibonacci {
	
	public static void main(String[] args) {
		
		
		int a = 0,b = 0, c = 1;
		for(int i = 0;i<10;i++)
		{
			b=c+a;
			c=a;
			a=b;
			System.out.println(a);
		}
	}

}

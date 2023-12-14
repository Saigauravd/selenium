package allprogram;

public class Factorial {
	
	public static void main (String [] args)
	{
		int a = 10 ;
		int sum = 1;
		for (int i=a;i>0;i--)
		{
			sum*=i;
		}
		System.out.println(sum);
	}

}

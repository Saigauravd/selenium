package loopNconditions;

public class Pattern {

	public static void main(String[] args) {

		//half pyramid
		for(int i =0; i<=9;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

		//complete pyramid

		for(int i = 1;i<=10;i++)
		{
			for(int j =1; j<=10-i;j++)
			{
				System.out.print( "  ");

			}

			for (int k= 0;k != 2 * i - 1;k++)
			{
				System.out.print("*");
			}System.out.println();
		}
		

	}


}






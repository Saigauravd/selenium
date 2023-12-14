package loopNconditions;

public class SumEvenandOdd {

	public static void main(String[] args) {
		int odd=0,even=0;
		
		for (int i= 1;i<=10;i++)
		{
			if (i%2==0)
			{
				even = even+i;
			}
			else
			{
				odd = odd+i;
			}
			
		}System.out.println("Total of Even is "+even+
				" Total of Odd is "+odd	);
	}
}

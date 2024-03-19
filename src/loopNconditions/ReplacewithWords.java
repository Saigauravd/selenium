package loopNconditions;

public class ReplacewithWords {

	
	public static void main(String[] args) {
		for (int i=1; i<100;i++)
		{
			if(i%5==0)
			{System.out.println("Fizz-"+i);
				
			}else if(i%3==0)
			
			{
				System.out.println("Bizz-"+i);
			}else
			{
				System.out.println(i);
			}
		}
	}
}

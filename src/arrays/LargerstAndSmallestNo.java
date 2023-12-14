package arrays;

public class LargerstAndSmallestNo {

	
	public static void main (String[]args)
	{
		int a[] = {36,65,2,9,4,7,5,1};
		int L= a.length;
		int b=0;
		int c=0;
		for (int i= 0;i<L;i++)
		{
			for(int j = i+1;j<L;j++)
			{
				if(a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
				
				
			}
		}
		System.out.println("The largest No is "+a[L-1]+" and the Smallest no in "+a[0]);
	}
}

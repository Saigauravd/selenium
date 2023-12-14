package arrays;

public class AscendingSorting {
	

	public static void main (String[] args)
	{
		int a[] = {3,2,9,4,7,5,1,8,6};
		int L= a.length;
		int b=0;
System.out.print("[");
		for (int i= 0;i<L;i++)
		{
			for (int j = i+1;j<L;j++)
			{
				if (a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
					
				}
			}
		
			System.out.print(a[i]);
		}System.out.print("]");
	}

}

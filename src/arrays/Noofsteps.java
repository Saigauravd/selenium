package arrays;

public class Noofsteps {

	
	public static void main(String[] args) {
		int a[]= {7,5,6,4,3,2,1};
	int 	count = 0;
	int temp = 0;
		for(int i = 0; i<a.length;i++)
		{
			
			for(int j = i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
					count++;
				}
			}
		}System.out.println("Total Steps required "+count);
	}
}

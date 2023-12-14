package arrays;

import java.util.HashSet;

public class twoinone
{



	public static void main(String[] args) 
	{
		
		int a[]= {1,2,3,6,7,8};
		int b[]= {4,5,9,0,10,11};
		
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i = 0; i<a.length;i++)
		{
			s.add(a[i]);
			s.add(b[i]);
			
		}
		System.out.println(s);
		
		
	}

}


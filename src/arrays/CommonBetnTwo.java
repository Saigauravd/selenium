package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonBetnTwo {

	 public static void main(String[] args) {
	      
	   

	 
	 
			int a[]= {1,2,3,4,5,6};
			int b[]= {7,8,9,10,3,5};
		List<Integer>Count = new ArrayList<>();
			
			for (int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if (a[i]==b[j])
					{
					Count.add(a[i]);
					break;
					}
				}
				
			}	
			System.out.println("Common no is "+Count);	
	 }	

}

package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class RemoveDupli
{
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 2, 3, 4, 4, 5,8,6,9,8,7};
		int a[]= {1, 2, 2, 3, 4,};
		String b[]= {"a","b","c","v","e"};
		// Convert the array to a HashSet to remove duplicates
		HashSet<Integer> uniqueSet = new HashSet<>();
		for (int num : inputArray) {
			uniqueSet.add(num);
		}



		HashMap<Integer,String> s = new HashMap<>();

		{
			for(int i =0;i<a.length;i++)
			{
				s.put(a[i], b[i]);
			}
		}

		// Print the array without duplicates
		System.out.println("Array without duplicates: " + uniqueSet);

		System.out.println(s);



	}
}





package java_programs;

import java. util.Arrays;


public class anagram {


	public static void main(String[] args) {
		String a ="Saigaurav";
		String b = "vagauiasr";

		a = a.toLowerCase();
		b=b.toLowerCase();



		int al = a.length();
		int bl = b.length();


		if (al!=bl)
		{
			System.out.println("Arrays are not anagram");

		}else
		{
			char [ ]ac = a.toCharArray();
			char []bc = b.toCharArray();
			System.out.println(ac);
			System.out.println(bc);
			Arrays.sort(ac);
			Arrays.sort(bc);
			System.out.println(ac);
			System.out.println(bc);
			boolean result = Arrays.equals(ac, bc);
			if(result)
			{
				System.out.println("Array are anagram");
			}
			else
			{
				System.out.println("Array are not anagram");
			}

		}

	}

}

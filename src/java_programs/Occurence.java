package java_programs;

import java.util.HashMap;

public class Occurence {
	public static void main(String[] args) {

		String s = "Saigaurav";
		HashMap<Character, Integer> sh = new HashMap<Character, Integer>();
		for(int i = 1; i<s.length();i++)
		{
			char c = s.charAt(i);
			if(sh.containsKey(c))
			{
				int count = sh.get(c);
				count++;
				sh.put(c,count);
			}else
			{
				sh.put(c,1);
			}
		}
		for(Character a:sh.keySet())
		{
			System.out.println(a+":"+sh.get(a));
		}
//-----------------------------------------------------------------------

		String st = "Saigaurav Saigaurav dambhe dambhe";
		String [] s1= st.split(" "); 
		HashMap<String, Integer> sh1 = new HashMap<String, Integer>();
		for(String c:s1)
		{

			if(sh1.containsKey(c))
			{
				int count = sh1.get(c);
				count++;
				sh1.put(c,count);
			}else
			{
				sh1.put(c,1);
			}
		}
		for(String a:sh1.keySet())
		{
			System.out.println(a+":"+sh1.get(a));
		}

	}
}

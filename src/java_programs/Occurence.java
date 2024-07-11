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
}


}

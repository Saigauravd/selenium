package java_programs;

import java.util.ArrayList;
import java.util.List;

public class SaparatheString {

	public static void main(String[] args) {
		String a = "#253Saigaurav1";
		List<Character> inte = new ArrayList<Character>();
		List<Character> ch = new ArrayList<Character>();
		List<Character> sym = new ArrayList<Character>();
		char s ;
		for(int i = 0; i<a.length();i++) {

			s=a.charAt(i);
			if(Character.isDigit(s))
			{
				inte.add( s);


			}
			else if((s>=65&&s<=90)||(s>=97&&s<=122))
			{
				ch.add(s); 
			}else {
				sym.add(s);
			}
		}
		System.out.println(inte);
		System.out.println(ch);
		System.out.println(sym);
	}

}

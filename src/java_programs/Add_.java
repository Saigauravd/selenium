package java_programs;

public class Add_ {
	public static void main(String[] args) {
		String s = "Dhoni";
		for(int i = 0; i<s.length();i++)
		{
			if(i==s.length()-1) {
				System.out.print(s.charAt(i));
			}else {
				System.out.print(s.charAt(i)+"_");
			}
		}
	}
}

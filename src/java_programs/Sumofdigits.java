package java_programs;

public class Sumofdigits {

	
	
	public static void main(String[] args) {
		String add="";
		int temp =0;
		String s ="kjkj2dfkjh1bkjc3asdkj45";
		int k = s.length();
	int flag=0;
		
		for (int i=0; i<k;i++)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				add =add+s.charAt(i);
				flag=1;
				
				if (i!=(s.length()-1))
				continue;
				
			}
		if (flag==1)
		{
			 int value = Integer.parseInt(add); 
			 add = "";
			 temp =value+temp;
			 flag = 0;
		}
		}
		System.out.println(temp);
	}
}

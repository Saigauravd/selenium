package java_programs;

import java.util.ArrayList;
import java.util.List;

public class reverseNum {
public static void main(String[] args) {
	int rev=0;
	  int a = 883893;
	while (a>0)
	{
		
	

	   int rim = a%10;
	    rev = rev*10+rim;
	  a= a/10;
	}
	System.out.println(rev );
}
}


package java_programs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class rough {
	
	 int m = 8;
	
	
//	public static void name (String countN) {
//	
//	
//		int count=0;
//	 for (int i = 0; i<countN.length();i++)
//	 {
//		 count++;
//	 }
//		System.out.println(count);
//	}
	
	public void q() {
		m= 18;
		System.out.println(m);
	}
	public static void anagram () {
		
		String a ="Saigaukrav";
		String b = "vagauiaksr";
		
		
		int alen = a.length();
		int blen = b.length();
		if (alen!=blen) {
			System.out.println("Strings are not anagram");
		}
		else
		{
		a=	a.toLowerCase();
			b=b.toLowerCase();
			
		char s[] = a.toCharArray();
		char d[] = b.toCharArray();
		
		Arrays.sort(s);
		Arrays.sort(d);
			if(Arrays.equals(s, d))
		{
			System.out.println("Strings are Anagram");
		}else
		{
			System.out.println("Strings are not Anagram");
		}
				
			
			
		}
		
		
	}
	/*
	 * public void srearchst() throws InterruptedException { WebDriver driver = new
	 * ChromeDriver(); // Navigate to Amazon website
	 * driver.get("https://www.amazon.com/"); Thread.sleep(1000); // Find the search
	 * input field and enter the search term WebElement searchInput =
	 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 * searchInput.sendKeys("poco");
	 * 
	 * // Wait for suggestions to appear Thread.sleep(2000);
	 * 
	 * // Find suggestion elements and store their te in a list List<WebElement>
	 * suggestionElements = driver.findElements(By.
	 * xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	 * List<String> suggestions = new ArrayList<>(); for (WebElement
	 * suggestionElement : suggestionElements) {
	 * suggestions.add(suggestionElement.getText()); }
	 * 
	 * // Print the number of suggestions and the suggestions themselves
	 * System.out.println("Number of suggestions: " + suggestions.size()); for
	 * (String suggestion : suggestions) { System.out.println(suggestion); } }
	 */

	
public static void abc()
{
	for (int i = 1; i<=100;i++)
	{
	if (i%10==0)
		System.out.println(i);
	}
}
    public static void main(String[] args) throws InterruptedException, IOException {
       rough r = new rough();
  //     r. srearchst();
r.q();
//abc();


anagram();



{  HashMap<Integer,String>a = new HashMap<Integer, String>();
          a.put(new Integer(0),"Blue");
          a.put(new Integer(1),"red");
           a.put(new Integer(1),"Black");
           System.out.println(a.get(1));
           
           int StartTime;
           StringBuilder b = new StringBuilder("Hello");
           b.append("World");
           System.out.println(b+" "+( System.currentTimeMillis() ));
}
{
           StringBuffer B = new StringBuffer("Hello");
           B.append("World");
           
           System.out.println(B+" "+( System.currentTimeMillis() ));}
	/*
	 * }
	 * // HashSet<String> angularDevepolers = new HashSet<>(); HashMap<Integer,
	 * String>angularDevepolers = new HashMap<>(); //Adding objects in HashSet
	 * angularDevepolers.put(1,"Navdeep"); angularDevepolers.put(2,"Anil"); //
	 * angularDevepolers.add(null); // angularDevepolers.add(null); //
	 * angularDevepolers.put(3,"m"); // angularDevepolers.add("Amrita");
	 * //System.out.println(angularDevepolers.size()); //Printing HashSet
	 * System.out.println(angularDevepolers);
	 */
	
	
//	String s = "Saigaurav Dambhe";
//	
//	name(s);
	
	
	//Missing number of array
 int a[]= {2,3,4,5,6,7,9};
 for (int i =0;i<a.length;i++)
 {
	 
	 
		 if(a[i+1]!=a[i]+1)
		 {
			 System.out.println(a[i]+1+" is missing number");
			 break;
		 }
	 }
    
    int c = 0;
    //Sorting array without using Array.sort
              int sort[]= {3,54,655,23,14,65,32,56,55};
    for (int i=0;i<sort.length;i++)
    {
    	for(int j = i+1;j<sort.length;j++)
    	{
    		
    		if(sort[i]>sort[j])
    		{
    			c=sort[i];
    			sort[i]=sort[j];
    			sort[j]=c;
    		}
    	}
    }
    for(int a1:sort) {
	System.out.print(a1+" ");}
    System.out.println();
    
//WebDriver driver = new ChromeDriver();
//
//	TakesScreenshot ss = (TakesScreenshot)driver;
//
//	File src = 	ss.getScreenshotAs(OutputType.FILE);
//	 String Path = System.getProperty("user.dir")+".//SS.png";
//	 File des = new File(Path);
//	 FileHandler.copy(src, des);
 String az =  new String("2")
		 ;String b = "2";
 
    boolean a1 = az==b;
    System.out.println(a1);
}	
    

    
}


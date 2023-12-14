package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframedemo {
	
	public static void main (String [] args) throws InterruptedException
	{
		WebDriver driver =  new ChromeDriver();
		
		//Single Iframe
//		
driver.get("https://demo.automationtesting.in/Frames.html");
//	WebElement frame = driver.findElement(By.xpath("//*[@name='SingleFrame']"));
	//	driver.switchTo().frame(frame);
//		driver.findElement(By.xpath(" //*[@type='text'][1]")).sendKeys("Saigaurav");
//
//		
//		driver.switchTo().parentFrame(); // switch to main frame
//		
		// Iframe in Iframe
		
	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	
	  int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
	    
	    WebElement frame = driver.findElement(By.xpath("//*[@name='SingleFrame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath(" //*[@type='text'][1]")).sendKeys("Saigaurav");
	}

}

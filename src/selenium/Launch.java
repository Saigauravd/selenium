package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Launch {
	public static void main(String[] args) throws IOException {
		WebDriver driver   = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String URl = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		//		String Source = driver.getPageSource();
		System.out.println(URl);
		
		System.out.println(title);
		
		
		String path = System.getProperty("user.dir")+".\\ss\\Screenshot\ss.jpg";
		 
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		
		File desti = new  File(path)	;
		FileHandler.copy(src, desti);
		
	}


}

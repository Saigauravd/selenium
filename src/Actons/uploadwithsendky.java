package Actons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadwithsendky {
	
	
	
	public static void main(String[] args) {
		
		//with sendkeys
		WebDriver driver = new ChromeDriver();
		driver.get("https://tus.io/demo");
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='P0-0']"));
		fileupload.sendKeys("C:\\Users\\saigaurav\\OneDrive - Uncode Inc\\Documents\\Lightshot\\Asset management\\Screenshot_1.png");
		
		
		
		//with javascriptexecutor
		
	
	}

}

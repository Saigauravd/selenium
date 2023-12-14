package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatioandCheckbox {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement element1 = driver.findElement(By.xpath("//*[@value='radio1']"));
		WebElement element2 = driver.findElement(By.xpath("//*[@value='radio2']"));
		WebElement element3 = driver.findElement(By.xpath("//*[@value='radio3']"));
		
		element1.click();
		element2.click();
		element3.click();
		
		WebElement element4 = driver.findElement(By.xpath("(//*[@value='option1'])[2]"));
		WebElement element5= driver.findElement(By.xpath("(//*[@value='option2'])[2]"));
		WebElement element6 = driver.findElement(By.xpath("(//*[@value='option3'])[2]"));
		
		element4.click();
		element5.click();
		element6.click();
		
		
	}

}

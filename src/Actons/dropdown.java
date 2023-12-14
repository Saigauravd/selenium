package Actons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown { 

	
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/hide/");
		
		WebElement frimaa =driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frimaa);
		
	 WebElement effect = driver.findElement(By.xpath("//*[@name='effects']"));
		
		Select sel = new Select(effect);
		sel.selectByValue("fade");
		
		driver.findElement(By.xpath("//*[@id='button']")).click();
		
	}

}

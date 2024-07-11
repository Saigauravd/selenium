package Actons;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
	
		wait.until(ExpectedConditions.alertIsPresent());
		 driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//button[@id='populate-text']")).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='target-text']")));
	
		driver.findElement(By.xpath("//button[@id='enable-button']")).click(); 
		FluentWait<WebDriver> flu = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		flu.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']"))).click();
	 
	}
	

}

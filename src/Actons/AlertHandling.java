package Actons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//confirm alert box
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();  
		
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Saigaurav");
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}
}

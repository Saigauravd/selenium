package Actons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop {

	
	 public static void main(String[] args) {
		
		 WebDriver driver =  new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 WebElement iframe=   driver.findElement(By.xpath("//*[@class='demo-frame']"));
		 driver.switchTo().frame(iframe);
		WebElement image1 =   driver.findElement(By.xpath("//*[@id='draggable']"));
		
		 
		 
		 
		 WebElement trash =   driver.findElement(By.xpath("//*[@id='droppable']"));
		 

		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
			 Actions act = new Actions(driver);
		 
		act.dragAndDrop(image1, trash).build().perform();
		
	//	 act.dragAndDrop(image4, trash).perform();
		 
		 
		}
		
		
	 
	
}

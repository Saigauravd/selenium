package Actons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_clikNHold {
	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");


		WebElement Resize = driver.findElement(By.xpath("//a[normalize-space()='Resizable']"));
		Resize.click();

		WebElement iframe=   driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement Move= driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

		Actions act =  new Actions(driver);

		act.clickAndHold(Move).moveByOffset(100, 100).perform();

	}
}

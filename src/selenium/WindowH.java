package selenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WindowH {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		int count=1;
		Driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		Driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-d5cad06 elementor-widget elementor-widget-html']//button[@id='button1']")).click();

		String hand =  Driver.getWindowHandle();

		Driver.switchTo().window(hand);
		Driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-d94c712 elementor-widget elementor-widget-html']//button[@id='button1']")).click();

		Driver.switchTo().window(hand);
		Driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-f5f0e8d elementor-widget elementor-widget-html']//button[@id='button1']")).click();

		Driver.switchTo().window(hand);
		Driver.findElement(By.xpath("//a[normalize-space()='New Browser Tab Link']")).click();

		Set<String> allwin = Driver.getWindowHandles();

		for (String Wind:allwin)
		{

			System.out.println(Wind);
			System.out.println( Driver.getTitle()+count++);
		}

	}

}

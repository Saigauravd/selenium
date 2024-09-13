package selenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Iterator;
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
		int count=1;Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		Driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

		Set<String> hand =  Driver.getWindowHandles();

		Iterator<String> st   = hand.iterator();
		
st.next();
System.out.println(Driver.findElement(By.xpath("//img[@id='Header1_headerimg']")).getText());
	}

}

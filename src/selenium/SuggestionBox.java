package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionBox {
	
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	    driver.findElement(By.id("autocomplete")).sendKeys("ind");
Thread.sleep(2000);
	    // Use a more specific XPath to locate the suggestion list
	    List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));

	    for (WebElement country : elements) {
	        System.out.println(country.getText());
	    }

	    
	}


}

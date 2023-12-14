package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
List<WebElement> rows = table.findElements(By.xpath(".//tr"));
for (WebElement row : rows) {
//	System.out.println(row.getText());

    List<WebElement> cells = row.findElements(By.xpath(".//td"));
    for (WebElement cell : cells) {
        System.out.println(cell.getText());
    }
}

	}

}

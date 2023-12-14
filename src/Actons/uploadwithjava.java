package Actons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadwithjava {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tus.io/demo");
		
		String filePath = "C://Users//saigaurav//OneDrive - Uncode Inc//Documents//Lightshot//Asset management//Screenshot_1.png";
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("document.getElementById('P0-0').value='" + filePath + "';");
	}

}

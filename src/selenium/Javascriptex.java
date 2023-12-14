package selenium;


	import org.openqa.selenium.By;		
	import org.openqa.selenium.JavascriptExecutor;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
	
	    		
	public class Javascriptex {	


	    
	    public static void main(String[] args) {
			
		
	        WebDriver driver= new ChromeDriver();			
	        		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("https://demo.guru99.com/V4/");			
	        		
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr528077");					
	        driver.findElement(By.name("password")).sendKeys("zAsYmyr");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	                                
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        js.executeScript("alert('Welcome to Guru99');");   
	    		
	    }		
	}


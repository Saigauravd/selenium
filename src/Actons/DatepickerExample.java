package Actons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatepickerExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement resize = driver.findElement(By.xpath("//a[normalize-space()='Datepicker']"));
        resize.click();

        WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        driver.switchTo().frame(iframe);

        WebElement dateTable = driver.findElement(By.xpath("//*[@id='datepicker']"));
        dateTable.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        while (true) {
            try {
                WebElement month = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='ui-datepicker-month']")));
                WebElement forward = driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']"));
                String monthText = month.getText();
                System.out.println(monthText);

                if (!monthText.equals("December")) {
                    forward.click();
                } else {
                    WebElement day = driver.findElement(By.xpath("//*[@data-date='31']"));
                    day.click();
                    break; // Exit the loop after selecting the day in December.
                }
            } catch (StaleElementReferenceException e) {
                // Handle the StaleElementReferenceException by continuing the loop
                continue;
            }
        }

        // Close the WebDriver
      driver.quit();
      
    }
      
 
      
    
}

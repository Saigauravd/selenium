package Actons;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class roughdatepicker {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");

			WebElement resize = driver.findElement(By.xpath("//a[normalize-space()='Datepicker']"));
			resize.click();

			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			driver.switchTo().frame(iframe);

			WebElement dateTable = driver.findElement(By.xpath("//*[@id='datepicker']"));
			dateTable.click();


			for (int i = 0; i < 12; i++) {
				WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));

				WebElement forward = driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']"));
				String monthText = month.getText();
				System.out.println(monthText);

			//	if (monthText!=("December")) {//if want to print all month
				if (!monthText.equals("December")) {// till only december
					forward.click();
		
					
				} else {
					WebElement day = driver.findElement(By.xpath("//*[@data-date='31']"));
					day.click();
					break; // Exit the loop after selecting the day in December.
				} 
			}
			System.out.println(dateTable.getText());

			// Close the WebDriver
			//  driver.quit();
		}
	

}

package calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailyatriCalenderAvailability {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(3000);
		WebElement dateSelected = driver.findElement(By.xpath("//input[@id='datepicker_train']"));
		dateSelected.click();

		Thread.sleep(3000);
		
		while (true) 
		{
			WebElement month_Year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
			
			String month_Year_text= month_Year.getText();
			
			System.out.println("Available Journey Month and Year is : "+month_Year_text);
			
			
			if (!(month_Year_text.equalsIgnoreCase("August 2025"))) {
				
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
				
				
			} else {

				break;
			}
			
		}
	
		driver.findElement(By.xpath("//td[text()='15']")).click();
		System.out.println("selected journey date is  : "+dateSelected.getAttribute("value"));
		driver.quit();
		
	}

}

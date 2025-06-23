package calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import resuasability.Basic_Reuse;

public class CalenderAutomate extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)");

		Thread.sleep(3000);
		
		WebElement calender = driver.findElement(By.xpath("//input[@id='datepicker_train']"));
		calender.click();

		Thread.sleep(3000);
		
		WebElement month_Year = driver
				.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));

		System.out.println("Month Year is : " + month_Year.getText());
		
		driver.findElement(By.xpath("//th[@class='next']")).click();
		driver.findElement(By.xpath("//th[@class='next']")).click();
		
		driver.findElement(By.xpath("//td[text()='15']")).click();
		

		System.out.println("selected journey date is  : " + calender.getAttribute("value"));

	}

}

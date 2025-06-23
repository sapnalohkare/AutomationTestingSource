package GrowAI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebElement alert_01 = driver.findElement(By.xpath("//input[@id='alertexamples']"));
		WebElement alert_02 = driver.findElement(By.xpath("//input[@id='confirmexample']"));
		WebElement alert_03 = driver.findElement(By.xpath("//input[@id='promptexample']"));
		
		alert_01.click();

		
		driver.switchTo().alert().accept();
		
	   //	driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("");
		
		alert_02.click();
		
		driver.switchTo().alert().dismiss();
		
		
		alert_03.click();
		driver.switchTo().alert().sendKeys("ok done..");
		
		
		
		

		//driver.quit();

	}

}

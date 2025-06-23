package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert_Ok {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		
		WebElement alert_01 = driver.findElement(By.xpath("//input[@id='alertexamples']"));
		alert_01.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.quit();

	}

}

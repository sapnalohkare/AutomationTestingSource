package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ok {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement alert_01 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert_01.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		driver.quit();
	}

}

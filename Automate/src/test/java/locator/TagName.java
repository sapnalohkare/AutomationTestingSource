package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
			
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		
		Thread.sleep(5000);
		 
		driver.close();

		
	}

}

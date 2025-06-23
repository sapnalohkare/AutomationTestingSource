package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
 
		WebElement linkText = driver.findElement(By.partialLinkText("to index"));
		linkText.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();

	}

}

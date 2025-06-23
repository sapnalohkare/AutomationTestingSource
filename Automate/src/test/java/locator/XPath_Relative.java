package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPath_Relative {

	public static void main(String[] args)  throws Throwable 
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		//driver.findElement(By.xpath("//input[@value='f']"));
		//input[@name='my-datalist'] //datalist[@id='my-options']
		//input[@name='my-datalist']
		WebElement element = driver.findElement(By.xpath("//input[@name='my-datalist']"));
		element.sendKeys("New York");
		Thread.sleep(4000);

		driver.close();

	}

}

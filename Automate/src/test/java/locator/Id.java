package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement email = driver.findElement(By.id("my-text-id"));
		
		email.sendKeys("sapnalohkare92@gmail.com");
		
		 Thread.sleep(4000);
	
		System.out.println("email entered successfully.....!");
		
		driver.close();
	}

}

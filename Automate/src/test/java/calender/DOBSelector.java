package calender;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOBSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		

		System.out.println("Title Of page is :" + driver.getTitle());
		
		WebElement dateOfBirth =	driver.findElement(By.xpath("//input[@name='my-date']"));
		dateOfBirth.click();
		
		driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();
		
		
		for (int i = 1; i <= 33 ; i++) 
		{
			driver.findElement(By.xpath("(//th[@class='prev'])[2]")).click();
		}
		
		driver.findElement(By.xpath("//span[text()='May']")).click();
		driver.findElement(By.xpath("(//td[text()='5'])[1]")).click();
		
		System.out.println("Date Of Birth is : "+dateOfBirth.getAttribute("value"));

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
		
	}

}

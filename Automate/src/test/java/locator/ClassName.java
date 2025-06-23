package locator;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassName {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		  WebElement allSearch = driver.findElement(By.className("form-select"));
		  
		  Select oselect = new Select(allSearch);
		  
		  oselect.selectByVisibleText("Three");
		  
		  System.out.println("option selected successfully......!");
		  
		  Thread.sleep(4000);
		  
		  driver.close();
		
		

	}

}

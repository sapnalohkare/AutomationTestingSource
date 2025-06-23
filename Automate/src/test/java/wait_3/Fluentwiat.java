package wait_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwiat {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		WebElement revealed = driver.findElement(By.id("revealed"));
	    driver.findElement(By.id("reveal")).click();


		/*---------------------fluent wait---------------------*/
	    
	    //1st way
		// gives specific wait to load and reape more time to wait
	    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchFieldException.class);
	
 
		//2nd way
	    Wait<WebDriver> wait_02 =
	            new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(2))
	                .pollingEvery(Duration.ofMillis(300))
	                .ignoring(ElementNotInteractableException.class);

	        wait.until(
	            d -> {
	              revealed.sendKeys("Displayed");
	              return true;
	            });
	}

}

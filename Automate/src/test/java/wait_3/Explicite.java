package wait_3;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicite {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
	    WebElement revealed = driver.findElement(By.id("revealed"));
	    driver.findElement(By.id("reveal")).click();

	    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    wait.until(d -> revealed.isDisplayed());
		
		/*---------------------WebDriverWait---------------------*/
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	}

}

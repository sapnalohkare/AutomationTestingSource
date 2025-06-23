package wait_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.manage().window().maximize();

		//implicite wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		WebElement start_Button = driver.findElement(By.xpath("//div[@id='start']//button"));
		start_Button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		//explicite wait
		WebElement finishElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
		
		

		//WebElement finishElement = driver.findElement(By.xpath("//div[@id='start']"));

		System.out.println(finishElement.getText());

		driver.quit();

		// start_Button.click();)
	}

}

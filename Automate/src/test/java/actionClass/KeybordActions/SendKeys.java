package actionClass.KeybordActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws Throwable {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement  fname
		= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Actions action = new Actions(driver);
		
		//send data
		action.moveToElement(fname).click().sendKeys("Sapna@9255").build().perform();
		
		//select
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//copy
		action.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		
		for (int i = 1; i <=14; i++) {
			
			System.out.println("i am in");
			//tab
			action.keyDown(Keys.TAB).build().perform();
			
		}
		
		//Thread.sleep(2000);
		//paste
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		

	}

}

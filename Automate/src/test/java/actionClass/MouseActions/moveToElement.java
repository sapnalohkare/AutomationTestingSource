package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class moveToElement extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {

		browserLaunch("Chrome");

		hitURL("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		WebElement element = driver.findElement(By.id("hover"));

		// MouseActions
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();
		
		takeScreenShot("MouseAction-moveToElement");
		
		driver.quit();
	}

}

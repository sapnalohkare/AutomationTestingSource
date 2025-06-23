package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class doubleClick extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {

		browserLaunch("Chrome");

		hitURL("https://www.selenium.dev/selenium/web/mouse_interaction.html");

		WebElement clickable  = driver.findElement(By.id("clickable"));

		// MouseActions
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		
		action.doubleClick(clickable).perform();

		
		Thread.sleep(2000);
		takeScreenShot("MouseAction-doubleClick");
	

		driver.quit();
	}

}

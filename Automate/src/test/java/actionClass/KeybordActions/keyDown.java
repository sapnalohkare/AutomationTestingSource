package actionClass.KeybordActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class keyDown extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {
		
		browserLaunch("Chrome");

		hitURL("https://demo.guru99.com/test/simple_context_menu.html");

		// MouseActions
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		takeScreenShot("PAGE_DOWN");
		
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		takeScreenShot("PAGE_UP");
		
		driver.quit();
	}

}

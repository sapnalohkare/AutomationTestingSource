package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class click extends Basic_Reuse {

	public static void main(String[] args)  throws Throwable  {
		
		
		
        browserLaunch("Chrome");
		
		hitURL("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement element = driver.findElement(By.id("my-text-id"));
		
		//MouseActions
		Actions action = new Actions(driver);
		
		//1st way
		action.moveToElement(element).click().build().perform();
		
		//2nd way
		//action.click(element);
		
		takeScreenShot("MouseAction-click");	
		
		driver.quit();
		
	}

}

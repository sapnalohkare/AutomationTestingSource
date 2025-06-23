package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class contextClick extends Basic_Reuse{

	public static void main(String[] args) throws Throwable {
	
		    browserLaunch("Chrome");
			
			hitURL("https://demoqa.com/buttons");
			
			//WebElement search = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			WebElement element = driver.findElement(By.id("rightClickBtn"));
			
			javaScriptExecutor("window.scrollBy(0,500)");
			
			//MouseActions
			Actions action = new Actions(driver);
			
			//right click
			action.moveToElement(element).contextClick().build().perform();
			
			//WebElement edit = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
			
			
			Thread.sleep(5000);
			
			screenShot("contextClick");
			
			//accept the alerts
			//driver.switchTo().alert().accept();
			
			driver.quit();
	}

}

package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class dragAndDrop extends Basic_Reuse{

	public static void main(String[] args) throws Throwable {
		
		browserLaunch("Chrome");
		
		hitURL("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		//MouseActions
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
		takeScreenShot("dragAndDrop");
		
		driver.quit();
	}

}

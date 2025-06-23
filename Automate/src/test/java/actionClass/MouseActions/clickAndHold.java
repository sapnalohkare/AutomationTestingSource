package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class clickAndHold extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {

		browserLaunch("Chrome");

		hitURL("https://testkru.com/Interactions/DragAndDrop");

		/*---------------first way-----------------*/
		WebElement element = driver.findElement(By.id("box1"));

		// MouseActions
		Actions action = new Actions(driver);

		action.moveToElement(element).clickAndHold().build().perform();

		Thread.sleep(5000);
		takeScreenShot("MouseAction-clickAndHold");

		/*---------------second way-----------------*/

		// action.clickAndHold(element).build().perform();


		driver.quit();
	}
}

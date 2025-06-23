package actionClass.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class Slider extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {
		browserLaunch("Chrome");

		hitURL("https://jqueryui.com/slider/");

		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(frame);

		WebElement slider = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		// MouseActions
		Actions action = new Actions(driver);

		action.moveToElement(slider).clickAndHold().moveByOffset(200, 0).release().build().perform();
		
		takeScreenShot("Forward_slider");

		action.moveToElement(slider).clickAndHold().moveByOffset(-100,0).release().build().perform();
		
		takeScreenShot("Backward_slider");

		//action.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();

		action.dragAndDropBy(slider, 500, 0).build().perform();
		
		takeScreenShot("DragAndDrop_slider");
		
		driver.quit();

	}

}

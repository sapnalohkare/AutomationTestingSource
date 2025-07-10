package resuasability;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Reuse extends Basic_Reuse {

	public static Actions action ; 

	
	// move to mentioned WebElement
	public static void moveToElement(WebElement element) {
		action.moveToElement(element);
	}

	// click on WebElement
	public static void click(WebElement element) {
		// action.click(element).build().perform(); <--1st way
		action.moveToElement(element).click().build().perform();

	}

	// click on WebElement
	public static void sendKeys(WebElement element, String input) {
		// action.click(element).build().perform(); <--1st way
		action.moveToElement(element).sendKeys(input).build().perform();

	}

	// double-click on WebElement
	public static void doubleClick(WebElement element) {
		// action.doubleClick(element).build().perform(); <--1st way
		action.moveToElement(element).doubleClick().build().perform();
	}

	// right-click on WebElement
	public static void contextClick(WebElement element) {
		// action.contextClick(element).build().perform(); <--1st way
		action.moveToElement(element).contextClick().build().perform();
	}

	// drag from one place and drop to another place
	public static void dragAndDrop(WebElement drag, WebElement drop) {
		action.dragAndDrop(drag, drop).build().perform();
	}

	// click element and hold till its released
	public static void clickAndHold(WebElement drag, WebElement drop) {
		// action.clickAndHold(drag).release(drop).build().perform(); <--1st way
		action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	}

	// release to particular location
	public static void release(WebElement drag, WebElement drop) {

		// action.clickAndHold(drag).release(drop).build().perform(); <--1st way
		action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	}

	// slider move backward
	public static void slider_Forward(WebElement element, int value) {
		// action.clickAndHold(element).moveByOffset(200,
		// 0).release().build().perform(); <--1st way
		action.moveToElement(element).clickAndHold().moveByOffset(value, 0).release().build().perform();

	}

	// slider move forward
	public static void slider_Backward(WebElement element, int value) {
		// action.clickAndHold(element).moveByOffset(-100,0).release().build().perform(); <--1st way
		action.moveToElement(element).clickAndHold().moveByOffset(-value, 0).release().build().perform();

	}

	/*--------------------------Keybord Actions-----------------------------------------------------*/

	public static void select() {
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}

	public static void copy() {
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}

	public static void paste() {
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}

	public static void tap() {
		action.keyDown(Keys.TAB).build().perform();
	}
}

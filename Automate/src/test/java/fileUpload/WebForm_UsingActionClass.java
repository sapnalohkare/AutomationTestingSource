package fileUpload;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import resuasability.ActionClass_Reuse;

public class WebForm_UsingActionClass extends ActionClass_Reuse {

	public static void main(String[] args) throws Throwable {

		browserLaunch("Chrome");
		hitURL("https://www.selenium.dev/selenium/web/web-form.html");

		action = new Actions(driver);

		// input filed filling
		WebElement textInput = driver.findElement(By.xpath("//input[@id='my-text-id']"));
		click(textInput);
		sendKeys(textInput, "Sapna Shobhit Lohkare");
		tap();

		// input filed filling
		WebElement password = driver.findElement(By.xpath("//input[@name='my-password']"));
		click(password);
		sendKeys(password, "sapna@5592");
		tap();

		// text-area filed filling
		WebElement textArea = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
		click(textArea);
		sendKeys(textArea, "I am  STP automation testing student  and i am loving automation testing...");
		tap();

		// disabled input filed
		WebElement disabledInput = driver.findElement(By.xpath("//input[@name='my-disabled']"));
		System.out.println("Input Disabled ?  : " + disabledInput.isDisplayed());
		System.out.println("value of disabled fild :  " + disabledInput.getAttribute("placeholder"));

		// read Only Input
		WebElement readOnlyInput = driver.findElement(By.xpath("//input[@name='my-readonly']"));
		System.out.println("Input read only visible  ?  : " + readOnlyInput.isEnabled());
		System.out.println("value of read only field :  " + readOnlyInput.getAttribute("value"));
		tap();

		// hyper link tag i.e : a
		click(driver.findElement(By.xpath("//a[@href='./index.html']")));

		driver.navigate().back();
		tap();

		// static drop-down
		WebElement dropdownSelect = driver.findElement(By.xpath("//select[@name ='my-select']"));
		click(dropdownSelect);
		Select oSelect = new Select(dropdownSelect);
		oSelect.selectByIndex(2);
		click(dropdownSelect);
		tap();

		// dynamic Select---------------starts------------------------

		WebElement dynamicInput = driver.findElement(By.xpath("//input[@name='my-datalist']"));
		click(dynamicInput);
		sendKeys(dynamicInput, "New");

		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//datalist//option"));

		for (int i = 0; i < options.size(); i++) {

			if (options.get(i).getAttribute("value").contains(dynamicInput.getAttribute("value"))) {

				dynamicInput.clear();
				dynamicInput.sendKeys(options.get(i).getAttribute("value"));
				click(dynamicInput);

			}

		}
		tap();
		tap();

		// dynamic Select---------------ends------------------------

		/*-----------------------------------------------file upload------------------------------------------------------*/

		click(driver.findElement(By.xpath("//input[@type='file']")));

		StringSelection ss = new StringSelection("C:\\Users\\USER\\Desktop\\Selenium\\Selenium_homework\\locators.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot r = new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.delay(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Name of uploaded file : "+driver.findElement(By.xpath("//input[@type='file']")).getAttribute("value"));

		/*---two check box : if checked -> unchecked it , if unchecked : checked it---*/

		List<WebElement> chekBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < chekBoxes.size(); i++) {

			if (chekBoxes.get(i).isSelected()) {

				click(chekBoxes.get(i));

			} else {
				click(chekBoxes.get(i));
			}

		}

		/*---two radio buttons : if checked -> unchecked it , if unchecked : checked it---*/

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

		for (int i = 0; i < radioButtons.size(); i++) {

			if (radioButtons.get(i).isSelected()) {

				click(radioButtons.get(i));

			} else {
				click(radioButtons.get(i));
			}

		}
		tap();
		tap();

		WebElement colorBar = driver.findElement(By.xpath("//input[@name='my-colors']"));

		click(colorBar);
		System.out.println("value of color is : " + colorBar.getAttribute("value"));
		// tap();

		/*------------------------------------------------date  starts-----------------------------------------------------*/

		WebElement dateOfBirth = driver.findElement(By.xpath("//input[@name='my-date']"));
		click(dateOfBirth);

		click(driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")));
		for (int i = 1; i <= 33; i++) {
			click(driver.findElement(By.xpath("(//th[@class='prev'])[2]")));
		}

		click(driver.findElement(By.xpath("//span[text()='May']")));
		click(driver.findElement(By.xpath("(//td[text()='5'])[1]")));

		tap();

		System.out.println("Date Of Birth is : " + dateOfBirth.getAttribute("value"));

		/*------------------------------------------------date ends---------------------------------------------------------*/

		/*-----------------------------------------------slider  starts--------------------------------------------------*/

		/*----------forward direction----------- */
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		int forward = 80;

		slider_Forward(slider, forward);

		/*---------backward direction----------- */
		int backward = 20;
		slider_Backward(slider, backward);

		/*-----------------------------------------------slider  ends-----------------------------------------------------*/

		Thread.sleep(1000);
		click(driver.findElement(By.xpath("//button[@type='submit']")));
	}

}

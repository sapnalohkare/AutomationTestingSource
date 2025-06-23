package site;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebForm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		System.out.println("Title Of page is :" + driver.getTitle());

		getAttribute(driver);

		sendKeys(driver);

		clear(driver);

		getText(driver);

		isEnabled(driver);

		isDisplayed(driver);

		getLocation(driver);

		getSize(driver);

		getTagName(driver);

		isSelected(driver);

		click(driver);

		/*Thread.sleep(4000);

		driverclosed(driver);*/

	}

	private static void uploadFile(WebDriver driver) {

		WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		fileInput.click();

	}

	private static void click(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*click()*--------------------------");

		WebElement search = driver.findElement(By.xpath("//input[@name='my-datalist']"));
		
		//WebElement element = driver.findElement(By.xpath("(//datalist[@id='my-options']//option)[1]"));
		search.click();
		search.sendKeys("Lo");
		String value = search.getAttribute("value");

		List<WebElement> options = driver.findElements(By.xpath("//datalist//option"));

		for (int i = 1; i < options.size() + 1; i++) {
			WebElement option = driver.findElement(By.xpath("(//datalist//option)" + "[" + i + "]"));
			String optionValue = option.getAttribute("value");

			if (optionValue.contains(value)) {
				search.clear();
				search.sendKeys(optionValue);

			}
		}

		List<WebElement> Check_radio = driver.findElements(By.xpath("//input[@class='form-check-input']"));

		for (int i = 1; i < Check_radio.size() + 1; i++) {
			WebElement button = driver.findElement(By.xpath("(//input[@class='form-check-input'])" + "[" + i + "]"));

			System.out.println(button.isSelected());

			if (button.isSelected()) {

				button.click();
			} else {
				button.click();

			}
		}

		// input[@class='form-check-input']

		// input[@id='my-check-1']
		// input[@id='my-check-2']

		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));

		// btn.click();

	}

	private static void isSelected(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*isSelected()*--------------------------");

		WebElement checked = driver.findElement(By.id("my-check-1"));
		WebElement unChecked = driver.findElement(By.id("my-check-2"));

		System.out.println("Checked checkbox : " + checked.isSelected());
		System.out.println("Unchecked checkbox : " + unChecked.isSelected());

		WebElement checkedRadio = driver.findElement(By.id("my-radio-1"));
		WebElement unCheckedRadio = driver.findElement(By.id("my-radio-2"));

		System.out.println("Checked Radio : " + checkedRadio.isSelected());
		System.out.println("Unchecked Radio : " + unCheckedRadio.isSelected());

	}

	private static void isEnabled(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*isEnabled()*--------------------------");

		WebElement textInput = driver.findElement(By.name("my-disabled"));

		System.out.println("is Enabled : " + textInput.isEnabled());

	}

	private static void isDisplayed(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*isDisplayed()*--------------------------");

		WebElement disabledElement = driver
				.findElement(By.xpath("(//div[@class='col-md-4 py-2']//label[@class='form-label w-100'])[5]"));

		System.out.println("Is Displayed : " + disabledElement.isDisplayed());
	}

	private static void getTagName(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*getTagName()*--------------------------");

		WebElement element = driver.findElement(By.xpath("//input[@list='my-options']"));

		System.out.println("Tag name is : " + element.getTagName());

	}

	private static void getSize(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*getSize()*--------------------------");

		WebElement element = driver.findElement(By.xpath("//select[@name='my-select']"));

		Select oSelect = new Select(element);

		Dimension dimension = element.getSize();
		System.out.println("Height of the element: " + dimension.getHeight());
		System.out.println("Width of the element: " + dimension.getWidth());

		List<WebElement> options = oSelect.getOptions();

		oSelect.selectByContainsVisibleText("Two");

		System.out.println("Options in select list : " + options.size());

	}

	private static void getLocation(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*getLocation()*--------------------------");

		WebElement link = driver.findElement(By.xpath("//a[@href='./index.html']"));

		System.out.println("X location : " + link.getLocation().x);
		System.out.println("Y location : " + link.getLocation().y);
	}

	private static void getAttribute(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*getAttribute()*--------------------------");

		WebElement textInput = driver.findElement(By.id("my-text-id"));

		/*-------------Attribute Name : Returns Value-----------------*/

		System.out.println("type Attribute value : " + textInput.getAttribute("type"));
		System.out.println("class Attribute value : " + textInput.getAttribute("class"));
		System.out.println("myprop Attribute value : " + textInput.getAttribute("myprop"));
		System.out.println("id Attribute value : " + textInput.getAttribute("id"));

		textInput.sendKeys("Sapna Lohkare");

		String enteredName = textInput.getAttribute("value");
		System.out.println("Entered Name : " + enteredName);

		Thread.sleep(3000);

	}

	private static void getText(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*getText()*--------------------------");

		WebElement disabledElement = driver
				.findElement(By.xpath("(//div[@class='col-md-4 py-2']//label[@class='form-label w-100'])[5]"));

		System.out.println("Text is : " + disabledElement.getText());

	}

	private static void clear(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*clear()*--------------------------");

		WebElement textInput = driver.findElement(By.id("my-text-id"));

		textInput.clear();

		textInput.sendKeys("Granthik Basande");

		Thread.sleep(2000);

	}

	private static void sendKeys(WebDriver driver) throws Throwable {

		System.out.println("-------------------------*sendKeys()*--------------------------");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Granthik@12345");

		WebElement textArea = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));

		textArea.sendKeys("Automation testing is fun and i am loving it....");

		Thread.sleep(2000);
	}

	private static void driverclosed(WebDriver driver) {

		driver.close();

	}

}

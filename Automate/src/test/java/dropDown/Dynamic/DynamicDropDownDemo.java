package dropDown.Dynamic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	
		WebElement inputBox = driver.findElement(By.xpath("//input[@name='my-datalist']"));
		
		//WebElement dataList = driver.findElement(By.xpath("//datalist[@id='my-options']"));
		
		inputBox.click();
		inputBox.sendKeys("Sea");

		
		List<WebElement> options = driver.findElements(By.xpath("//datalist//option"));
		
		
		for (int i = 0; i < options.size(); i++) 
		{
			
			if (options.get(i).getAttribute("value").contains(inputBox.getAttribute("value"))) 
			{
				inputBox.clear();
				inputBox.sendKeys(options.get(i).getAttribute("value"));
				inputBox.click();
				
			}
			
		}

	}

}

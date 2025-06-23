package dropDown.Static;

import java.io.File;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		WebElement staticSelect = driver.findElement(By.cssSelector("select.form-select")) ;
		
		Actions action = new Actions(driver);
		
		action.moveToElement(staticSelect).click().build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(staticSelect).click().build().perform();
		
		Select oSelect = new Select(staticSelect);
		List <WebElement> elementCount = oSelect.getOptions();
		
		for (int i = 0; i < elementCount.size(); i++)
		{
			WebElement element = elementCount.get(i);
			
			if (element.getText().equalsIgnoreCase("Three")) 
			{ 
				oSelect.selectByValue(element.getAttribute("value"));	
				
			}
		}
	
		//take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./screenShot/StaticDropdown.png");
		
		FileHandler.copy(source, target);
		
		
		driver.quit();

	}

}

package dropDown.Dynamic;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;


import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		 Select dropdownField = new Select(driver.findElement(By.id("multi-select"))); 
		 
		// System.out.println(dropdownField.isMultiple() );
		 
		 dropdownField.selectByValue("California") ;
		 dropdownField.selectByIndex(2);
		 dropdownField.selectByVisibleText("New York");
		 
		List<WebElement> allOptions = dropdownField.getOptions();
		List<WebElement> selected= dropdownField.getAllSelectedOptions();
		System.out.println("All Options : "+allOptions.size()+"  Selected Options : "+selected.size());
			
		for (int i = 0; i < allOptions.size(); i++)
		{
			
			System.out.println(allOptions.get(i).isSelected()+" "+allOptions.get(i).getText());
			
			
		}
		
		TakesScreenshot ts  = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File ("./screenShot/multipleDropdown.png");
		
		FileHandler.copy(source, target);
		
		
		driver.findElement(By.xpath("//Button[@id='printMe']")).click();
		System.out.println("First selected : "+selected.getFirst().getText());
		
		driver.findElement(By.xpath("//Button[@id='printAll']")).click();
		System.out.println("Last selected : "+selected.getLast().getText());
		
		//driver.quit();
		}
		
	}



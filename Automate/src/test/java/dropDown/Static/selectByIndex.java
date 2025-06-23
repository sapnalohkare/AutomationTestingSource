package dropDown.Static;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='dropdown']"));
		
		element.click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Select oSelect = new Select(element);
		
		oSelect.selectByIndex(1);
		
		//screenshot
		String projectPath = System.getProperty("user.dir");
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target =new File(projectPath+"\\screenShot\\dropdown_selectByIndex.png");
		
		FileHandler.copy(source, target);
		
		driver.quit();

	}

}

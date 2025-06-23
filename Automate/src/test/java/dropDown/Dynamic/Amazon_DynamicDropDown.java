package dropDown.Dynamic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_DynamicDropDown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println(btn.isDisplayed());
		
		btn.submit();
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Mobile");
		
		Thread.sleep(1000);
		
		List<WebElement> searchedOptions = driver.findElements(By.xpath("//div[@role='rowgroup']//div[@role='row']//div[@class='s-suggestion-container']//div[@role='button']//span"));
		
		System.out.println(searchedOptions.size());
		Thread.sleep(1000);
		
		for (int i = 0; i < searchedOptions.size(); i++) 
		{
			System.out.println((searchedOptions.get(i).getText()));
			if (searchedOptions.get(i).getText().equalsIgnoreCase("holder for car dashboard")) 
			{
				searchedOptions.get(i).click();
				break;
			}
		}
		driver.quit();
		

	}

}

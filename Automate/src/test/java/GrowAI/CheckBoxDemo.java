package GrowAI;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='cb1']"));
		checkbox.click();
		
		if (checkbox.isSelected()) {
			
			System.out.println("checkbox 1 is selected....");
			
		}
		
		driver.quit();

	}

}

package GrowAI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebElement radioButton = driver.findElement(By.xpath("//input[@value='rd1']"));
		radioButton.click();

		System.out.println(radioButton.isSelected());

		driver.quit();

	}

}

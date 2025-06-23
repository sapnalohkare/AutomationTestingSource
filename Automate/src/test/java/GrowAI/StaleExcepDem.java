package GrowAI;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExcepDem {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
		try {
			WebElement content = driver
					.findElement(By.xpath("//div[@class='large-10 columns large-centered']/div[3]/div[2]"));
			System.out.println(content.getText());
			WebElement refreshLink = driver.findElement(By.xpath("//a[text()='click here']"));
			refreshLink.click();
			try {
				System.out.println("try to print the content again");
				System.out.println(content.getText());
			} catch (StaleElementReferenceException e) {
				System.out.println("caught StaleElemeentExcpetion, trying to relocate");
				content = driver.findElement(By.xpath("//div[@class='large-10 columns large-centered']/div[3]/div[2]"));
				System.out.println(content.getText());
			}
		} catch (Exception e) {
			System.out.println("unexpected exception" + e.getMessage());
		} finally {
			driver.quit();
		}
	}
}
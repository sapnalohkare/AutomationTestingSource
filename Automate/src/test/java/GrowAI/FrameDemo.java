package GrowAI;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
		driver.switchTo().frame("left");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("right");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
	}

}

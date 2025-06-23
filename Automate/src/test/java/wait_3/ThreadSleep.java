package wait_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		// deliberately wait for some time
		Thread.sleep(3000);

		driver.manage().window().maximize();

	}

}

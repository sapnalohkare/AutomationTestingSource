package AutomateDemo_Delete;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class Basic {
	
	public static WebDriver driver;
	
	
	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Unable to launch the browser--!");
		}

		System.out.println("Browser launch is : " + browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

}

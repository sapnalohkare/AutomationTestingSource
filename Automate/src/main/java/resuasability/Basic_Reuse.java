package resuasability;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Basic_Reuse {
   
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");

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
	

	public static void hitURL(String URL) {

		driver.get(URL);

		System.out.println("Title of web page is : " + driver.getTitle());
	}

	public static void takeScreenShot(String imgName) throws Throwable {

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenShot/" + imgName + ".png");

		FileHandler.copy(source, target);

	}

	public static void screenShot(String imgName) throws Throwable {

		System.out.println("project path is : " + projectPath);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File(projectPath+"\\screenShot\\ReportsScreenshot\\"+imgName+".png");
		//File target = new File("./screenShot/Actions/" + imgName + ".png");

		FileHandler.copy(source, target);

	}

	public static void javaScriptExecutor(String scroll) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scroll);

	}

}

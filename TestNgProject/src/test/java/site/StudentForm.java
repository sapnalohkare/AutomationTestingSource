package site;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StudentForm {

	static String host = "localhost";
	static int port_no = 3306;
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;

	static WebDriver driver = null;
	static String browser = "Chrome";

	String test = null;

	@BeforeSuite(description = "setup database connections..")
	public void setUpDB() throws Throwable {

		// 1. Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2nd get connection
		connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port_no + "/mypractice", "root",
				"Sapna@5592");

		// 3. Create a statement
		statement = connection.createStatement();

		// 4. Execute a query
		// resultSet = statement.executeQuery(query);

		// resultSet.next();
	}

	@BeforeTest(description = "fired query from database to get student data")
	public void loadingTestData() throws Throwable {

		String query = "select name,email,gender,mobileNumber,subject,hobbies,currentAddress,state,city,dob,file from mypractice.registrationDetails where id=1;";
		resultSet = statement.executeQuery(query);
		resultSet.next();
	}

	@BeforeClass(description = "intialize webdriver and launch browser extention accordingly")
	public void intializingWebDriver() {

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
		hitURL();
	}

	// just a method
	public void hitURL() {

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		System.out.println("Title of web page is : " + driver.getTitle());
	}

	@AfterMethod(description = "take screenshot after every method with method name")
	public void takeScreenshot() throws Throwable {

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenShot/StudentForm/" + test + ".png");

		FileHandler.copy(source, target);

	}

	// for name
	@Test(priority = 1, description = "find name field on web page and send name data from DB")
	public void name() throws Throwable {
		test = "name";
		System.out.println("name  : " + resultSet.getString("name"));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(resultSet.getString("name"));

	}

	// for email
	@Test(priority = 2, description = "find email field on web page and send email data from DB")
	public void email() throws Throwable {
		test = "email";

		System.out.println("email  : " + resultSet.getString("email"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(resultSet.getString("email"));
	}

	// for name
	@Test(priority = 3, description = "find gender field on web page and send gender data from DB")
	public void gender() throws Throwable {
		test = "gender";

		String gender = resultSet.getString("gender");

		if (gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		} else if (gender.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		} else {
			driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();

		}
	}

	@Test(priority = 4, description = "find mobileNumber field on web page and send mobileNumber data from DB")
	public void mobileNumber() throws Throwable {
		test = "mobileNumber";

		System.out.println("mobileNumber  : " + resultSet.getString("mobileNumber"));
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(resultSet.getString("mobileNumber"));
	}

	@Test(priority = 5, description = "find dob field on web page and send dob data from DB")
	public void Fetch_database_date_to_Webpage() throws Throwable {

		test = "Fetch_database_date_to_Webpage";

		java.util.Date databaseDate = resultSet.getDate("dob");

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		String formattedDate = formatter.format(databaseDate);

		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(formattedDate);

	}

	@Test(priority = 6, description = "find subject field on web page and send subject data from DB")
	public void subject() throws Throwable {
		test = "subject";

		System.out.println("subject  : " + resultSet.getString("subject"));
		driver.findElement(By.xpath("//input[@id='subjects']")).sendKeys(resultSet.getString("subject"));
	}

	@Test(priority = 7, description = "find hobbies field on web page and send hobbies data from DB")
	public void hobbies() throws Throwable {
		test = "hobbies";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");

		String hobbies = resultSet.getString("hobbies");

		if (hobbies.equalsIgnoreCase("Sports")) {
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		} else if (hobbies.equalsIgnoreCase("Reading")) {
			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		} else {
			driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();

		}

	}

	@Test(priority = 8, description = "find file_Upload field on web page and send file_Upload data from DB")
	public void file_Upload() throws Throwable {
		test = "file_Upload";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");

		WebElement file = driver.findElement(By.xpath("//div[@class='input-group']"));
		file.click();

		StringSelection ss = new StringSelection(resultSet.getString("file"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot r = new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.delay(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("file uploaded successful... ! ");

	}

	@Test(priority = 9, description = "find currentAddress field on web page and send currentAddress data from DB")
	public void currentAddress() throws Throwable {
		test = "currentAddress";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)", "");

		System.out.println("currentAddress  : " + resultSet.getString("currentAddress"));
		driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys(resultSet.getString("currentAddress"));

	}

	@Test(priority = 10, description = "find state field on web page and send state data from DB")
	public void state() throws Throwable {
		test = "state";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");

		String state = resultSet.getString("state");

		if (state.equalsIgnoreCase("NCR")) {
			driver.findElement(By.xpath("(//select[@id='state']//option)[2]")).click();
		} else if (state.equalsIgnoreCase("Uttar Pradesh")) {
			driver.findElement(By.xpath("(//select[@id='state']//option)[3]")).click();
		} else if (state.equalsIgnoreCase("Haryana")) {
			driver.findElement(By.xpath("(//select[@id='state']//option)[4]")).click();
		} else {
			driver.findElement(By.xpath("(//select[@id='state']//option)[5]")).click();

		}
		
		Thread.sleep(2000);

	}

	@Test(priority = 11, description = "find city field on web page and send city data from DB")
	public void city() throws Throwable {
		test = "city";
		String city = resultSet.getString("city");

		if (city.equalsIgnoreCase("Agra")) {
			driver.findElement(By.xpath("(//select[@id='city']//option)[2]")).click();
		} else if (city.equalsIgnoreCase("Lucknow")) {
			driver.findElement(By.xpath("(//select[@id='city']//option)[3]")).click();
		} else {
			driver.findElement(By.xpath("(//select[@id='city']//option)[4]")).click();

		}

	}

	@AfterClass(description = "to close intialized webdriver")
	public void closeWebDriver() throws Throwable {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		if (driver != null)
			driver.quit();

	}

	@AfterTest(description = "to close intialized ResultSet")
	public void closingTestData() throws Throwable {

		if (resultSet != null)
			resultSet.close();
	}

	@AfterSuite(description = "to close all intiated DB related objects..")
	public static void closeDB() {

		try {

			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.err.println("Error closing resources: " + e.getMessage());
		}

	}

}

package paraBankPOM;

import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRecord {

	// WebElement repository

	@FindBy(xpath = "//a[text()='Register']")
	WebElement RegisterLink;

	@FindBy(xpath = "//input[@id='customer.firstName']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='customer.lastName']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='customer.address.street']")
	WebElement street;
	@FindBy(xpath = "//input[@id='customer.address.city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='customer.address.state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	WebElement zipCode;
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='customer.ssn']")
	WebElement ssn;
	@FindBy(xpath = "//input[@id='customer.username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='customer.password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	WebElement repeatedPassword;
	@FindBy(xpath = "//input[@value='Register']")
	WebElement Register;

	@FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
	WebElement successMsg;
	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement logOut;

	
	
	
	public CreateRecord(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// perform action
	public void createRecord(PreparedStatement pstmt, Connection connection, Statement statement)
			throws SQLException, Throwable {

		String projectpath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(projectpath + "\\src\\main\\resources\\ParabankData.properties");
		Properties filePOM = new Properties();
		filePOM.load(file);

		// Random random = new Random();
		// int randomInt = random.nextInt();

		RegisterLink.click();

		firstName.sendKeys(filePOM.getProperty("firstName"));
		lastName.sendKeys(filePOM.getProperty("lastName"));
		street.sendKeys(filePOM.getProperty("street"));
		city.sendKeys(filePOM.getProperty("city"));
		state.sendKeys(filePOM.getProperty("state"));
		zipCode.sendKeys(filePOM.getProperty("zipCode"));
		phoneNumber.sendKeys(filePOM.getProperty("phoneNumber"));
		ssn.sendKeys(filePOM.getProperty("ssn"));

		username.sendKeys(filePOM.getProperty("username"));
		password.sendKeys(filePOM.getProperty("password"));
		repeatedPassword.sendKeys(filePOM.getProperty("repeatedPassword"));

		/*---------------------------values------------------------------*/

		String firstName_ = firstName.getAttribute("value");
		String lastName_ = lastName.getAttribute("value");
		String street_ = street.getAttribute("value");
		String city_ = city.getAttribute("value");
		String state_ = state.getAttribute("value");
		String zipCode_ = zipCode.getAttribute("value");// int
		String phoneNumber_ = phoneNumber.getAttribute("value");// long
		String ssn_ = ssn.getAttribute("value");// long

		String username_ = username.getAttribute("value");
		String password_ = password.getAttribute("value");
		String repeatedPassword_ = repeatedPassword.getAttribute("value");
		
		int zipCode_int = Integer.parseInt(zipCode_);
		long phoneNumber_long = Long.parseLong(phoneNumber_);
		long ssn_long = Long.parseLong(ssn_);

		String sql = "INSERT INTO bank.customer_register (firstName, lastName,street,city,state,zipCode,phoneNumber,ssn,username,password,repeatedPassword) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, firstName_);
		pstmt.setString(2, lastName_);
		pstmt.setString(3, street_);
		pstmt.setString(4, city_);
		pstmt.setString(5, state_);

		pstmt.setInt(6, zipCode_int);
		pstmt.setLong(7, phoneNumber_long);
		pstmt.setLong(8, ssn_long);

		pstmt.setString(9, username_);
		pstmt.setString(10, password_);
		pstmt.setString(11, repeatedPassword_);

		Register.click();

		if (successMsg.isDisplayed()) {
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("rowsAffected : " + rowsAffected);
		}

		String login = "INSERT INTO bank.login (username, password) VALUES (?, ?)";

		PreparedStatement pstmt_01 = connection.prepareStatement(login);
		pstmt_01.setString(1, username_);
		pstmt_01.setString(2, password_);
		
		int loginRowsAffected_ = pstmt_01.executeUpdate();
		System.out.println("loginRowsAffected_ : " + loginRowsAffected_);

		Thread.sleep(3000);
		
		logOut.click();
		
	
		// Refresh data by re-executing the query
		System.out.println("\nRefreshed data:");
		
		// printData(statement, "SELECT * FROM bank.customer_register");

		String refresh = "SELECT * FROM bank.login where username = ? and password = ? ";
		PreparedStatement pstmt_R = connection.prepareStatement(refresh);
		pstmt_R.setString(1, username_);
		pstmt_R.setString(2, password_);

		int refersh = pstmt_01.executeUpdate();

		System.out.println("Refrshing login table : " + refersh);

		// printData(statement, "SELECT * FROM bank.login");

	}

	public static void printData(Statement statement, String query) throws SQLException {
		try (ResultSet resultSet = statement.executeQuery(query)) {
			while (resultSet.next()) {

				// Process and print your data here
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getString("password"));
			}
		}
	}

}

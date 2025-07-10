package paraBankPOM;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

	// WebElement repository

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginBtn;

	// bank details
	@FindBy(xpath = "//table[@id='accountTable']//tr//td//a")
	WebElement AccountNo;
	@FindBy(xpath = "(//table[@id='accountTable']//td)[2]")
	WebElement Balance;
	@FindBy(xpath = "(//table[@id='accountTable']//td)[3]")
	WebElement AvailableAmount;
	@FindBy(xpath = "(//table[@id='accountTable']//td//b)[2]")
	WebElement Total;

	public Login(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void login(ResultSet resultSet, PreparedStatement pstmt, Connection connection) throws Throwable {

		String projectpath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(projectpath + "\\src\\main\\resources\\ParabankData.properties");
		Properties filePOM = new Properties();
		filePOM.load(file);

		username.sendKeys(filePOM.getProperty("username"));
		password.sendKeys(filePOM.getProperty("password"));

		pstmt = connection
				.prepareStatement("SELECT id,username, password FROM bank.login WHERE username= ? and password = ?");
		pstmt.setString(1, username.getAttribute("value"));
		pstmt.setString(2, password.getAttribute("value"));

		resultSet = pstmt.executeQuery();

		int id = 0;

		String usernameDB = null, passwordDB = null;

		if (!resultSet.next()) {
			System.out.println("no data");
		}
		while (resultSet.next()) {
			id = resultSet.getInt(1);
			usernameDB = resultSet.getString(2);
			passwordDB = resultSet.getString(3);

		}

		System.out.println(" : DB Username  " + usernameDB + ": DB Password  " + passwordDB);
		System.out.println(" : Enterd Username  " + username.getAttribute("value") + ": Enterd Password  "
				+ password.getAttribute("value"));

		Assert.assertEquals(usernameDB, username.getAttribute("value"));
		Assert.assertEquals(passwordDB, password.getAttribute("value"));
		loginBtn.click();

		// insert account data to account details table
		Thread.sleep(2000);
		String accountNo = AccountNo.getText();
		String balance = Balance.getText();
		String availableAmount = AvailableAmount.getText();
		String total = Total.getText();

		//System.out.println("all details avilabale on screen : " + accountNo + " : " + " : " + balance + " : "+ availableAmount + " : " + total);
		
		int accountNo_ = Integer.parseInt(accountNo);

		String balanceString = balance.replace("$", "");
		float balance_ = Float.parseFloat(balanceString);

		String availableAmountString = availableAmount.replace("$", "");
		float availableAmount_ = Float.parseFloat(availableAmountString);

		String totalString = total.replace("$", "");
		float total_ = Float.parseFloat(totalString);

	//	System.out.println("all parse details  : " + accountNo_ + " : " + " : " + balance_ + " : "	+ availableAmount_ + " : " + total_);
		
		pstmt = connection.prepareStatement("insert into bank.accountdetails (id ,AccountNo,Balance,AvailableAmount,Total) values (?,?,?,?,?)");

		pstmt.setInt(1, id);
		pstmt.setInt(2, accountNo_);
		pstmt.setFloat(3, balance_);
		pstmt.setFloat(4, availableAmount_);
		pstmt.setFloat(5, total_);

		int rowsAffected = pstmt.executeUpdate();

		System.out.println(" account details entered successfully :---> check : " + rowsAffected);

	}

}

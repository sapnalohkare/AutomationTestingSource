package paraBankPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	// WebElement repository

	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement logout;

	public LogOut(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void logout() {

		if (logout.isDisplayed()) {

			logout.click();
			System.out.println("Loged out from para bank..");
		}
	}

}

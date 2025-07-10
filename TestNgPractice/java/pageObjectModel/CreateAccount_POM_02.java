package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_POM_02  {

	// repository: where we find and store web element
	@FindBy(xpath = "//input[@id='id_gender2']")WebElement gender;
	@FindBy(xpath = "//input[@id='customer_firstname']")WebElement firstname;
	@FindBy(xpath = "//input[@id='customer_lastname']")WebElement lastname;
	@FindBy(xpath = "//input[@id='passwd']")WebElement password;
	@FindBy(xpath = "//select[@id='days']")WebElement days;
	@FindBy(xpath = "//select[@id='months']")WebElement months;
	@FindBy(xpath = "//select[@id='years']")WebElement years;
	@FindBy(xpath = "//div[@id='uniform-newsletter']")WebElement newsLetter;
	
	@FindBy(xpath = "//button[@id='submitAccount']")WebElement Register;
	
	public CreateAccount_POM_02(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	
	
	//action perform 
	public void createAccount()
	{
		gender.click();
		firstname.sendKeys("sapna");
		lastname.sendKeys("lohkare");
		password.sendKeys("sapna@5592");
		
		Select daysselect = new Select(days);
		daysselect.selectByIndex(5);
		
		Select monthsselect = new Select(months);
		monthsselect.selectByIndex(5);
		
		Select yearsselect = new Select(years);
		yearsselect.selectByIndex(5);
		
		newsLetter.click();
		
		Register.click();
		
		
	}
	
	
	
	
	

}

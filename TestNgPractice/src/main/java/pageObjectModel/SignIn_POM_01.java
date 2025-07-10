package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuasability.Basic_Reuse;

public class SignIn_POM_01  {
	
	
	//http://www.automationpractice.pl/index.php
	
	
	
	//repository: where we find and store web element
	@FindBy(xpath = "//a[@class='login']") WebElement sign_in;
	@FindBy(css = "input#email_create") WebElement email;
	@FindBy(css = "button#SubmitCreate") WebElement submitCreate;

	public SignIn_POM_01(WebDriver driver)
	{
		//PageFactory pageFact = new PageFactory();
		
		PageFactory.initElements(driver, this);
		
	}
	
	//we need to perform the action
	
	public void accountVerification()
	{
	
		sign_in.click();
		
		Basic_Reuse.scrolToLocation("window.scrollBy(0,700)");
	
		email.clear();
		email.sendKeys("granthirtyk@gmail.com");
	
		submitCreate.click();
		
		
		
	}
	
}

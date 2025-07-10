package listner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resuasability.Basic_Reuse;

public class ParaBankListner extends Basic_Reuse implements ITestListener{
	
	
	@Override
	public void onStart(ITestContext context) {
		
		browserLaunch("Chrome");
		hitURL("https://parabank.parasoft.com/parabank/index.htm");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File target = new File("./parabank/success/" + result.getMethod().getMethodName() + ".png");

		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File target = new File("./parabank/failure/" + result.getMethod().getMethodName() + ".png");

		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		/*if (driver != null)
			driver.quit();*/
	}
	
	
}

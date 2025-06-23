package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import resuasability.Basic_Reuse;

public class Report extends Basic_Reuse {

	static String projectPath = System.getProperty("user.dir");
	public static void main(String[] args) throws Throwable {
		
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectPath+"\\Reports\\MyFirstReport\\");
		
		//configuration set
		Esr.config().setDocumentTitle("Automation Report");
		Esr.config().setReportName("Testing Report");
		Esr.config().setTheme(Theme.STANDARD);//Theme.DARK --> black color
		
		//system configuration set
		ExtentReports Er = new ExtentReports();
		Er.attachReporter(Esr);
		
		Er.setSystemInfo("OS", "Windows");
		Er.setSystemInfo("Browser", "Chrome");
		Er.setSystemInfo("Domain", "Ecommerce");
		Er.setSystemInfo("Client", "Flipkart");
		Er.setSystemInfo("QA", "Sapna Lohkare");
		Er.setSystemInfo("Devloper", "Granthik Lohkare");
		
		//Extends class role : creates test cases
		ExtentTest Et_01 = Er.createTest("Hit URL");
		Et_01.log(Status.INFO, "Amazon URL");
		Et_01.log(Status.PASS, "Test Pass");
		
		ExtentTest Et_02 = Er.createTest("search functionality");
		Et_02.log(Status.INFO, "input entered");
		Et_02.log(Status.PASS, "Test Pass");
		
		ExtentTest Et_03 = Er.createTest("send data");
		Et_03.log(Status.FAIL, "Test Fail");
		
		ExtentTest Et_04 = Er.createTest("clicked on search button");
		Et_04.log(Status.SKIP, "Test skip");
		
		/*--------------------browser activity----------------------*/
		 browserLaunch("Chrome");
		 hitURL("https://www.amazon.in/ref=nav_logo");
		 
		 screenShot("ReportSS1");
		
		 Et_01.addScreenCaptureFromPath(projectPath+"\\ReportSS1\\report_01\\"+".png");
		 Er.flush();
	}

}

package fileUpload;

import org.openqa.selenium.By;


import resuasability.FileUploade_Resuse;

public class ILovePdf_Site extends FileUploade_Resuse {

	public static void main(String[] args) throws Throwable {
		
		browserLaunch("Chrome");
		hitURL("https://www.ilovepdf.com/");
		
		driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
		
		fileUpload(By.xpath("//span[text()='Select PDF file']"), "file:///C:/Users/USER/Desktop/shubham_Pashupalan.pdf");
		
		driver.findElement(By.xpath("//span[@id='processTaskTextBtn']")).click();
		
		driver.findElement(By.xpath("//a[@slot='downloadUrl']")).click();
		

	}
	
}

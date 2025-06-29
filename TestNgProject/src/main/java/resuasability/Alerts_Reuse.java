package resuasability;

import org.openqa.selenium.Alert;

public class Alerts_Reuse extends Basic_Reuse {

	// simple alert with ok button
	public static void simpleAlert() {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();

	}

	// confirmation alert have two buttons: this accepts the alert
	public static void ConfirmationAlert_Accept() {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();

	}

	// confirmation alert have two buttons: this dismiss the alert
	public static void ConfirmationAlert_Dismiss() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.dismiss();
	}

	// in text alert we can send data : here it enter data and accept
	public static void textAlert_Accept() throws Throwable {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("STP INFOTECH STUDENT");

		Thread.sleep(2000);
		alert.accept();
	}

	// in text alert we can send data : here it dismiss text alert
	public static void textAlert_Dismiss() throws Throwable {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
	}

}

package annotation_parameter;

import org.testng.annotations.Test;

public class TestName {

	@Test(testName = "login test")
	public void login() {
		System.out.println("login method....!");
	}
}

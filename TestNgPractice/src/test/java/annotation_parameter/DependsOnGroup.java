package annotation_parameter;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnGroup {

	
	// 4- high , 3 medium , 2 low
	
	
	@Test(groups  = { "High" },priority =1) @Ignore
	public void launchBrowser() {

		System.out.println("launchBrowser Method..");
	}

	@Test(groups = { "High" },priority = 2)
	public void HitURL() {

		System.out.println("hitURL Method..");
	}

	@Test(groups = { "High" },priority = 3)
	
	public void getDBConnectivity() {

		System.out.println("getDBConnectivity Method..");
	}

	@Test(groups = { "High" },priority = 4)
	public void logIn() {

		System.out.println("logIn Method..");
	}

	@Test(groups = { "Medium" },dependsOnGroups = { "High" },priority = 1)
	public void search() {
		System.out.println("search Method..");
	}

	@Test(groups = { "Medium" },dependsOnGroups = { "High" },priority = 2)
	public void text() {
		System.out.println("text Method..");
	}

	@Test(groups = { "Medium" },dependsOnGroups = { "High" },priority = 3)
	public void click() {
		System.out.println("click Method..");
	}

	
	@Test(groups = { "Low" },dependsOnGroups = { "Medium" },priority = 2)
	public void logout() {
		System.out.println("logout Method..");
	}
	
	@Test(groups = { "Low" },dependsOnGroups = { "Medium" },priority = 1)
	public void tearDownResorces() {
		System.out.println("tearDownResorces Method..");
	}
	

}

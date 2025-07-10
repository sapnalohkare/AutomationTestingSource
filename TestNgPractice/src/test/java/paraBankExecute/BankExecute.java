package paraBankExecute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listner.ParaBankListner;
import paraBankPOM.CreateRecord;
import paraBankPOM.LogOut;
import paraBankPOM.Login;
import resuasability.Basic_Reuse;

@Listeners(ParaBankListner.class)

public class BankExecute extends Basic_Reuse {

	public static String host = "localhost";
	public static int port_no = 3306;
	public static Connection connection = null;
	public static Statement statement = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet resultSet = null;

	@BeforeSuite
	public void DBConnection() throws Throwable {

		// 1. Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2nd get connection
		connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port_no + "/bank", "root",
				"Sapna@5592");
		statement = connection.createStatement();
	}

	@Test(priority = 1)
	public void CreateRecord() throws Throwable {
		CreateRecord pom = new CreateRecord(driver);
		pom.createRecord(pstmt, connection, statement);

	}

	@Test(priority = 2,dependsOnMethods = "CreateRecord()")
	public void login() throws Throwable {
		Login loginObj =  new Login(driver);
		loginObj.login( resultSet, pstmt, connection);
	}
	
	@Test(priority = 3,dependsOnMethods = "login()")@Ignore
	public void logout() throws Throwable {
		Thread.sleep(3000);
		LogOut logout =  new LogOut(driver);
		logout.logout();
	}


	@AfterSuite
	public void closeDBConnection() {

		try {

			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.err.println("Error closing resources: " + e.getMessage());
		}
	}

}

package resuasability;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;

public class MYSQLConnectivity_Reuse extends Basic_Reuse {

	public static String host = "localhost";
	public static int port_no = 3306;
	// public static String database_Name ="sapna";

	public static Connection connection = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;

	// @ method for database connection
	public static void database_Connectivity(String database_Name, String query) throws Throwable {

		// 1. Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2nd get connection
		connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port_no + "/mypractice", "root",
				"Sapna@5592");

		// 3. Create a statement
		statement = connection.createStatement();

		// 4. Execute a query
		resultSet = statement.executeQuery(query);

		resultSet.next();

	}

	// @method to fetch database String field
	public static void database_String_Coloumn(String coloumn, By locator) throws SQLException {

		System.out.println(coloumn+" : "+resultSet.getString(coloumn));
		driver.findElement(locator).sendKeys(resultSet.getString(coloumn));
	}

	// method to fetch database integer field
	public static void database_int_Coloumn(int coloumn, By locator) throws SQLException {

		String strNumber = Integer.toString(resultSet.getInt(coloumn));
		driver.findElement(locator).sendKeys(strNumber);
	}

	// method to fetch database date field
	public static void database_date_Coloumn(String dateColoumnName, By locator) throws SQLException {

		java.util.Date databaseDate = resultSet.getDate(dateColoumnName);
		
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 
		 String formattedDate  = formatter.format(databaseDate);
		
		driver.findElement(locator).sendKeys(formattedDate);
	}

	// @closing database connection
	public static void closeResorces() {

		try {

			if (resultSet != null)
				resultSet.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.err.println("Error closing resources: " + e.getMessage());
		}

	}

}

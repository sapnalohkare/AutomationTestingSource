package paraBankPOM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM  {

	// WebElement repository

	@FindBy(xpath = "//a[text()='Register']")
	WebElement RegisterLink;

	@FindBy(xpath = "//input[@id='customer.firstName']")WebElement firstName;
	@FindBy(xpath = "//input[@id='customer.lastName']")WebElement lastName;
	@FindBy(xpath = "//input[@id='customer.address.street']")WebElement street;
	@FindBy(xpath = "//input[@id='customer.address.city']")WebElement city;
	@FindBy(xpath = "//input[@id='customer.address.state']")WebElement state;
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")WebElement zipCode;
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='customer.ssn']")WebElement ssn;
	@FindBy(xpath = "//input[@id='customer.username']")WebElement username;
	@FindBy(xpath = "//input[@id='customer.password']")WebElement password;
	@FindBy(xpath = "//input[@id='repeatedPassword']")WebElement repeatedPassword;
	@FindBy(xpath = "//input[@value='Register']")WebElement Register;

	public RegisterPOM(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// perform action
		public void  customerRegistration(PreparedStatement  pstmt,Connection connection, Statement statement ) throws SQLException {
			
			
			RegisterLink.click();

			firstName.sendKeys("Evanshi");
			lastName.sendKeys("Basande");
			street.sendKeys("borgaonRoad");
			city.sendKeys("wardha");
			state.sendKeys("Maharashtra");
			zipCode.sendKeys("442001");
			phoneNumber.sendKeys("9130682120");
			ssn.sendKeys("567893456");
			
			Random random = new Random();
			// Generate a random integer
			int randomInt = random.nextInt(); 
		   
			System.out.println( "random int "+randomInt);
		  
			username.sendKeys("evabasande"+randomInt);
			password.sendKeys("Eva@1234");
			repeatedPassword.sendKeys("Eva@1234");
	        
			/*---------------------------values------------------------------*/
			
			String  firstName_ = firstName.getAttribute("value");
			 String  lastName_ = lastName.getAttribute("value");
			 String  street_ = street.getAttribute("value");
			 String  city_ = city.getAttribute("value");
			 String  state_ = state.getAttribute("value");
			 String  zipCode_ = zipCode.getAttribute("value");//int
			 String  phoneNumber_ = phoneNumber.getAttribute("value");//long
			 String  ssn_ = ssn.getAttribute("value");//long
			 
			 String  username_ = username.getAttribute("value");
			 String  password_ = password.getAttribute("value");
			 String  repeatedPassword_ = repeatedPassword.getAttribute("value");
			 System.out.println("password : "+password_+" repeatedPassword_ :"+repeatedPassword_);
			 
			 int zipCode_int = Integer.parseInt(zipCode_);
			 long phoneNumber_long = Long.parseLong(phoneNumber_);
			 long ssn_long = Long.parseLong(ssn_);
			
			  String sql = "INSERT INTO bank.customer_register (firstName, lastName,street,city,state,zipCode,phoneNumber,ssn,username,password,repeatedPassword) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			  
			  pstmt = connection.prepareStatement(sql);
			  pstmt.setString(1, firstName_);
			  pstmt.setString(2, lastName_);
			  pstmt.setString(3, street_);
			  pstmt.setString(4, city_);
			  pstmt.setString(5, state_);
			  
			  pstmt.setInt(6, zipCode_int);
			  pstmt.setLong(7, phoneNumber_long); 
			  pstmt.setLong(8, ssn_long);
			  
			  pstmt.setString(9, username_);
			  pstmt.setString(10, password_);
			  pstmt.setString(11, repeatedPassword_);
			  
			  String insertQuery = "INSERT INTO bank.customer_register (firstName, lastName,street,city,state,zipCode,phoneNumber,ssn,username,password,repeatedPassword) VALUES ('firstName_', 'lastName_','street_','city_','state_',zipCode,phoneNumber,ssn,'username_','password_','repeatedPassword_')";
			// submit customer details
			Register.click();
			
			int rowsAffected = statement.executeUpdate(insertQuery);
			System.out.println("rowsAffected : "+rowsAffected);
			   
			
		}
	
}
		
	
	
	
	/*//record save query
	public String createRecord()
	{
	 String  firstName_ = firstName.getAttribute("value");
	 String  lastName_ = lastName.getAttribute("value");
	 String  street_ = street.getAttribute("value");
	 String  city_ = city.getAttribute("value");
	 String  state_ = state.getAttribute("value");
	 String  zipCode_ = zipCode.getAttribute("value");//int
	 String  phoneNumber_ = phoneNumber.getAttribute("value");//long
	 String  ssn_ = ssn.getAttribute("value");//long
	 
	 String  username_ = username.getAttribute("value");
	 String  password_ = password.getAttribute("value");
	 String  repeatedPassword_ = repeatedPassword.getAttribute("value");
	 System.out.println("password : "+password_+" repeatedPassword_ :"+repeatedPassword_);
	 
	 int zipCode_int = Integer.parseInt(zipCode_);
	 long phoneNumber_long = Long.parseLong(phoneNumber_);
	 long ssn_long = Long.parseLong(ssn_);
	 
	
	 StringBuilder sqlBuilder = new StringBuilder("INSERT INTO bank.customer_register (");
     StringBuilder valuesBuilder = new StringBuilder("VALUES (");

     List<String> columnNames = Arrays.asList("firstName", "lastName", "street","city","state","zipCode","phoneNumber","ssn","username","password","repeatedPassword"); // Example dynamic columns

     List<Object> values = Arrays.asList(firstName_, lastName_, street_,city_,state_,zipCode_int,phoneNumber_long,ssn_long,username_,password_,repeatedPassword_);
     
     for (int i = 0; i < columnNames.size(); i++) {
         sqlBuilder.append(columnNames.get(i));
         valuesBuilder.append(values.get(i));
         if (i < columnNames.size() - 1) {
             sqlBuilder.append(", ");
             valuesBuilder.append(", ");
         }
     }
     sqlBuilder.append(") ");
     valuesBuilder.append(");");

     String sql = sqlBuilder.toString() + valuesBuilder.toString();
     
	 
	return sql;
			/*" INSERT INTO bank.customer_register (firstName, lastName, street,city,state,zipCode,phoneNumber,ssn,username,password,repeatedPassword) VALUES"
			+ "("+"""+firstName_+","+lastName_+","+street_+","+city_+","+state_+","+zipCode_int+","+phoneNumber_long+","+ssn_long+","+username_+","+password_+","+repeatedPassword_+")"+";";*/
		

	
	



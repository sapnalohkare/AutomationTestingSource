//To execute this first create User class and then copy entire code
package java_concept;
public class User {

	static String userName;
	static String passward;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       
		//User Data 
		User userObject = new User();
		boolean createUser;
		String name = "Sapna Lohkare";
		int age = 20;
		float salary = 30000.500f;
		char employeeGrade = 'A';

		createUser = userObject.validateDetails(name, age, salary, employeeGrade);

		if (createUser == true) 
		{
			System.out.println("User Succesfully Registered..!!!" + "\n");
			userName = User.getUserName(name);
			passward = User.getUserPassward(name);
			System.out.println("Username -> " + userName + "\n" + "Passward -> " + passward);
		} 
		else 
		{
			System.out.println("\n"+"Unable to register user , please check entered details....!!!");
		}

	}
     
	//method to validate user entered details
	public boolean validateDetails(String name, int age, float salary, char employeeGrade) 
	{

		if (name == null || name.equals("")) {
			System.out.println("Please enter your Name ...");
			return false;
		}

		if (!(age > 1 && age < 100)) {
			System.out.println("The Age must be a number between 1 and 100");
			return false;
		}

		if (salary <= 0) {
			System.out.println("Please enter your Salary...");
			return false;
		}

		if (!(employeeGrade == 'A' || employeeGrade == 'B')) {
			System.out.println("Please enter Employee Grade..");
			return false;
		}
		return true;

	}

	//method to create passward from name
	public static String getUserPassward(String empPass) 
	{
		int randomNum = (int) (Math.random() * 101);
		String ranNumber = Integer.toString(randomNum); // random number from 1 to 100

		passward = empPass.concat(ranNumber);

		return passward.replaceAll("\\s", "");
	}
   
	
	//method to create username from  name
	public static String getUserName(String empName) 
	{
		userName = empName.toUpperCase();
		return userName.replaceAll("\\s", "");
	}

}

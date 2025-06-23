package control_statements.Decision_Making_switch;

public class Switch_Homework {

	public static void main(String[] args) {
		
		

		/*********** Week name based on week number **************/

		int week_No = 6;
		switch (week_No)

		{
		case 1: {
			System.out.println("its Sunday :-> Named after the Sun..");
			break;
		}
		case 2: {
			System.out.println("its Monday :-> Named after the Moon..");
			break;
		}
		case 3: {
			System.out.println("its Tuesday :-> Named after the Germanic god Tyr..");
			break;
		}
		case 4: {
			System.out.println("its Wednesday :-> Named after the Germanic god Woden..");
			break;
		}
		case 5: {
			System.out.println("its Thursday :-> Named after the Germanic god Thor..");
			break;
		}
		case 6: {
			System.out.println("its Friday :->Named after the Germanic goddess Freya or Frigg..");
			break;
		}
		case 7: {
			System.out.println("its Saturday :-> Named after the Roman god Saturn..");
			break;
		}

		default: {
			System.out.println("Invalid week number..please check again");
			break;
		}

		}

		/*********** Week number based on week name **************/
		String week_name = "Monday";

		switch (week_name)

		{
		case "Sunday": {
			System.out.println("its Sunday : day " + 1);
			break;
		}
		case "Monday": {
			System.out.println("its Monday : day " + 2);
			break;
		}
		case "Tuesday": {
			System.out.println("its Tuesday : day " + 3);
			break;
		}
		case "Wednesday": {
			System.out.println("its Wednesday : day " + 4);
			break;
		}
		case "Thursday": {
			System.out.println("its Thursday : day " + 5);
			break;
		}
		case "Friday": {
			System.out.println("its Friday : day " + 6);
			break;
		}
		case "Saturday": {
			System.out.println("its Saturday : day " + 7);
			break;
		}

		default: {
			System.out.println("Invalid week name..please check again");
			break;
		}
		}

		/*********** month name based on month number **************/

		int month_Number = 1;

		switch (month_Number) {
		case 1:
			System.out.println("Month name --> January");
			break;

		case 2:
			System.out.println("Month name --> February");
			break;
		case 3:
			System.out.println("Month name --> March");
			break;
		case 4:
			System.out.println("Month name --> April");
			break;
		case 5:
			System.out.println("Month name --> May");
			break;
		case 6:
			System.out.println("Month name --> June");
			break;
		case 7:
			System.out.println("Month name --> July");
			break;
		case 8:
			System.out.println("Month name --> August");
			break;
		case 9:
			System.out.println("Month name --> September");
			break;
		case 10:
			System.out.println("Month name --> October");
			break;
		case 11:
			System.out.println("Month name --> November");
			break;
		case 12:
			System.out.println("Month name --> December");
			break;

		default:
			System.out.println("Invalid month number...");
			break;
		}

		/*********** roll number based on name of student *********/

		String name_Studeny = "Dipali";
		switch (name_Studeny) {
		case "Bhavika":
			System.out.println(name_Studeny + "'s roll number is :-> " + 1);

			break;
		case "Sapna":
			System.out.println(name_Studeny + "'s roll number is :-> " + 2);
			break;
		case "Sandip":
			System.out.println(name_Studeny + "'s roll number is :-> " + 3);
			break;
		case "Aishwarya":
			System.out.println(name_Studeny + "'s roll number is :-> " + 4);
			break;

		case "Dipali":
			System.out.println(name_Studeny + "'s roll number is :-> " + 5);
			break;

		default:
			System.out.println("Student is not from STP Infotech");
			break;
		}

		/*********** roll name based on student roll number *********/

		int student_RollNumber = 3;
		switch (student_RollNumber) {
		case 1:
			System.out.println("Roll number 1 is assigned  to :-> " + "Bhavika");

			break;
		case 2:
			System.out.println("Roll number 2 is assigned  to :-> " + "Sapna");
			break;
		case 3:
			System.out.println("Roll number 3 is assigned  to :-> " + "Sandip");
			break;
		case 4:
			System.out.println("Roll number 4 is assigned  to :-> " + "Aishwarya");
			break;

		case 5:
			System.out.println("Roll number 5 is assigned  to :-> " + "Dipali");
			break;

		default:
			System.out.println("This roll no is not assigned to anybody ");
			break;
		}

		/***************** Employee Id based on Employee name *************/

		String emp_Name = "Granthik";
		switch (emp_Name) {
		case "Anvika":
			System.out.println(emp_Name + " is from wipro and her Emp_ID is :-> W_20" + 1);

			break;
		case "Granthik":
			System.out.println(emp_Name + " is from wipro and his Emp_ID is :-> W_20" + 2);
			break;
		case "Varonica":
			System.out.println(emp_Name + " is from wipro and her Emp_ID is :-> W_20" + 3);
			break;
		case "Sanyukta":
			System.out.println(emp_Name + " is from wipro and her Emp_ID is :-> W_20" + 4);
			break;

		case "Kadambari":
			System.out.println(emp_Name + " is from wipro and her Emp_ID is :-> W_20" + 5);
			break;

		default:
			System.out.println("Employee is not from Wipro");
			break;
		}

		/***************** Employee name based on Employee Id *************/

		String emp_ID = "W_003";
		switch (emp_ID) {
		case "W_001":
			System.out.println("Employee ID-> " + emp_ID + " is assigned to Anvika");

			break;
		case "W_002":
			System.out.println("Employee ID-> " + emp_ID + " is assigned to Granthik");
			break;
		case "W_003":
			System.out.println("Employee ID-> " + emp_ID + " is assigned to Varonica");
			break;
		case "W_004":
			System.out.println("Employee ID-> " + emp_ID + " is assigned to Sanyukta");
			break;

		case "W_005":
			System.out.println("Employee ID-> " + emp_ID + " is assigned to Kadambari");
			break;

		default:
			System.out.println("Employee is not from Wipro");
			break;
		}

	}
}

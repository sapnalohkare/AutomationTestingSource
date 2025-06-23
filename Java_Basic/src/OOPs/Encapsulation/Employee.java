package OOPs.Encapsulation;

// 	1)to hide data variables
//	2)instead use setter and getter method to access those private field
//	3)Encapsulation helps to protect data and control access to it.

public class Employee {

	// encapsulated private fields only can be access though setter and getter
	// methods...
	private String name, address, email;
	private int salary, emp_Id;

	// you can't set value of comppanyName if don't have setter method..
	private String comppanyName = "Fujitsu";

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected String getAddress() {
		return address;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getEmail() {
		return email;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	protected int getSalary() {
		return salary;
	}

	protected void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	protected int getEmp_Id() {
		return emp_Id;
	}

	public static void main(String[] args) {
		Employee emp_Object = new Employee();
		emp_Object.setName("Granthik Divakar Basande");
		emp_Object.setAddress("Sawangi meghe wardha- 442001");
		emp_Object.setEmail("granthikbasande@gmail.com");
		emp_Object.setSalary(500000);
		emp_Object.setEmp_Id(4567);

		System.out.println("Coampany name : " + emp_Object.comppanyName + " , Name :" + emp_Object.getName()
				+ " , Address : " + emp_Object.getAddress() + " \n" + " Email ID : " + emp_Object.getEmail()
				+ " , Salary : " + emp_Object.getSalary() + " , Employee Id : " + emp_Object.getEmp_Id());

	}

}

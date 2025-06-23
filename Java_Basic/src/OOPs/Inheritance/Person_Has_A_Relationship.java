package OOPs.Inheritance;

//person has Address
public class Person_Has_A_Relationship {
	String name;

	public void setName() {
		this.name = "Sapna Basande";
	}

	public void getName() {
		System.out.println(this.name);
	}

	public static void main(String[] args)

	{
		Person_Has_A_Relationship per_Object = new Person_Has_A_Relationship();
		per_Object.setName();
		per_Object.getName();

		Address add_Object = new Address();
		add_Object.setAddress();
		add_Object.getAddress();

	}

}

//Person has address - its a has a relationship
class Address {
	int plotNumber;
	String descrition;

	public void setAddress() {
		this.plotNumber = 43;
		this.descrition = "Near Takshashila vasahat sawangi meghe wardha-442001";
	}

	public void getAddress() {
		System.out.println("Plot no : "+this.plotNumber + " " + this.descrition);
	}

}
package Java_Object;


//object is having attribute and behaviors, every object id different

public class Student {

	
	int rollNo;
	String name;
	
	public void setname(String name)
	{
		this.name = name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
		
	}
	
	public void display()
	{
		System.out.println("Roll No : "+rollNo+" Name : "+name);
	}
	public static void main(String[] args) 
	{
		
		//object creation
		Student s1 = new Student();//this is object one
		s1.setname("Granthik");
		s1.setRollNo(420);
		s1.display();
		
		Student s2 = new Student();//this is object two
		s2.setname("Evanshi");
		s2.setRollNo(422);
		s2.display();
	}

}

package this_;

public class One_Student 
{
	//1)this can be used to refer current class instance variable.

	
	int rollNo;
	String name;
	Float fees;
	
	public One_Student(int rollNo,String name,Float fees)
	{
		this.rollNo= rollNo;
		this.name = name;
		this.fees = fees;
		
	}
	
	public void display()
	{
		System.out.println(rollNo+" "+name+" "+fees);
	}
	
	public static void main(String[] args)
	{
		One_Student object_1 = new One_Student(4,"Evanshi",7000.9f);
		One_Student object_2 = new One_Student(32,"Sapna",600000.5f);
		object_1.display();
		object_2.display();
		
		

	}

}

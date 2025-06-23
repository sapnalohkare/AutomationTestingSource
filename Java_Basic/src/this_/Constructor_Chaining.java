package this_;

public class Constructor_Chaining 
{
	int rollNo;
	String name,course;
	float fees;
	
	
	Constructor_Chaining(int rollNo,String name,String course )
	{
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	Constructor_Chaining(int rollNo,String name,String course,float fees )
	{
		this(rollNo, name, course);
		this.fees = fees;
		
	}

	
	public void display()
	{
		System.out.println(rollNo+" "+name+" "+course+" "+fees);
	}
	public static void main(String[] args) 
	{
		Constructor_Chaining object_01 = new Constructor_Chaining(304, " Evanshi Basande "," Nursury ");
		Constructor_Chaining object_02 = new Constructor_Chaining (504," Sapna Lohkare ","Engineering",30000.89f);

		
		object_01.display();
		object_02.display();
		
	}

}

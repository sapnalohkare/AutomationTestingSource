package String_Learn;

public class CompareToObject implements Comparable<CompareToObject> {

	
	String title ,country;
	int age;
	
	public CompareToObject(String title,String country,int age)
	{
		this.title = title;
		this.country = country;
		this.age = age;
	
		
	}
	
	public void display() 
	{
		System.out.println("Title : "+title+"Country : "+country+" age : "+age);
	}

	
	public static void main(String[] args)throws Exception
	{
		
		CompareToObject  com_01 = new CompareToObject("Godrej", "India", 45);
		CompareToObject  com_02 = new CompareToObject("Bosch", "Japan", 20);
		
		System.out.println(com_01.compareTo(com_02));
		System.out.println(com_02.compareTo(com_01));
		System.out.println(com_01.compareTo(com_01));
	}
	
	

	@Override
	public int compareTo(CompareToObject other)
	{
		if(this.title.compareTo(other.title)>0)
			return 1;
		
		if(this.title.compareTo(other.title)<0)
			return -1;
		
		
		return 0;
	}

}

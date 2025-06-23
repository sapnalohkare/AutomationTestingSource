package OOPs.Abstraction;

public abstract class Samsung
{   
	final static String name = "Samsung";
	String color ;
	final String certified = "ISI Marked";
	final int Eshtablishment_year = 1998;
	
	
	Samsung(String color)
	{
		this.color = color;
	}
		
	
	public String ElectronicDetails()
	{
		return "......Electronic item  Details....";
	}
	
	public void makingElectronicItme()
	{
		System.out.println(name +" makes electronic item..");
	}
	public static  void employeeHike()
	{
		System.out.println(name +" gives employee hike..");
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	
}

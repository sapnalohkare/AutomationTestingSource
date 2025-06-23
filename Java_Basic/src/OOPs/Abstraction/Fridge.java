package OOPs.Abstraction;

public class Fridge extends Samsung
{   
	String utilityName = "Fridge";
	String modelNo ;
	int capacity;

	
	Fridge(String color, String modelNo, int capacity) 
	{
		super(color);
		this.modelNo = modelNo;
		this.capacity = capacity;
		
	}
	
	public static void main(String[] args) 
	{
		Fridge object = new Fridge("wooden","5000LKg",400);
		
		object.makingElectronicItme();
		Fridge.employeeHike();
		
		String allDetails = object.displayDetails();
		System.out.println(allDetails);
		
		object.turnOn();
		object.turnOff();
		
		
	}

	public String toString()
	{
		return "Color : "+super.color+" , Certification : "+super.certified+" , Eshtablishment Year : "+super.Eshtablishment_year;
	}
	
	
	public String displayDetails()
	{
		System.out.println(super.ElectronicDetails()+" : "+utilityName);
		return this.toString()+" , Model No  : "+this.modelNo+" , Capacity :"+this.capacity;
	}
	
	@Override
	public void turnOn() 
	{
		
		System.out.println(this.utilityName + " is ON.. ");
		this.coolingStart();
	}
 
	public void coolingStart()
	{
		System.out.println("Cooling Starts...");
	}
	public void coolingStoped()
	{
		System.out.println("Cooling Stoped...");
	}
	
	@Override
	public void turnOff() 
	{
		System.out.println(this.utilityName + " is OFF.. ");
		this.coolingStoped();
		
	}
    

  
}

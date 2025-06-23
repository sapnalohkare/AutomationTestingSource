package OOPs.Inheritance;

//Altroz is a car ----is a relationship---
public class Altroz extends Car 
{
		public static void main(String[] args)
		{
			Altroz altroz = new Altroz();
			altroz.setName("Altroz");
			altroz.setCarMaxSpeed(400);
			altroz.getCarInfo();
			
			
			//Inherits only parents class properties and methods
			Car carObject = new Altroz();
			carObject.car_Demo();
			
		}
		

}

 class Car 
{
	
	private String name;
	private int carMaxSpeed;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCarMaxSpeed(int carMaxSpeed)
	{
		this.carMaxSpeed = carMaxSpeed;
	}

	
	public void getCarInfo()
	{
		System.out.println("Car name = " +this.name +" ,  "+ " Max Speed= "+this.carMaxSpeed);
	}
	
	
	//car has a engine----has a relationship
	public void car_Demo()
	{
		Engine engine = new Engine();
		engine.start();
		engine.stop();
	}
	
}





class Engine
{
	
	public void start()
	{
		
		System.out.println("Engine Starts..");
	}
	
	public void stop()
	{
		
		System.out.println("Engine Stop..");
	}
	
}

package homework;

public class Moon extends Earth
{

	public void revolve()
	 {
		 System.out.println("moon..");
	 }
	
	public static void main(String[] args)
	{
		Moon moon_Object = new Moon();
		moon_Object.revolve();

	}

}

 class SolarSystem 
{
 public void revolve()
 {
	 System.out.println("SolarSystem");
 }
}
  class Earth extends SolarSystem  {
		public void revolve()
		 {
			 System.out.println("Earth");
		 }
	}
 
  class Mars extends SolarSystem  {
		public void revolve()
		 {
			 System.out.println("Mars");
		 }
	}
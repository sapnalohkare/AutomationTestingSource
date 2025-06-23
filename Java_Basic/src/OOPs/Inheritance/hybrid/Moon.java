package OOPs.Inheritance.hybrid;

public class Moon extends Earth 
{

	public void revolve()
	 {
		 System.out.println("moon..");
	 }
	public static void main(String[] args) {
		
		Moon moon_Object = new Moon();
		moon_Object.revolve();
	}

}

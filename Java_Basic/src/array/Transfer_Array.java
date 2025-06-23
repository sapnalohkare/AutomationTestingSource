package array;

public class Transfer_Array 
{

	public static void main(String[] args) 
	{
      
		String name[] = new String[4];
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		
       for (int i = 0; i < cars.length; i++) 
       {
    	   name[i] = cars[i];
		
	   }
       
       //fetching element
       for (String car : name) 
       {
		 System.out.println(car);
       }
       

	}

}

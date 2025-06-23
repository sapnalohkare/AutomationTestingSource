package array;

import java.util.Arrays;

public class Sort_Method {

	public static void main(String[] args)
	{
		String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
		
       Arrays.sort(cars);
       
       System.out.println("Sorted in aplphabetical order....");
       
       for (String car_Name : cars) 
       {
		System.out.println(car_Name);
       }

	}

}

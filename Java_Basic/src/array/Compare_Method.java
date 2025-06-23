package array;

import java.util.Arrays;

public class Compare_Method {

	public static void main(String[] args)
	{
		String[] car1 = {"Volvo", "BMW", "Tesla"};
		String[] car2 = {"Volvo", "BMW", "Tesla"};
		
		System.out.println(Arrays.compare(car1, car2));//return zero as both are equal
	}

}

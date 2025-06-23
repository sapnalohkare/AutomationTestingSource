package array;

public class Greatest_Age {

	public static void main(String[] args)
	{
		
		int[] ages = {70,1690,1678,40,60,478,50};
		
		int greatestAge = ages[0];		
		
		for (int i = 1; i < ages.length; i++)
		{
			if (greatestAge < ages[i] )
			{
				greatestAge = ages[i];
			}
			
			
		}
		
		System.out.println("greatest number is --> "+greatestAge);
		
	}

}

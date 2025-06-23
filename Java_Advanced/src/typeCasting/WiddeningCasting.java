package typeCasting;

public class WiddeningCasting {

	public static void main(String[] args)
	{
		int a =10;
		long b = a;
		
		System.out.println("------int to long-----> "+b);

		
		float c =80.06f;
		double f = c;
		
		System.out.println("------float to double-----> "+f);
		
		int e =80;
		double g = e;
		
		System.out.println("------int to double-----> "+g);
	}

}

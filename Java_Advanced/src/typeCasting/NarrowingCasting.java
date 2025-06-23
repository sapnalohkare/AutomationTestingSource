package typeCasting;

public class NarrowingCasting /*explicit casting */
{

	public static void main(String[] args)
	{
		 int a = 60;
		
		 short b = (short) a;
		 System.out.println("------narrowing castion from int to short------> "+b);
		 
		 
		 double num = 1000.97;
		 
		 int num_con = (int) num;
		 
		 System.out.println("------narrowing castion from double to int------> "+num_con);
	}

}

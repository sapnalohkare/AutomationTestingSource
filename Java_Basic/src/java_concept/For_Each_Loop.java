package java_concept;

public class For_Each_Loop {

	public static void main(String[] args) 
	{
		String [] cars = {"volvo","TATA","SUZUKI","HYNDAI"};
		
		System.out.print("I have :");
		for(String i : cars)
		{
			if (i=="volvo")
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(","+i);
			}
			
			//System.out.println("I have :"+i);
		}
		// TODO Auto-generated method stub
		
        System.out.println();
      //  System.out.println();
		int[] notes = {10,50,100,500,1000};
		System.out.print("I carry : ");
		for (int n : notes)
		{
			//System.out.println(n);
			if (n==10)
			{
				System.out.print(n);
			}
			else
			{
				System.out.print(","+ n);
				
			}
			
		}
	}

}

package java_concept;

public class For_Loop_Example 
{
	 public static void main(String[] args)
		{ 
		    //addition of 10 to i
			for (int i = 0 ; i <= 100 ; i += 10)
			{
				System.out.println(i);
				
			}
			
			// even number finding
		    int sum = 0;
			for (int j = 2 ; j <=20 ; j +=2)
			 {
				 System.out.print(j + ",");
				 sum++;
			 }
			 System.out.println();
			 System.out.println( "total number are : "+sum);
			 
			 
			 //multiplication of 2
			 int multiplier = 2;
			 for (int i =1 ;i<=10;i++)
			 {
				 int val= multiplier*i;
				 System.out.print(val +",");
				
			 }
		}
	 
	 //even number 
	 
	

}

package homework;

public class For_Loop_Practice {

	public static void main(String[] args)
	{

		_0_1_triangle_Pattern(5,5);
		half_Pyramid_With_Numbers(5,5);
		inverted_half_Pyramid_With_Numbers(5);
		floyd_Triangle(5);
		solid_Rectangle(5,10);
		hallow_Rectangle(5,20);
		half_Pyramid(5);
		inverted_Half_Pyramid(5);
		inverted_Half_Pyramid_Rotated_By_180(5);
	}
	
	
	private static void inverted_Half_Pyramid_Rotated_By_180(int rows) 
	{
		   	   /* 
		      * * 
		    * * * 
		  * * * * 
		* * * * */
		System.out.println("\n"+"-------inverted Half Pyramid Rotated By 180-------"+"\n");
		
		for (int m =1 ; m<=rows ; m++) 
		{
			for (int i = 1; i<=rows-m ; i++)
	        {
				System.out.print("  ");
			}
			for (int p =1  ; p <= m ; p++)
	        {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}


	private static void inverted_Half_Pyramid(int rows)
	{
	       /* * * * * 
			* * * * 
			* * * 
			* * 
			*/
		System.out.println("\n"+"-------inverted half pyramid-------"+"\n");
		for (int i = 5; i>=1; i--)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private static void half_Pyramid(int rows)
	{
		   /* 
			* * 
			* * * 
			* * * * 
			* * * * */
			
		System.out.println("\n"+"-------half pyramid-------"+"\n");
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <=i ; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	private static void hallow_Rectangle(int rows, int column) 
	{
		
	   /* * * * * * * * * * 
		*                 * 
		*                 * 
		*                 * 
		* * * * * * * * * */ 

		System.out.println("\n"+"-------hallow rectangle-------"+"\n");
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <= column; j++) 
			{
				if (i==1||i==rows||j==1||j==column) 
				{
					System.out.print("* ");
				} else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		
	}
	private static void solid_Rectangle(int rows, int column) 
	{
	   /* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * */
		System.out.println("\n"+"-------solid rectangle-------"+"\n");
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <= column; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}
	private static void floyd_Triangle(int rows) 
	{
	  /*1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 */
		
		System.out.println("\n"+"-------floyd's triangle-------"+"\n");
		int num= 1;
		for (int j2 = 1; j2 <=rows ; j2++) 
		{
			for (int i = 1; i <=j2; i++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}
	
	private static void inverted_half_Pyramid_With_Numbers(int rows)
	{
		  /*1 2 3 4 5 
			1 2 3 4 
			1 2 3 
			1 2 
			1 
			*/
		System.out.println("\n"+"-------inverted half Pyramid With Numbers-------"+"\n");
		for (int i = rows; i>=1 ; i--) 
		{
			for (int j = 1; i>=j ; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	private static void half_Pyramid_With_Numbers(int rows,int column)
	{
	  /*1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5*/ 
		
		System.out.println("\n"+"------half Pyramid With Numbers----------"+"\n");
		
		for (int i = 1; i <=rows; i++) 
		{
			for (int j = 1; j <=i ;j++) 
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
					}
	}
	
	private static void _0_1_triangle_Pattern(int rows,int column)
	{
		
		  /*1 
			0 1 
			1 0 1 
			0 1 0 1 
			1 0 1 0 1 */
		
		System.out.println("--------_0_1_traiangle Pattern----------"+"\n");
		
		int sum ;
		for (int i = 1; i <= rows ; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				sum = i+j;
				
				if(sum%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
				
			}
			
			System.out.println();
		}
	}

}

package java_concept;

public class Average_OfNumbers 
{
public static void main(String[] args) 
{
	int ages[] = {10,20,30,40,50};
	float sum = 0 , avg ;
	
	//finding average of the number
	for (int i =0 ;i<ages.length;i++)
	{
		sum = sum +ages[i];
	}
	
	avg  = sum/ages.length;
	System.out.println("average of the all number is -> "+avg);
	
	//finding smallest number in array
	

	for (int j =0 ;j<ages.length;j++)
	{
		if (ages[0]<= ages[j])
		{
			System.out.println("Yes small hai");
			
		}
		
	}
	
}
}

package array;

public class Duplicate_Value_Array {

	public static void main(String[] args) 
	{

		int num[]= {70,50,50,50,49,20,70};
		
		int num_Dup = 50;
		int count = 0;
     for (int val : num) 
     {
		if (val == num_Dup ) 
		{
			count++;
		}
	}
     
     System.out.println(num_Dup+" Repeted--> "+count+" times..");
	}

}

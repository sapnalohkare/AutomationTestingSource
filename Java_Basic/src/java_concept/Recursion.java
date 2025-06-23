package java_concept;

public class Recursion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//add number from 0 to 10
		int result = sum(10);
		System.out.println(result);
		int sum  = sum(5, 10);
		System.out.println(sum);

	}

	static int sum (int k)
	{
		if (k>0)
		{
			return k + sum(k-1);
		}
		else
		{
			return 0;
		}
		
	}
	
	//add number from 5 to 10
	public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	}
}

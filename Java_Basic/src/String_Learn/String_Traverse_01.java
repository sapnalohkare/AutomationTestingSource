package String_Learn;

public class String_Traverse_01 {

	public static void main(String[] args) 
	{
		String testing ="smoketesting";
		
		char arr[] = testing.toCharArray();
		
		System.out.println("-----------Forward direction-------------");
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		
		System.out.println("-----------Reverse direction-------------");
		for (int i = arr.length-1; i >=0 ; i--)
		{
			System.out.println(arr[i]);
		}

	}

}

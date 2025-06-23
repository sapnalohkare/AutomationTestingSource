package java_concept;

public class java_math {
	public static void main(String[] args)
	{
		int maxResult = Math.max(70,90);
		System.out.println(maxResult);
		
		int minResult = Math.min(7,90);
		System.out.println(minResult);
		
		int sqrRoot = (int) Math.sqrt(81);
		System.out.println(sqrRoot);
		

		System.out.println(Math.abs(-4.7));
		System.out.println(Math.random());
		
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);
		
	}

}

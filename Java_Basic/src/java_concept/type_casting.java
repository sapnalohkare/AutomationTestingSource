package java_concept;

public class type_casting 
{  
		/*int age = 99;
		double myage = age ;*/
	public static void main(String[] args) 
	 {  
		//Widening Casting 
		int age = 99;
		double myage = age ;
		System.out.println("my age is " + myage);
		
		//Lower Casting 
		double myCurrentAge = 88.90;
		int currentAge = (int) myCurrentAge;
		System.out.println("my current age is " + currentAge);
	
		//Real-Life Example
		int maxScore = 500;
		int userScore = 423;
		float percentage = (float) userScore/maxScore *100.00f;
		System.out.println("Percentage is " + percentage);

	 }
}

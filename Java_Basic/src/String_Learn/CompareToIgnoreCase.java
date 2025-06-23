package String_Learn;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
		
		//return : 0 ,negative ,positive
		String tutorial_01 ="JavaTpoint";
		String tutorial_02 ="JAVATPOINT";
		
		String tutorial_03 ="GrekForGreekforGreek";
		
		System.out.println("both same compare : "+tutorial_01.compareToIgnoreCase(tutorial_02));
		System.out.println("one_small and second_large : "+tutorial_01.compareToIgnoreCase(tutorial_03));
		System.out.println("second_large and one_small : "+tutorial_03.compareToIgnoreCase(tutorial_01));

	}

}

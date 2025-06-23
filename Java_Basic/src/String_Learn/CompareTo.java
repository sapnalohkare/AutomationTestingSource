package String_Learn;

/*Using int compareTo(Object obj)
Using int compareTo(String AnotherString)
Using int compareToIgnoreCase(String str)*/

public class CompareTo {

	public static void main(String[] args) {
		
		//returns : 0 ,negative or positive value
		
		String tutorial_01 ="JavaTpoint";
		String tutorial_02 ="JavaTpoint";
		
		String tutorial_03 ="GrekForGreekforGreek";
		
		System.out.println("both same compare : "+tutorial_01.compareTo(tutorial_02));
		System.out.println("one_small and second_large : "+tutorial_01.compareTo(tutorial_03));
		System.out.println("second_large and one_small : "+tutorial_03.compareTo(tutorial_01));

	}

}

package collection.List.ArrayList_;

import java.util.ArrayList;

public class For_Each_Loop {

	public static void main(String[] args) 
	{
		ArrayList<Character> gradeList = new ArrayList<Character>();
		gradeList.add('A');
		gradeList.add('B');
		gradeList.add('C');
		gradeList.add('D');
		
		int count = 1;
		for(Character grade : gradeList)
		{
			System.out.println(count+" : "+grade);
			count++;
		}
		

	}

}

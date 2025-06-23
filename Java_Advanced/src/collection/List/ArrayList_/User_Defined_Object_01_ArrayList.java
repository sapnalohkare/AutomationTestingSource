package collection.List.ArrayList_;

import java.util.ArrayList;

public class User_Defined_Object_01_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Student> studentslist = new ArrayList<Student>();
		
		studentslist.add(new Student("Sapna Lohkare", "J D College", 'A', 30));
		studentslist.add(new Student("Priti Ajmire", "S.B Jain", 'C', 32));
		studentslist.add(new Student("Rashmi Makode", "Gurunanak", 'B', 29));
		
		for (Student student : studentslist) 
		{
			System.out.println(student.name+" : "+student.college+" : "+student.grade+" : "+student.age);
		}


	}

}

class Student
{
	String name, college;
	char grade;
	int age;
	
	Student(String name,String college,char grade, int age)
	{
		this.name = name;
		this.college = college;
		this.grade = grade;
		this.age = age;
		
	}
	
	


}
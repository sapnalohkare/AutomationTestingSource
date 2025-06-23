package static_;

//If we declare any variable as static, it is known as a static variable.

/*1) The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
	for example, the company name of employees, college name of students, etc.

2) The static variable gets memory only once in the class area at the time of class loading.

3) Static variables in Java are also initialized to default values if not explicitly initialized by the programmer. 
	They can be accessed directly using the class name without needing to create an instance of the class.

4) Static variables are shared among all instances of the class, meaning if the value of a static variable is changed in one instance, 
it will reflect the change in all other instances as well.*/

public class Variable 
{
  static String college  ="J.D.College of Engineering";
  int rollNo;
  String name;
  
  
  
   Variable(int rollNo,String name)
  {
	  this.name = name;
	  this.rollNo = rollNo;
	  
	  
  }
   
   public void Display()
   {
	   
	  System.out.println("Name : "+name+" "+"Roll No : "+rollNo+" "+"College : "+college);
   }
   
	public static void main(String[] args) 
	{
		Variable var_01 = new Variable(45,"Granthik");
		Variable var_02 = new Variable(50,"Evanshi");
		
		var_01.Display();
		var_02.Display();
		
		

	}

}

package static_;
/*If we apply a static keyword with any method, it is known as a static method.

  1) A static method belongs to the class rather than the object of a class.
  2) A static method can be invoked without the need for creating an instance of a class.
  3) A static method can access static data members and can change their value of it.*/

public class Method {
	
	static String college ="J D COllege of Engineering";
     String name;
     int rollNo;
     
     static void changeName ()
     {
    	 college = "Prerna Junior College";
    	 
     }
     
     Method(String name,int rollNo )
     {
    	 this.name = name;
    	 this.rollNo = rollNo;
     }
     
     public void display()
     {
    	 System.out.println("Name : "+name+" "+"Roll No : "+rollNo+" "+"College : "+college);
     }
     
	public static void main(String[] args) 
	{
	
		changeName();
		
		new Method("Sapna", 70).display();
	    new Method("Manda", 20).display();
	}

}

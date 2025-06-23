package java_concept;

public class AbstractionExecution {

	public static  void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractionSubClass subClassObject = new AbstractionSubClass();
		System.out.println("full name-->"+subClassObject.fname+" "+subClassObject.lname);
		System.out.println("Email-->"+subClassObject.email);
		System.out.println("Age-->"+subClassObject.age);
		System.out.println("Pass Year -->"+subClassObject.passYear);
		System.out.println("grade-->"+subClassObject.grade +"\n");
		subClassObject.speed();
		
	
	}

}

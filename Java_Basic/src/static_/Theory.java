package static_;

public class Theory 
{
	/*The static keyword in Java is a non-access modifier used for memory management, 
	primarily. It signifies that a member (variable, method, block, or nested class) 
	belongs to the class itself rather than to any specific instance of the class. 
	Only one copy of a static member exists, regardless of how many objects of the class are created. */
	
	/*Characteristics of static Keyword
	
	1) Belongs to the Class, Not the Object: Anything marked as static is tied to the class itself, 
		not individual objects. It means all objects share the same static variables and methods.
		
	2) Access Without an Object: Since static members belong to the class, 
		you can access them directly using the class name (ClassName.methodName()). No need to create an object.
		
	3) Static Methods Cannot Use Instance Variables Directly: A static method does not know about specific objects,
	 	so it cannot directly access non-static (instance) variables or methods.
	 	
	4) Main Method is Static: The main method in Java is static so that 
		Java can run the program without creating an object first.
		
	5) Executed Once When the Class is Loaded: A static block runs once
	 	when the class is first loaded, making it useful for initializing things like constants.
	 	
	6) Not Overridden Like Normal Methods: Static methods do not follow typical method overriding. 
		If a subclass defines the same static method, it's more like re-declaring it rather than overriding it.*/
	

}

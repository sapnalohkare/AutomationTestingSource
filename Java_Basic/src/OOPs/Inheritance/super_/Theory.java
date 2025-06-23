package OOPs.Inheritance.super_;

public class Theory 
{
   /* 1. Use of super with Variables-overridden or defined variable
	*
	* 2. Use of super with Methods -overridden or defined method
	*
	* 3. Use of super with Constructors - to call immediate super class constructor
	*
	*
	*/
	
	
	/*
	 * -------Characteristics of Super Keyword in Java-------
	 *		The characteristics of the super keyword are listed below:

			1)Calling the Parent Class Constructor: When we create an object of the subclass, 
			its constructor needs to call the constructor of the parent class. 
			This can be done with the help of the super keyword, and it calls the constructor of the parent class.
			
			2)Accessing Parent Class Methods: If the subclass wants to access the methods of the parent class, 
			it can also be done with the help of the super keyword.
			
			3)Accessing Parent Class Fields: Fields from the parent class 
			can also be accessed using the super keyword in the subclass.
			
			3)First Statement in a Constructor: When calling a superclass constructor, 
			 the super() statement must be the first statement in the constructor of the subclass.
			 This ensures that the parent class is properly initialized before the subclass does anything else.
			  
			4)Cannot be used in Static Context: We cannot use super in a static variable, 
			static method and static block.

			5)Not Always Required: We know that the super keyword is used to call the methods from the parent class. 
			If a method is not overridden in the subclass, then calling it without the super keyword will invoke 
			the parent class’s implementation.
			
				-----*Note: The super keyword is a powerful tool. It allows subclasses to inherit the behavior 
					and functionality of the parent class.*-------
	 */

}

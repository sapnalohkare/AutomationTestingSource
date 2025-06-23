package this_;

public class A_Theory
{
	/*Usage of Java this keyword
	1) this can be used to refer current class instance variable.
	2) this can be used to invoke current class method (implicitly)
	3) this() can be used to invoke current class constructor.
	4) this can be passed as an argument in the method call.
	5) this can be passed as argument in the constructor call.
	6) this can be used to return the current class instance from the method.*/
	
	
	
	
	/*
	 * Represents the Current Object: Think of this as a way for an object to refer to itself. If an object is calling a method, this points to that specific instance.
	
	*Helps Avoid Confusion: If a method parameter has the same name as an instance variable, this makes it clear which one is the instance variable.
	
	*Calls Other Methods in the Same Class: We don't always need this, but we can use it explicitly to call another method within the same class.
	
	*Supports Constructor Chaining: this() can be used inside a constructor to call another constructor in the same class, helping reuse code.
	
	*Passes the Current Object as an Argument: Sometimes, we need to send the current object to another method or class. This makes that possible.
	
	*Returns the Current Object: A method can return this, allowing method chaining, which is common in fluent APIs.*/

}

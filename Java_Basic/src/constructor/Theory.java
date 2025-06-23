package constructor;

public class Theory {
	/*
	 * A Constructor in Java is a block of codes like the method. It is called when
	 * an instance of the class is created. At the time of calling constructor,
	 * memory for the object is allocated in the memory. It is a special type of
	 * method which is used to initialize the object.
	 */

	/*
	 * If there is no constructor available in the class. In such case, Java
	 * compiler provides a default constructor by default.
	 * 
	 * 
	 *------- constructor type---
	 * 1) default constructor
	 * 2) no-arg constructor
	 * 3) parameterized constructor.
	 * 
	 * ----Rules for Creating Java Constructor---
	 *	1)Constructor name must be the same as its class name.
	 *	2)A Constructor must have no explicit return type.
	 *	3)A Java constructor cannot be abstract, static, final, and synchronized
	 *  4)A constructor may be private, protected, public or default
	 * 
	 * 
	 */

	/*
	 * constructor note : Class A extends class B Extends class C
	 * 
	 * rule: 1 1)JVM call default C constructor then B constructor then A
	 * constructor 2)If C has User defined constructor and B and A is not having
	 * constructor then that will call 3)If B has user defined constructor and A and
	 * C does not have then B class constructor will be called 4)If A has user
	 * defined constructor and B and C does not have then B class constructor will
	 * be called
	 * 
	 * Rule 2)
	 * 
	 * 1) If C has parameterize constructor then Class B need to call C class
	 * constructor and pass the value . B class constructor may user defined or
	 * parameterize while calling C class parameterize constructor
	 * 
	 * 2) If B has parameterize constructor then Class A need to call B class
	 * constructor and pass the value . A class constructor may user defined or
	 * parameterize while calling B class parameterize constructor
	 * 
	 * rule 3) 1)this use to call current class constructor 2)super is used to call
	 * immediate parent class constructor. 4)in this case if you use A(){Super()}
	 * ..all super class constructor will be called by default...
	 */

}

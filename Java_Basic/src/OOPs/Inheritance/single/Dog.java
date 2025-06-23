package OOPs.Inheritance.single;

public class Dog extends Animal
{
	void bark(){System.out.println("barking...");}  
	
	
	public static void main(String[] args) 
	{
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

	}

}

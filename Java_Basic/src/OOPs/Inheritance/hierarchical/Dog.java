package OOPs.Inheritance.hierarchical;

public class Dog extends Animal
{
	String dog = "Dog";
	void bark(){System.out.println("barking...");} 
	
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		System.out.println(dog.animal +" is "+dog.dog);
		dog.eat();
		dog.bark();
	}
}

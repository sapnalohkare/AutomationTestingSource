package OOPs.Inheritance.multiple;

//multilevel inheritance
public class Dog implements Animal, Features
{

	public static void main(String[] args) 
	{
		Animal animal = new Dog();
		animal.eat();
		animal.sleep();
		
		//animal.age = 4;
		//System.out.println(animal.age);
		
		Features features = new Dog();
		features.setName();
		features.setSound();

	}

	@Override
	public void setName() 
	{
		System.out.println("Dog name : -> Dolly");
		
		
		
	}

	@Override
	public void setSound() {
		
		System.out.println("sound :-> "
				+ "Bark..");
	}

	@Override
	public void eat() {
		System.out.println("eating pedigree..");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("sleeping in night...");
	}

}

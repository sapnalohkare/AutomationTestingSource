package OOPs.Inheritance.hierarchical;

public class Cat extends Animal
{
	String cat = "Cat";
	
	void meow(){System.out.println("meowing...");} 
	
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		System.out.println(cat.animal +" is "+cat.cat);
		cat.eat();
		cat.meow();
	}
}

package homework;

public class Cat extends Animal {

	public static void main(String[] args) 
	{
		Cat cat_object = new Cat();
		cat_object.eat();

	}

}



class Animal 
{
	void eat(){System.out.println("eating...");}  
}
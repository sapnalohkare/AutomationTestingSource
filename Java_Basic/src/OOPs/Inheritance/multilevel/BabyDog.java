package OOPs.Inheritance.multilevel;

public class BabyDog extends Dog
{
	void weep(){System.out.println("weeping...");}  
	
	public static void main(String[] args) {
		
		BabyDog babyDog = new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.weep();
	}

}

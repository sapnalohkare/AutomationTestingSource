package modifier.Access_modifiers.Default;

//An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class
//An interface in Java is a blueprint of a behavior
//A Java interface contains static constants and abstract methods.
//achieved 100% abstraction


//default Interface is accessible : with class : outside class  : within package

 interface Default_Interface
 {
	 public static final int age = 5;
	 
	// Abstract methods defined
	   void changeGear(int a);
	   void speedUp(int a);
	   void applyBrakes(int a);

}

 class Demo implements Default_Interface
 {

	@Override
	public void changeGear(int a) {
		System.out.println("  change Grear");
	}

	@Override
	public void speedUp(int a) {
		System.out.println("  speed Up ");
		
	}

	@Override
	public void applyBrakes(int a) {
		System.out.println("  apply Brakes ");
		
	}
	 
	 public static void main(String[] args) 
	 {
		System.out.println(age);
	   new Demo().applyBrakes(50);
	   new Demo().speedUp(40);
	   new Demo().changeGear(70);
		
	}
	 
 }
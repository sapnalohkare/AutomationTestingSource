package OOPs.Inheritance.super_;

/*------Usage of super Keyword-----
*1)super can be used to refer to the immediate parent class instance variable.
*2)super can be used to invoke the immediate parent class method.
*3)super() can be used to invoke the immediate parent class constructor.
*/
public class Soldier extends Warrior {
	
	Soldier() 
	{
		super(56, "W- Eva");
		System.out.println("Soldier class construtor..");
	}

	String name = "Soldier";
	int age = 56;

	
		

	public void attack() {

		System.out.println("Soldier attacks....");
	}

	public void Use() {

		System.out.println("Soldier uses explosives to attacks....");
	}

	public static void main(String[] args) {
		System.out.println("<-----1) super() can be used to invoke the immediate parent class constructor------>");
		Soldier Soldier_Object = new Soldier();

		System.out.println();
		
		
		System.out.println("----2) super is used to refer immediate parent class instance variable which is hidden bcz of same name .----");
		Soldier_Object.PrintVariable();
		
		System.out.println("<-----3) super can be used to invoke the immediate parent class method.------>");
		Soldier_Object.invokeMethods();

	}

	private void invokeMethods() 
	{
		this.attack();//current class attack method can't access attack method  warrior class
		super.attack();//now we can access same name method of parent class which was hidden..
		Use();
		Strength();
	}

	private void PrintVariable() {
		// not able to access name variable of parent class but with super keyword we
		// can..
		System.out.println("name : " + this.name + " , " + "age :" + this.age + " , "+" Protection Used : " + this.protection
			+" , "	+ " name : " + super.name);

	}
	
	

}

class Warrior {

	String name = "Warrior";
	String protection = "Bullet Proof Jacket";

	Warrior(int a ,String name)
	{
		
		System.out.println("Warrior user define constructor.. "+a+" : "+name);
	}

	public void attack() {

		System.out.println("Warrior attacks....");
	}

	public void Strength() {
		System.out.println("Warrior has strength....");
	}
}
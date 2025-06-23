package static_;

/*1) it is used to initialize the static data member.
  2) It is executed before the main() method at the time of class loading.*/

public class Block 
{
	static String name;
	static int age;
	static
	{
		name ="sapna";
		age = 32;
	}

	public void display()
	{
		System.out.println("name : "+name+" "+"age : "+age);
	}
	public static void main(String[] args) {
		
		Block b_Obj = new Block();
		b_Obj.display();

	}

}

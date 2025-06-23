package bhavika_homework;


//child class
public class Abs_Name2 extends Abs_Name {
	int a = 90;

	public void Instance() {
		System.out.println(this.a);
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		Abs_Name2 r = new Abs_Name2();

		r.Username();
		r.Statement();
		summary();
		r.Instance();

	}

	@Override
	public void Username() {
		this.accountDetails();
		this.Passsword();
		System.out.println("enter your username");

	}

	@Override
	public void Passsword() {
		System.out.println("enter 8 digit password");

	}

	@Override
	public void accountDetails() {

		System.out.println("enter account credentials");
	}

}

 abstract class Abs_Name {

	public abstract void Username();

	public abstract void Passsword();

	public abstract void accountDetails();

	public void Statement() {
		System.out.println("account statement from the sbi account");
	}

	public static void summary() {
		System.out.println("account summary from sbi account");
	}

	

}

//parent class A
 abstract class A_class extends B_class {

	public abstract void Login();

	public abstract void Credentials();

	public void failed() {
		System.out.println("check failed account ");
	}
	public static void passed() {
		System.out.println("check passed details");
	}
	public A_class(int a, int b) {
		System.out.println("parameterized constructor from parent calss A");
	}

	

}

//parent class b
 abstract class B_class {
	
	public abstract void logout();
	
	
	
	public void failed() {
		System.out.println("loggin using logout button");
	}
	public static void Menu() {
		System.out.println("check logout or not");
	}

	

}

//child class c

 class C_Child_class extends A_class{
	public C_Child_class() {
		
		super(23,45);
		super.failed();
		System.out.println("parametrized constructor from child class");
	}

	public static void main(String[] args) {
		C_Child_class r=new C_Child_class();
		r.Login();
		r.failed();
		Menu();
		

	}

	@Override
	public void Login() {
		passed();
		this.logout();
		this.Credentials();
		System.out.println("login succesfull");
		
	}

	@Override
	public void Credentials() {
		System.out.println("credentials are valid");
		
	}

	@Override
	public void logout() {
		System.out.println("logout successfull");
		
	}

}


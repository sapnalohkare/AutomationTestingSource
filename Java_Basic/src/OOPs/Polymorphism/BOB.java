package OOPs.Polymorphism;

public class BOB extends Bank 
{
	
// method Overriding
public void open() {
	System.out.println("BOB Account Opened..");
}

// if try to write same open method then its compile time error -compile time Polymorphism-  
public void open(String joint) {
	System.out.println("BOB "+joint+" opened..");
}

public void close() {
	System.out.println("BOB Account closed..");
}

public void deposite() {
	System.out.println("BOB Amount deposited..");
}

public void withdraw() {
	System.out.println("BOB Amount withdrawal..");
}

public void transfer() {
	System.out.println("BOB Amount transfered..");
}


}

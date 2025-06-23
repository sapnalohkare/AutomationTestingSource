package this_;

//1. Using ‘this’ keyword to refer to current class instance variables
public class Usage_1 {

	int a;
	int b;

	Usage_1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		// Displaying value of variables a and b
		System.out.println("a = " + a + "  b = " + b);
	}

	public static void main(String[] args) {
		Usage_1 object = new Usage_1(10, 40);
		object.display();

	}

}

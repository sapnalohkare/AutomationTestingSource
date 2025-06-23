package OOPs.Abstraction;

public class Circle extends Shape_Syntax{

	public static void main(String[] args) 
	{
		Shape_Syntax circle_Object = new Circle();
		circle_Object.display();
		Circle.print();
		System.out.println(circle_Object.area());
		System.out.println(circle_Object.calculate());
		circle_Object.shape();

		
		System.out.println(circle_Object.age+" "+circle_Object.name);
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public void shape() {
		
		System.out.println("Shape method...");
	}

	@Override
	public int calculate() 
	{
		int  l = 50;
	    int b = 30;
	    int c=70;
		return (l+b+c);
	}

}

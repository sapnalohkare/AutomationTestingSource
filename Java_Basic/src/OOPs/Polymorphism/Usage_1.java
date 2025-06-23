package OOPs.Polymorphism;

public class Usage_1 {

	public static void main(String[] args) {
		
		Usage_1 object = new Usage_1();
		/*System.out.println("byte return method resulet : "+object.multiply(10 , 40));
		System.out.println("short return method resulet : "+object.multiply(30, 10, 10));
		System.out.println("int return method resulet : "+object.multiply(10 , 40));
		System.out.println("long return method resulet : "+object.multiply(10 , 40));
		System.out.println("float return method resulet : "+object.multiply(10 , 40));
		System.out.println("double return method resulet : "+object.multiply(10 , 40));*/
		
	}
	
	public byte multiply(byte a , byte b)
	{
		return (byte) (a*b);
	}
	public short multiply(short a , short b, short c)
	{
		return (short) (a*b*c);
	}
	public int multiply(int a , int b)
	{
		return a*b;
	}
	public long multiply(long a , long b)
	{
		return a*b;
	}
	public float multiply(float a , float b)
	{
		return a*b;
	}
	public double multiply(double a , double b)
	{
		return a*b;
	}
}

package java_concept;

public class Method_Overloading {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10, 20, 30, 40));
		
		int a = add(10, 20);
		int b = add(10, 20, 30);
		int c = add(10, 20, 30, 40);
		System.out.println (a +" "+b+" "+c);

	}
	
	static int add(int a , int b)
	{
		return a+b;
		
	}
	static int add(int a , int b,int c)
	{
		return a+b+c;
		
	}
	static int add(int a , int b , int c, int d)
	{
		return a+b+c+d;
		
	}

}

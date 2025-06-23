package exception.Throw;

public class CustomeException {

	public static void main(String[] args) {
		int age = 15;
				
				if (age < 18)
				{
					throw new ArithmeticException("age acnt be less than 18");
					
				} else
				{
                      System.out.println("age is greater...");
				}

	}

}

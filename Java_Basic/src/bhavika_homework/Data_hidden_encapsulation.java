package bhavika_homework;

public class Data_hidden_encapsulation { /*
											 * private int otp=3456;
											 * 
											 * private void Mobile_Number(int a) { otp=a;
											 * System.out.println("enter registered mobile number: "+otp); }
											 * 
											 * public static void main(String[] args) { Data_hidden_encapsulation r= new
											 * Data_hidden_encapsulation(); r.Mobile_Number(1234); }
											 */

	private String s = "otp no is 3457";

	private void Login(String b) {
		s = b;

		System.out.println("entere otp after login:" + s);
	}

	public static void main(String[] args) {
		Data_hidden_encapsulation v = new Data_hidden_encapsulation();
		v.Login("flipcart");
	}

}

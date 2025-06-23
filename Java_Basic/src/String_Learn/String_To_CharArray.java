package String_Learn;

public class String_To_CharArray {

	public static void main(String[] args) {

		String testing = "Automation";

		char charArray[] = testing.toCharArray();

		// forward
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);

		}
         
		System.out.println("---------Reverse-------------");
		
		// Reverse
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.println(charArray[i]);

		}

	}

}

package String_Learn;

public class Split_method {

	public static void main(String[] args) {
		
		
		System.out.println("-----------seperated by space--------------");
		String name ="Automation uses for code resuability";
		
		String[] strArr = name.split(" ");
		
        //access element
		for (int i = 0; i < strArr.length; i++) 
		{
			System.out.println("strArr"+"["+i+"] : "+strArr[i]);
			
		}

		
		System.out.println("-------------seperated by s-----------------");
		String str ="arohi s agranya s";
		String[] strArr_01 = str.split("s");
		
		for (int i = 0; i < strArr_01.length; i++) {
			System.out.println("strArr_01"+"["+i+"] : "+strArr_01[i]);
		}
		
		
		
	}

}

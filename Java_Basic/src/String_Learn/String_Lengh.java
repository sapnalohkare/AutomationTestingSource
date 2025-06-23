package String_Learn;

public class String_Lengh {

	public static void main(String[] args) {
		String name = "sapna";
		String lname = new String("lohkare");
		
		
		
		name = name +""+lname;//concate
		lname = lname.concat(" last name");//2nd concate
        
		System.out.println(name);
		System.out.println(name.length());
		
		System.out.println(lname);
		System.out.println(lname.length());
	}

}

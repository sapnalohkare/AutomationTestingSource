package String_Learn;

public class String_Traverse_02 {

	public static void main(String[] args) {

    String technique = "Automation";
    
    System.out.println("-----------Forward direction-------------");
    
    for (int i = 0; i < technique.length(); i++) 
    {
    	System.out.println(technique.charAt(i));
		
	}
    
    System.out.println("-----------Reverse direction-------------");
    
    for (int i = technique.length()-1; i >= 0; i--) 
    {
    	System.out.println(technique.charAt(i));
		
	}

	}

}

package java_String.Methods;

public class Split {

	public static void main(String[] args)
	{

		
		String s= "My project is Healthcare";
		
		String[] strArr = s.split("a");
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		//System.out.println(strArr[3]);
 
		
		System.out.println("--------------splits words of string-------");
		
		String[] strAr = s.split(" ");
		System.out.println(strAr.toString());
		/*System.out.println(strAr[0]);
		System.out.println(strAr[1]);
		System.out.println(strAr[2]);
		System.out.println(strAr[3]);*/

	}

}

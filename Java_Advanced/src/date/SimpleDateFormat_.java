package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_ {

	public static void main(String[] args) {
		
		// dd-MM-yyyy
	
		Date date = new Date();
		//System.out.println(date.toString());

		SimpleDateFormat simple_Date = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("dd-MM-yyyy formate date : " +simple_Date.format(date));
		
		

		/*----output-----
		 * 
		 * 15-05-2025
		 * 
		 * 
		 * */

	}

}

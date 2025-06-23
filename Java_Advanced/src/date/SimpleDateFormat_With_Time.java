package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_With_Time {

	public static void main(String[] args) 
	{
		
		// dd-MM-yyyy  hh:mm:ss
		Date date = new Date();
		//System.out.println(date.toString());
		
		SimpleDateFormat simple_Date_01 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		System.out.println(simple_Date_01.format(date));
		
		/*----output-----
		 * 
		 * 15-05-2025 08:08:15
		 * 
		 * 
		 * */

	}

}

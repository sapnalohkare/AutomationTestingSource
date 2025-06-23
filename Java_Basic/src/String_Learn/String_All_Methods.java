package String_Learn;

public class String_All_Methods {

	public static void main(String[] args) {
		String company = "Creo Invent";
		String f_Name = "";
		String l_Name = "Lohk";

		String s_Name = "Lohk";
		String d_Name = "LOHK";
		
	   
		/************** to check blank or empty string ***********************/
		// Checks whether a string is empty or not
		System.out.println("Empty Method Result-->" + company.isEmpty());// false

		// blank method
		System.out.println("Blank Method Result-->" + f_Name.isBlank());// true

		//Returns the character at the specified index (position)
		System.out.println("charAt Method Result-->" + company.charAt(3));
		
		//Returns the Unicode of the character at the specified index
		System.out.println("codePointAt Method Result-->" + company.codePointAt(0));
		
		//Returns the Unicode of the character before the specified index
		System.out.println("codePointBefore Method Result-->" + company.codePointBefore(1)); 
		
		//Returns the number of Unicode values found in a string.
		System.out.println("codePointCount Method Result-->" + l_Name.codePointCount(0, 4));
		
		//Compares two strings lexicographically
		System.out.println("compareTo Method Result-->" + l_Name.compareTo(s_Name));

		// Compares two strings lexicographically, ignoring case differences
		System.out.println("compareToIgnoreCase Method Result-->" + l_Name.compareToIgnoreCase(d_Name));
		
		//Appends a string to the end of another string
		System.out.println("concat() Method Result-->" + company.concat(l_Name));
		
		//Checks whether a string contains a sequence of characters
		System.out.println("contains() Method Result-->" + company.contains("Creo"));
        
		//Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
		System.out.println("contentEquals() Method Result-->" + l_Name.contentEquals(s_Name));
		char[] myStr1 = { 'H', 'e', 'l', 'l', 'o' };
		String myStr2 = "";
		myStr2 = String.copyValueOf(myStr1, 0, 5);

		// copy an array string and return in second array
		System.out.println("copyValueOf() Method Result-->" + myStr2);

		//Checks whether a string ends with the specified character(s)
		System.out.println("endsWith() Method Result-->" + company.endsWith("nt"));
		
		// Compares two strings. Returns true if the strings are equal, and false if not
		System.out.println("equals() Method Result-->" + l_Name.equals(s_Name));

		l_Name = "SAPNA";
		s_Name = "sapna";

		String format = "SAPNA %s! , %d";

		// Compares two strings, ignoring case considerations
		System.out.println("equalsIgnoreCase() Method Result-->" + l_Name.equalsIgnoreCase(s_Name));

		// Returns a formatted string using the specified locale, format string, and
		// arguments
		System.out.println("format() Method Result-->" + String.format(format, "LOHKARE", 1024));

		
		String myStr = "Wow";
		byte[] ans = myStr.getBytes();
		
		//	Converts a string into an array of bytes
		System.out.println("getBytes() Method Result-->" + ans[0]);
		
		
		//Copies characters from a string to an array of chars
		String OldLine = new String("Welcome to Texas.");
		char[] NewLine = new char[5];
		
		OldLine.getChars(11, 16, NewLine, 0);
		 
		//System.out.println(NewLine);
		
		System.out.println("getChars() Method Result--> Texas");
		
		//Returns the hash code of a string
		System.out.println("hashCode() Method Result-->" + l_Name.hashCode());
		
		//Returns the position of the first found occurrence of specified characters in a string
		System.out.println("indexOf() Method Result-->" + OldLine.indexOf("T"));
		
		//Joins one or more strings with a specified separator
		String fruits = String.join(" ", "Orange", "Apple", "Mango");
		System.out.println("join() Method Result-->" + fruits);
		
		//Returns the position of the last found occurrence of specified characters in a string
	    String b_name = "Hello planet earth, you are a great planet.";
	    System.out.println("lastIndexOf() Method Result-->"+b_name.lastIndexOf("planet"));
	    
	    
	   //Returns the length of a specified string
	    System.out.println("length() Method Result-->" + company.length());
		 
	    //Searches a string for a match against a regular expression, and returns the matches************
	    String regex = "cat|dog|fish";

	    System.out.println("matches() Method Result-->" + "cat".matches(regex));
	    
	    //Get an index from a string which is offset from another index by a number of code points:
	    System.out.println("offsetByCodePoints() Method Result-->" + myStr2.offsetByCodePoints(3, 2));

	    //Test if two string regions are equal:
	    String line = "Hello, World!";
	    String line2 = "New World";
	    System.out.println(line.regionMatches(7, line2, 4, 5));
	    System.out.println(line.regionMatches(0, line2, 0, 5));
	    
	    //Return a new string where all "l" characters are replaced with "p" characters
	    System.out.println("replace() Method Result-->" + myStr.replace('W', 'p'));
	    
	    //Replace every match of a regular expression with a substring:
		String catChange = "I love cats. Cats are very easy to love. Cats are very popular.";
		String string_change = "(?i)cat";
		System.out.println("replaceAll() Method Result-->" + catChange.replaceAll(string_change, "dog"));
		
	    
		//Replace the first match of a regular expression with a different substring:
		String institution = "This is  STP Infotech";
		System.out.println("replaceFirst() Method Result-->" + institution.replaceFirst("STP", "GROW"));
		
		//System.out.println("split() Method Result-->" + institution.split("STP"));
		
		//Returns a new string which is the substring of a specified string
		String cricketor = "SachinTedulkar";
		System.out.println("substring() Method Result-->" + cricketor.substring(6));
		System.out.println("substring() Method Result-->" + cricketor.substring(0, 6));
		
		//Find out if the string starts with the specified characters:
		System.out.println("startsWith() Method Result-->" + cricketor.startsWith("Sachin"));
		
		//Returns a new character sequence that is a subsequence of this sequence
		System.out.println("subSequence() Method Result-->" + cricketor.subSequence(6, 14));
		
		//Converts this string to a new character array
		char c_arr[] = cricketor.toCharArray();	
		System.out.println("toCharArray() Method Result-->");
		for (char c : c_arr)
		{
			System.out.println(c);
		}
		
		//Converts a string to lower case letters
		String up_String = "SHAHMEER";
		System.out.println("toLowerCase() Method Result-->" + up_String.toLowerCase());
		
		
		String l_String = "shahmeer";
		//Converts a string to upper case letters
		System.out.println("toUpperCase() Method Result-->" + l_String.toUpperCase());
		
		
		//Returns the value of a String object
		System.out.println("toString() Method Result-->" + up_String.toString());
		
	 
		//removes space
		String t_String = "        automation          ";
		System.out.println("trim()() Method Result-->" + t_String.trim());
       
		//return a string representation of different data types:
		System.out.println("valueOf() Method Result-->" + String.valueOf(t_String));
		char[] myArray = {'a', 'b', 'c'};
		System.out.println(String.valueOf(myArray));
		System.out.println(String.valueOf('A'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(4.5f));
		System.out.println(String.valueOf(5.2));
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf(1400L));
		
		
		//split method
		
		
		
	

	}}

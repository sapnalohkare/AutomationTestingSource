package java_concept;

public class Strings
{
   public static void main(String[] args) 
  {
	   String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   System.out.println("The length of the txt string is: " + txt.length()); 
	   
	   String txt_hello = "Hello World";
	   System.out.println(txt_hello.toUpperCase());   // Outputs "HELLO WORLD"
	   System.out.println(txt_hello.toLowerCase());   // Outputs "hello world"
	   System.out.println(txt_hello.indexOf("World")); //output is 6
  }
}

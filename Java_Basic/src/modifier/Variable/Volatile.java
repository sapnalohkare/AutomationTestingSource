package modifier.Variable;

/*The volatile keyword is a modifier that ensures that an attribute's 
value is always the same when read from all threads.*/

/*Ordinarily the value of an attribute may be written into a thread's local cache and not updated in
 * the main memory for some amount of time. In this case, other threads will see a different value for the attribute. 
 * The volatile keyword makes sure that threads always update the value of an attribute in main memory.
 * 
 */

public class Volatile 
{
	private static volatile int MY_INT = 0;
		  
	public void change()
		{
			MY_INT = 7;
			System.out.println(MY_INT);
		}
	public static void main(String[] args) {
		
		Volatile Vobject = new Volatile();
		Vobject.change();
	}

}

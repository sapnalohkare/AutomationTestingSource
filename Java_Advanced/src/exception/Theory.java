package exception;

// Thread.sleep(890) --> Interrupted exception
public class Theory
{
 /*In Java, an exception is an event that occurs 
 during the execution of a program that disrupts the normal flow of instructions*/

/*Advantage of Exception Handling : to maintain the normal flow of the application. */
	
 /*Exception Handling?
  * Exception Handling is a mechanism to handle runtime errors such as
  * ClassNotFoundException, IOException, SQLException, RemoteException, etc.
  * 
  * */                        /* Object --> (Root class)
	
								Throwable --> (Root class of Exception)
								
				Exception								Error				
	             										
	             1) (Checked/Compile time)				1)StackOverFlowError			
	              		1) IOException					2)virtualMachineError
	              		2) SQL Exception				3)OutOfMemoryError
	              		3) ClassNotfoundException
	
				 2) (Unchecked /Runtime)
						1)ArithmaticException
						2)NullPointerException
						3)NumberFormatException
						4)IndexOutOfBoundException
							1)ArrayIndexOutOfBoundException
							2)StringIndexOutOfBoundException*/
}

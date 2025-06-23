package control_statements.Decision_Making_if_statment;

public class else_ {

	public static void main(String[] args) {
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		/***********real life example****************/
		int doorCode = 1337;

		if (doorCode == 1337) {
		  System.out.println("Correct code. The door is now open.");
		} else {
		  System.out.println("Wrong code. The door remains closed.");
		}

       /************************voting********************/
		int myAge = 25;
		int votingAge = 18;

		if (myAge >= votingAge) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}
		
		 /************************even/odd********************/
		int myNum = 5;

		if (myNum % 2 == 0) {
		  System.out.println(myNum + " is even");
		} else {
		  System.out.println(myNum + " is odd");
		}
	}

}

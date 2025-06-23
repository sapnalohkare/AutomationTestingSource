package bhavika_homework;

public class Continue_Statement
{
	public static void main(String[] args) {
		// continue statement is used to skip the specific value from the execution.
		// 1 to 10 number
		System.out.println("------continue statement using for loop - 1 to 10 numbers--------");
		for (int a = 1; a <= 10; a++) {
			if (a == 6) {
				continue;
			}
			System.out.print(a+" ");

		}
		System.out.println();
		System.out.println("------continue statement using for loop - 10 to 1 numbers--------");
		for(int b=10;b>=1;b--) {
			if(b==8) {
				continue;
			}
			System.out.print(b+" ");
		}
		
		System.out.println();
		System.out.println("------continue statement using for loop --------");
		for(int c=1;c<=10;c++) {
			if(c==5) {
				continue;
			}
			System.out.println("continue statemnt used to skip the value of execution: "+c);
		}
		System.out.println();
		System.out.println("------continue statement using while  loop --------");
		
		int d=0;
		while(d<=10) {
			d++;
			if(d==6) {
				continue;
			}
			System.out.print(d+" ");
			//d++;
		}
		
		System.out.println();
		System.out.println("------continue statement using while  loop -10 to 1 numbers--------");
		int e=11;
		while(e>=1) {
			e--;
			if(e==4){
				continue;
			}
			System.out.print(e+" ");
		}
		
		System.out.println();
		System.out.println("------continue statement using while  loop --------");
		int f=0;
		while(f<=10) {
			f++;
			if(f==7) {
				continue;
			}
			System.out.println("Conitinue statement using while loop");
			
		}
		
		System.out.println();
		System.out.println("------continue statement using do-while  loop --------");
		
		int i=0;
		do {
			i++;
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		
		}while(i<=10);
		
		System.out.println();
		System.out.println("------continue statement using do-while  loop --------");
		int j=11;
		do {
			j--;
			if(j==4) {
				continue;
			}
			System.out.print(j+" ");
		}while(j>=1);

	}


}

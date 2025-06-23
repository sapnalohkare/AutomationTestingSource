package bhavika_homework;

public class Break_Statement 
{
	public static void main(String[] args) {
		// break statement used to stop the current flow of execution .
		// 1 to 10 number
		System.out.println("-----break statement using for loop upto 1 to 10 numbers----------");
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
			if (a == 6) {
				break;
			}
		}
		System.out.println();
		System.out.println("-----break statement using for loop upto 10 to 1 numbers----------");
		// 10 to 1 number
		for (int b = 10; b >= 1; b--) {
			System.out.print(b + " ");
			if (b == 4) {
				break;
			}
		}
		System.out.println();

		System.out.println("-----break statement using for loop for string----------");
		// print the Automation is used test web application using automated tools.
		for (int c = 1; c <= 10; c++) {
			System.out.println("Automation process is used to test web application using automated tools.");
			if (c == 5) {
				break;
			}
		}

		System.out.println();
		System.out.println("-----break statement using for loop for reverse string----------");
		for (int d = 10; d >= 1; d--) {
			System.out.println("Automation process is used to test web application using automated tools.");
			if (d == 7) {
				break;
			}
		}

		System.out.println();
		System.out.println("-----break statement using for while loop upto 1 to 10 numbers----------");

		int e = 1;
		while (e <= 10) {

			System.out.println(e);
			if (e == 5) {
				break;
			}
			e++;
		}
		System.out.println();
		System.out.println("-----break statement using for while loop upto 10 to 1 numbers----------");
		int f = 10;
		while (f >= 1) {
			System.out.println(f);
			if (f == 6) {
				break;
			}
			f--;
		}

		System.out.println();
		System.out.println("-----break statement using for while loop printing string----------");
		int g = 1;
		while (g <= 10) {
			System.out.println("break statement is used to stop the current flow of execution");
			if (g == 5) {
				break;
			}
			g++;
		}
		System.out.println();
		System.out.println("-----break statement using for while loop ----------");

		int h = 1;
		while (h <= 20) {
			System.out.println(h += 1);
			if (h == 10) {
				break;
			}
			h++;
		}
		System.out.println();
		System.out.println("-----break statement using for do-while loop ----------");
		int i = 1;
		do {
			System.out.print(i + " ");
			if (i == 8) {
				break;
			}

			i++;

		} while (i <= 10);
		
		System.out.println();
		System.out.println("-----break statement using for do-while loop---10 to 1 numbers ----------");
		
		int j=10;
		do {
			System.out.print(j+" ");
			if(j==6) {
				break;
			}
			j--;
		}while(j>=1);
		
		System.out.println();
		System.out.println("-----break statement using for do-while loop ----------");
		int k=1;
		do {
			System.out.println("break statement using do-while loop");
			if(k==4) {
				break;
			}
			k++;
		}while(k<=10);

	}


}

package bhavika_homework;

public class While_loop 
{
public static void main(String[] args) {
		
		System.out.println("************************ While Loop ******************");
		System.out.println("---------------------- print numbers from 1 to 10 ------------------");
		int a =1;
		
		while (a<=10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		System.out.println("---------------------- print Even numbers from 1 to 10 ------------------");
		int b =1;
		
		while (b<=10) {
			if (b%2==0) {
				System.out.print(b+ " ");	
			}   b++;
			}
		System.out.println();
		System.out.println("---------------------- print Odd numbers from 1 to 10 ------------------");
		int c =1;
		
		while (c<=10) {
			if (c%2==1) {
				System.out.print(c+" ");	
			}   c++;
			}
		
		System.out.println();
		System.out.println("---------------------- print Table of 5 ------------------");
		int d =1;
		
		while (d<=10) {
				System.out.print(5*d+" ");	
			 d++;
			}
		
		System.out.println();
		System.out.println("---------------------- print Table of 5 in 5*1=5 format------------------");
		int e =1;
		
		while (e<=10) {
				System.out.println("5 * "+e+" = "+5*e);	
			 e++;
			}
		
		System.out.println();
		System.out.println("---------------------- print Sandip 5 times ------------------");
		int f =1;
		
		while (f<=5) {
				System.out.println("Sandip");	
			 f++;
			}
		System.out.println("---------------------------------------------------------");
		System.out.println("************************ Do While Loop ******************");
		System.out.println("---------------------------------------------------------");
		
		
		System.out.println("---------------------- print numbers from 1 to 10 ------------------");
		int g =1;
		
		do{
			System.out.print(g+ " ");
			g++;
		} while (g<=10);
		
		System.out.println();
		System.out.println("---------------------- print Even numbers from 1 to 10 ------------------");
		int h =1;
		
		do {
			if(h%2==0){
				System.out.print(h+ " ");
			} h++;
		}while(h<=10);
		
		System.out.println();
		System.out.println("---------------------- print ODD numbers from 1 to 10 ------------------");
		int i =1;
		
		do {
			if(i%2==1){
				System.out.print(i+ " ");
			} i++;
		}while(i<=10);
		
		System.out.println();
		System.out.println("---------------------- print Table of 4 ------------------");
		int j =1;
		
		do {
				System.out.println(4*j);
			j++;
		}while (j<=10);
		
		System.out.println();
		System.out.println("---------------------- print Table of 4 in 4*1=4 format------------------");
		int k =1;
		
		do {
			System.out.println("4 * "+k+" = "+ 4*k);
			k++;
		}while(k<=10);
		
		System.out.println();
		System.out.println("---------------------- print Palekar 5 times ------------------");
		int l =1;
		
		do {
			System.out.println("Palekar");
			l++;
		}while (l<=5);
		
		
		}
}

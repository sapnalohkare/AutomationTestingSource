package control_statements.Loop_statements_do_while_loop;

public class do_while_pratice {

	public static void main(String[] args) {
		
		
		//while - 1)atutomation 5 time 2)odd nunber way incre decremnet
		
		
		int a=1;
		do {
			//System.out.println(a);
			a++;
		} while (a<=10);

		
		int b = 10;
		
		do {
			//System.out.println(b);
			b--;
		} while (b >0);

		
		
		//even oddc%2!=0)
		int c=0;
		do {
			if(c%2==0)
				//System.out.println(c);
			{
				
			}
			c++;
		} while (c<=10);
		
		
		//even/odd(x*2+1)
		int x =0;
		do {
			System.out.println(x*2+1);
			x++;
		} while (x<=10);
	}

}

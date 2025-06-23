package control_statements.Loop_statements_for_loop;

public class For {

	public static void main(String[] args) {
		
		//int j =1; 5*1= 5
		
		int table_Num = 9;
		for (int d = 1; d<= 10; d++) {
			
			System.out.println(table_Num+"*"+d+" = "+(table_Num*d));
			  //System.out.println(5*d);
			
			}
		
		//even number
		for (int i = 1; i <=100; i++) {
			
			if(i%2==0)
			{
				//System.out.println(i);
			}
			
		}

		for (int i = 0; i <= 100; i = i + 2) {
			 // System.out.println(i);
			}
		
		//decrement
		for (int i = 10; i> 0; i--) {
			  //System.out.println(i);
			}
		
		//incre,decre,even,odd

	}

}

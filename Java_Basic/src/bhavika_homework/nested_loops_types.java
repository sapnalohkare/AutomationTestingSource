package bhavika_homework;

public class nested_loops_types {

	public static void main(String[] args) {
		
		
             // *
	//        * *
	//      * * *
	//    * * * * 
	//  * * * * *
	//* * * * * *
	//1 to 6 rows_outeer loop
	//1 to 6 columns_inner loop
	for(int a=1;a<=6;a++) {
		for(int b=1;b<=6-a;b++) {
			System.out.print("  ");
		}
		for(int c=1;c<=a;c++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	//using numbers
	for(int a=1;a<=6;a++) {
		for(int b=1;b<=6-a;b++) {
			System.out.print("  ");
		}
		for(int c=1;c<=a;c++) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	//1
			//0 1
			//1 0 1
			//0 1 0 1
			//1 0 1 0 1
			//0 1 0 1 0 1
			//1 to 6 rows----outer loop
			//1 to 6 columns for inner loop
			for(int a=1;a<=6;a++) {// 1 2 3 4 5
				for(int b=1;b<=a;b++) {//1 1 1 2 3 1 2 3 4 1
					if((a+b)%2==0) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
		
	
			//1
			//2   3
			//4   5  6
			//7   8  9 10
			//11 12 13 14 15
			//16 17 18 19 20 21
			//1 to 5---rows---outer loop
			//1 to 5 ----columns---inner loop
			int c=1;//1 2 3 4 5 
			for(int a=1;a<=6;a++) {//1 2 3 4 5
				for(int b=1;b<=a;b++) {//1  1 2 1 1 2 3
					System.out.print(c+"  ");
					c++;
				}
				System.out.println();
			}

			
			
			
			
			
			
			
		}

	
	
	}
	



	



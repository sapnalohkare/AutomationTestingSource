package collection.List;

import java.util.Arrays;
import java.util.List;

/*Parallel Stream is a feature introduced in Java 8 that allows programmers to perform 
 *data processing operations in a parallel and concurrent manner using the Stream API. 
 *In the Stream API, various operations such as filtering, mapping, 
 *and collecting can be performed on data elements in a linear (sequential) manner*/

public class ParallelStream {

	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// even number using parallel stream
		numberList.parallelStream().filter((n -> n % 2 == 0)).forEach((n) -> {
			System.out.println(n);
		});/* forEach(System.out::println) */

		// sum of squares using parallel stream
		int sumOfSquares = numberList.parallelStream().map(n -> n * n).reduce(0, Integer::sum);

		System.out.println("Sum of squares: " + sumOfSquares);

	}

}

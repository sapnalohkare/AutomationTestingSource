package collection.List;
/*A stream in Java is a sequence of objects that supports various methods
 *  that can be pipelined to produce the desired result. */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*Different Operations On Streams
There are two types of Operations in Streams:

	1) Intermediate Operations : map():,  filter(),sorted():, flatMap(),distinct(), peek():
	2) Terminal Operations : collect():,forEach(),forEach(),reduce():count(), findFirst():, allMatch():,anyMatch():
	
	*/




public class Stream_ {

	public static void main(String[] args) 
	{
		
		StreamIntermediateOperationsExample();
		System.out.println("--------------------------------------------------------Parttion--------------------------------------------");
		StreamTerminalOperationsExample();

	}

	private static void StreamTerminalOperationsExample() {
		// Sample data
        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        System.out.println("forEach:");
        names.stream().forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());
        System.out.println("\ncollect (names starting with 'S'):");
        sNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce(
            "",
            (partialString, element) -> partialString + " " + element
        );
        System.out.println("\nreduce (concatenated names):");
        System.out.println(concatenatedNames.trim());

        // count: Count the number of names
        long count = names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);

        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("\nfindFirst:");
        firstName.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(
            name -> name.startsWith("S")
        );
        System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(
            name -> name.startsWith("S")
        );
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anyStartWithS);
		
	}

	private static void StreamIntermediateOperationsExample() 
	{
		 // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        System.out.println(listOfLists);
        // Create a set to hold intermediate results
        HashSet<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfLists.stream()
            .flatMap(List::stream)               // Flatten the list of lists into a single stream
            .filter(s -> s.startsWith("S"))      // Filter elements starting with "S"
            .map(String::toUpperCase)            // Transform each element to uppercase
            .distinct()                          // Remove duplicate elements
            .sorted()                            // Sort elements
            .peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on each element
            .collect(Collectors.toList());       // Collect the final result into a list

        // Print the intermediate results
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Final Result:");
        result.forEach(System.out::println);
		
	}

}

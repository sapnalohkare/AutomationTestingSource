package collection;

public class Theory 
{
	
	/*-----What is Collection framework---*/
	/*The Collection framework represents a unified architecture for storing and manipulating a group of objects
	 * 
	 *  It has:
	 *	1)Interfaces and its implementations, i.e., classes
	 *	2)Algorithm
	 * 
	 * -------------Advantages------------
	 * Reusability
	 * Quality
	 * Speed
	 * Maintenance
	 * Reduces Effort to Design New APIs:
	 * 
	 * 					Iterable
	 * 
	 * 					collection
	 * 							 
	 *  List				    Queue 			 					Set                                          			 map
	 *   1)ArrayList            |  1)PriorityQueue                 	|	1) HashSet								   |      			|
	 *   2)LinkedList      		|						   			|	2)LinkedHashSet                            |	 		HashMap	
	 *   3)Vector               Deque  								|											sorted Map          |
	 *   4)Stack  				 1)ArrayDeque					Sorted Set											|			LinkedHashMap	
	 *  															1)TreeSet									TreeMap				
	 *  
	 *  -------------Methods-------------------------
	
	 * 1) searching :  size(),contains(Object element),containsAll(Collection<?> c),isEmpty(),
	 * 				   Stream<E> parallelStream(),Stream<E> stream(),equals(Object element),hashCode()
	 * 2) sorting : 
	 * 3) insertion : add(E e),addAll(Collection<? extends E> c),
	 * 4) manipulation : Spliterator<E> spliterator()
	 * 5) deletion : remove(Object element),removeAll(Collection<?> c),removeIf(Predicate<? super E> filter),
	 * 				 retainAll(Collection<?> c),clear()
	 * 6) Traversing :   Iterator iterator()
	 * 7) Conversion Collection to Array  : Object[] toArray(), <T> T[] toArray(T[] a)
 
	
	 *  -----------Iterator interface methods--------------
	 *  1) hasNext(),2) next() , 3) remove()
     *
	 *  
	 *  ---------------------List--------------
	 *  1) List <data-type> list1= new ArrayList();  
		2) List <data-type> list2 = new LinkedList();  
		3) List <data-type> list3 = new Vector();  
		4) List <data-type> list4 = new Stack();  
	 * */

}

package collection.List.ArrayList_;

import java.util.ArrayList;
import java.util.Iterator;

//Accepts duplicate , Maintain order of insertion
public class Declairation {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList();
		names.add("Divakar");
		names.add(1, "Sapna");
		names.add("Evanshi");
		names.add("Granthik");
		names.add(1, null);

		System.out.println(names.get(1));

		// iterator (3) methods : hashNext() and next remove method ,iterator();

		Iterator<String> itr = names.iterator();

		// hashNext()
		while (itr.hasNext()) {
			// next()
			System.out.println(itr.next());
		}

		System.out.println();
		// size
		System.out.println("Size() : " + names.size());

		// contains
		System.out.println("Contains() : " + names.contains("Manda"));

		// contains
		// System.out.println("containsAll() : "+names.containsAll(name_01));

		// isEmpty()
		System.out.println("isEmpty() : " + names.isEmpty());

		// equals(Object element)
		// System.out.println("equals() : "+names.equals(names_03));

		// hashCode()
		System.out.println("hashCode() : " + names.hashCode());

		// -------------deletion-------------

		// remove()
		System.out.println("remove() : " + names.remove("Sapna"));
		System.out.println("remove() : " + names.remove(0));
		System.out.println("after deletion : " + names);

	}

}

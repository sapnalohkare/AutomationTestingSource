package collection.set.HashSet;

import java.util.HashSet;

public class Convsert_HashSet_To_Array {

	public static void main(String[] args) {
		
		HashSet<String> trees = new HashSet<String>();
		trees.add("Apple");
		trees.add("Orange");
		trees.add("Banana");
		trees.add("Mango");
		
		String arr[] = new String[trees.size()];
		
		String[] array = trees.toArray(arr);  
		
	for (int i = 0; i < array.length; i++) 
	{
		System.out.println(array[i]);
	}

	
	
	//creating custom define object
	
	 HashSet<Person> bookset = new HashSet<Person>();
	 bookset.add( new Person("Maths",  40));
	 bookset.add( new Person("Java", 30));
	 System.out.println(bookset);
	}

}

class Person {  
    private String name;  
    private int age;  
    public Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
    @Override  
    public boolean equals(Object o) {  
        if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;  
        Person person = (Person) o;  
        return age == person.age && name.equals(person.name);  
    }  
    @Override  
    public int hashCode() {  
        return name.hashCode() + age;  
    }  
    @Override  
    public String toString() {  
        return "Person{" +  
                "name='" + name + '\'' +  
                ", age=" + age +  
                '}';  
    }  
}  


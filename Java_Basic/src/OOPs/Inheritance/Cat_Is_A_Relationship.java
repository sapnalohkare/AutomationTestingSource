package OOPs.Inheritance;

//Is-A relationship: Whenever one class inherits another class, it is called an IS-A relationship.

//parent class
class Animal
{ 
	  
    private String name;
    
    
    public void setName(String name) 
    { 
        this.name = name; 
    } 
  
    public void getName() 
    { 
        System.out.println(this.name + " is a Animal"); 
    } 
} 
  

//child class
public class Cat_Is_A_Relationship extends Animal
{
	
	 private int age;
	 
	    public void setAge(int age) 
	    { 
	        this.age = age; 
	    } 
	  
	    public void getAge() 
	    { 
	       
	    	System.out.println( this.age + " is cats age"); 
	    } 
	  
	    public static void main(String[] args)
	    {
	    	/*1-> Access parent as well as child class properties and behavior*/
	        Cat_Is_A_Relationship cat_Object = new Cat_Is_A_Relationship();
	    	
	        System.out.println("-----Aceess Parent as well as child class------");
	        
	        //access parent class
	    	cat_Object.setName("Dolly");
	    	cat_Object.getName();
	    	
	    	//access child class
	    	//cat_Object.age= 9;
	    	cat_Object.setAge(4);
	    	cat_Object.getAge();
	    	
	    	System.out.println();
	    	
	    	
	    	System.out.println("-----Aceess only child class------");
	    	
	    	/*2-> Access only parent class properties and behavior*/
	        Animal   animal_Object = new Cat_Is_A_Relationship();
	        
	        //only parent class
	        animal_Object.setName("Rubi");
	        animal_Object.getName();
	    	
	    	
		}

	
}
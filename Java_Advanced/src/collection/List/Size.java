package collection.List;

import java.util.ArrayList;
import java.util.List;

//return the size of List
public class Size {

	public static void main(String[] args) 
	{

		List<String> AutomationTypes = new ArrayList<String>();
		AutomationTypes.add("Functional Testing");
		AutomationTypes.add("Unit Testing");
		AutomationTypes.add("Integration Testing");
		AutomationTypes.add("Non-functional Testing");
		AutomationTypes.add("Performance Testing");
		AutomationTypes.add("Regression Testing");
		AutomationTypes.add("Keyword-driven Testing");
		
		System.out.println(AutomationTypes.size());//7

	}

}

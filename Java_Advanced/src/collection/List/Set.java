package collection.List;

import java.util.ArrayList;
import java.util.List;

//set element to particular index
public class Set {

	public static void main(String[] args) {
		
		List<String> AutomationTypes = new ArrayList<String>();
		AutomationTypes.add("Functional Testing");
		AutomationTypes.add("Unit Testing");
		AutomationTypes.add("Integration Testing");
		AutomationTypes.add("Non-functional Testing");
		AutomationTypes.add("Performance Testing");
		AutomationTypes.add("Regression Testing");
		AutomationTypes.add("Keyword-driven Testing");
		
		//set smoke testing at index : 0
		AutomationTypes.set(0, "Smoke Testing");
		
		System.out.println(AutomationTypes);

	}

}

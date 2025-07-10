package execute;

import org.testng.annotations.Test;

import fileDataFetching.PropertiesFileBaseClass;

public class ExecuteFile extends PropertiesFileBaseClass {
  @Test
  public void fileDataFetching() throws Throwable {
	  propertyfile();
	  System.out.println(p_01.getProperty("chromebrowser"));
	  System.out.println(p_02.getProperty("emailAddress"));
	  
	  
  }
}

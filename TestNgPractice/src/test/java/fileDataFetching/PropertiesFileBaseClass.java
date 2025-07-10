package fileDataFetching;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertiesFileBaseClass {

	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream inputstream = null;
	public static Properties p_01,p_02 =null;

	public static void propertyfile() throws Throwable {

		// broser_URL
		inputstream = new FileInputStream(projectpath + "\\src\\main\\resources\\P1_Browser_URL.properties");
		p_01 = new Properties();
		p_01.load(inputstream);
		
		//data file
		
		inputstream = new FileInputStream(projectpath + "\\src\\main\\resources\\P2_data.properties");
		p_02 = new Properties();
		p_02.load(inputstream);
	}

}

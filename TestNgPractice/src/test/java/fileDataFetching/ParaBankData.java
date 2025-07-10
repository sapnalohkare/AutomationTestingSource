package fileDataFetching;

import java.io.FileInputStream;
import java.util.Properties;

public class ParaBankData {

	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream file = null;
	public static Properties filePOM = null;
	public static String filepath = System.getProperty("user.dir");

	public static Properties fetchRecordFromFile() throws Throwable {

		file = new FileInputStream(projectpath + "\\src\\main\\resources\\ParabankData.properties");
		filePOM = new Properties();
		filePOM.load(file);
		return filePOM;

	}

}

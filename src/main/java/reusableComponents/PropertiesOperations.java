package reusableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesOperations {
	static Properties prop = new Properties();
	
	public static String getPropertyByValue(String key) throws IOException
	{
		//load the data from property file
		
		String filePath =  System.getProperty("user.dir")+"/src/test/resources/configfiles.properties";
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		//read the data from file
		String value =prop.get(key).toString();
		return value;
	}

}

package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	// create a ref of properties class which holds key value pair
	Properties prop;

	public ConfigReader() throws IOException {
		//read the config value
		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
		//create object of properties file
		prop = new Properties();
		//It reads the file through fis and loads the key-value pairs into prop.
		prop.load(fis);	
	}
	
	public String username() {
		return prop.getProperty("username");
	}
	
	public String password() {
		return prop.getProperty("password");
	}
	
	public String pageUrl() {
		return prop.getProperty("url");
	}
	
}

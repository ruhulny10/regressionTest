package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

//	public static void main(String[] args) {
//		System.out.println(getTestEnv());
//		System.out.println(getBrowserType());
//		System.out.println(getEnvProperty(("appUrl")));
//		System.out.println(getEnvProperty(("email")));
//		System.out.println(getEnvProperty(("password")));
//		
//
//	}

	public  String getEnvProperty(String key) {

		return getEnvProperties().getProperty(key);

	}
	
	public  String getTestEnv(String key) {

		return loadProperty("test").getProperty("testEnv");

	}

	public static  String getTestEnv() {

		return loadProperty("test").getProperty("testEnv");
	}
	
	public String getBrowserType() {

		return loadProperty("test").getProperty("browserType");
	}

	private static Properties getEnvProperties() {

		Properties prop = null;
		String propertyFileName = loadProperty("test").getProperty("testEnv");

		prop = loadProperty(propertyFileName);
		return prop;

	}

	private static Properties loadProperty(String propertyFileName) {
		Properties value = null;

		File file = new File(
				System.getProperty("user.dir") + "/src/main/resources/prpperties/" + propertyFileName + ".properties");

		try {
			FileInputStream fileData = new FileInputStream(file);
			Properties prop = new Properties();

			prop.load(fileData);
			value = prop;

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

}

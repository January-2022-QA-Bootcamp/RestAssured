package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private static ReadConfig readConfigFile;
	private static String location = "./configuration/config.properties";

	private static String baseUrl;
	private static String getUserEndpoint;

	private ReadConfig() {

	}

	public static ReadConfig getInstance() {
		if (readConfigFile == null) {
			readConfigFile = new ReadConfig();
			readProperties();
		}
		return readConfigFile;
	}

	private static void readProperties() {
		try {
			FileReader reader = new FileReader(location);
			Properties properties = new Properties();
			properties.load(reader);
			//Top 3 lines are reading the configure.properties file
			baseUrl = properties.getProperty("baseUrl");
			getUserEndpoint = properties.getProperty("getUserEndpoint");
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public String getGetUserEndpoint() {
		return getUserEndpoint;
	}
}

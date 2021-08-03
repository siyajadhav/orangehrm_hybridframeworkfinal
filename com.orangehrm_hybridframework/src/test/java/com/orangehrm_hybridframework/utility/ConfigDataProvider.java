package com.orangehrm_hybridframework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties prop = null;
	
	public ConfigDataProvider() {
		try {
			File fs = new File("./Config/config.properties");
			FileInputStream fins = new FileInputStream(fs);
			prop= new Properties();
			prop.load(fins);
		}catch(Exception e) {
			System.out.println("File not found in specified location :"+e);
		}
	}
	
	public String getUrl() {
		return prop.getProperty("url");
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String searchKey(String key) {
		return prop.getProperty(key);
	}
}

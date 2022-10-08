package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties po;
	
	public ConfigurationReader() throws Exception {
		
		File file = new File("C:\\Users\\Barani seenu\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(file);
		po = new Properties();
		po.load(fis);
	
	}
	
	public String getBrowser() {
		String browser = po.getProperty("browser");
		return browser;
		//System.out.println(browser);
	}
	
	public String getUrl() {
		String url = po.getProperty("url");
		return url;
		//System.out.println(url);
	}
}

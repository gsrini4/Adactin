package com.adactin.helper;

public class FileReaderManager {

	private FileReaderManager() {
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getCrInstance() throws Exception {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}

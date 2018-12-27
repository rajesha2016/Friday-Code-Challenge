package FrameworkLibraries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author r.moharana
 * This class helps to get properties file data and supply to scripts
 */
public class ConfigFileReader {
	
	 private Properties properties;
	 private final String propertyFilePath= "Config/Configuration.properties";
	 
	 //constructor to initialize properties
	 public ConfigFileReader(){
		 
		 BufferedReader reader;
		 try {
			 reader = new BufferedReader(new FileReader(propertyFilePath));
			 properties = new Properties();
			 try {
				 properties.load(reader);
				 reader.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
			 throw new RuntimeException("configuration.properties not found at " + propertyFilePath);
	 	 } 
	 }
	 
	
	/**
	 * @return Cucumber-Extent path inside project directory
	 */
	@SuppressWarnings("unused")
	public String getReportConfigPath(){
		
		String reportConfigPath = System.getProperty("user.dir")+properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report config path not specfied in configuration.properties file");
	}

}

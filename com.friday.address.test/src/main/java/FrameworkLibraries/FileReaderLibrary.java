package FrameworkLibraries;

/**
 * @author r.moharana
 * This class is a singleton class
 * This will help if framework has multiple external files like properties file or any other external file like excel
 * Hold single instance of class till execution
 */
public class FileReaderLibrary {
	
	 private static FileReaderLibrary fileReaderManager = new FileReaderLibrary();
	 private static ConfigFileReader configFileReader;
	 
	 private FileReaderLibrary() { }
	 
	 public static FileReaderLibrary getInstance( ) {
		 
		 return fileReaderManager;
	 }
	 
	//initialize ConfigFileReader object, if already present then return the current instance.
	 public ConfigFileReader getConfigReader() {
		 
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }


}

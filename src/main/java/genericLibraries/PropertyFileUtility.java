package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class contain all reusable methods to perform operations on properties
 * file
 * 
 * @author wasim
 *
 */
public class PropertyFileUtility {

	Properties property = null;

	/**
	 * this method is used to initialize property file
	 * 
	 * @param filePath
	 */
	public void propertyFileInitialization(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		property = new Properties();

		try {
			property.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * this method returns the data from properties file based on the key passed
	 * 
	 * @param key
	 * @return
	 */

	public String fetchProperty(String key) {
		return property.getProperty(key);
	}

}

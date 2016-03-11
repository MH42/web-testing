package pageObjects;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
	private static final String MAC_DIR = "macDir";
	private static final String WIN_DIR = "winDir";
	private static String macDir, winDir;
	private static PropertiesLoader propertiesLoader;
	
	private void init() {
		Properties properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("properties/config.properties"));
			macDir = properties.getProperty(MAC_DIR);
			winDir = properties.getProperty(WIN_DIR);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private PropertiesLoader() {}

	private static void checkInit() {
		if(propertiesLoader == null) {
			propertiesLoader = new PropertiesLoader();
			propertiesLoader.init();
		}
	}

	/**
	 * @return a special dir for Mac
	 */
	public static String getMacDir() {
		checkInit();
		return macDir;
	}
	
	/**
	 * @return a special dir for Windows
	 */
	public static String getWinDir() {
		checkInit();
		return winDir;
	}
}

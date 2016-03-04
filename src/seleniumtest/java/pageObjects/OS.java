package pageObjects;

import java.io.IOException;

public class OS {
	private OS_TYPE osType;
	private static OS instance;
	
	private OS() throws IOException {
		String os = System.getProperty("os.name").toLowerCase();
		if(os.contains("mac"))
			osType = OS_TYPE.MAC;
		else if(os.contains("win"))
			osType = OS_TYPE.WINDOWS;
		else if(os.contains("linux"))
			osType = OS_TYPE.LINUX;
		else {
			throw new IOException("Unsupported operating system!");
		}
	}
	
	public static OS_TYPE getOsType() {
		if(OS.instance == null)
			try {
				OS.instance = new OS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return OS_TYPE.MAC;
			}
		return instance.osType;
	}
	
	public enum OS_TYPE {
		MAC, LINUX, WINDOWS;
	}
}

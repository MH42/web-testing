package pageObjects;

import org.junit.Test;

import pageObjects.OS.OS_TYPE;

public class RecoverLDState {


	@Test
	public void main() {

		String sep = System.getProperty("file.separator");
		String FilePath = System.getProperty("user.dir")+sep+"Documents";

		String tomcatPath = "/LogicalDOC-Community/tomcat";
		String zipFilePath = FilePath + "/logicaldoc.zip";
		String delDirectory = FilePath + "/logicaldoc";
		String destDirectory = FilePath + "/";
		//        String ldDestDirectory = destDirectory + "/logicaldotc";
		UnzipUtility unzipper = new UnzipUtility();
		try {

			if (OS.getOsType() == OS_TYPE.MAC || OS.getOsType() == OS_TYPE.LINUX){

				Runtime.getRuntime().exec(tomcatPath + "/bin/shutdown.sh"); // stop tomcat
				DeleteDirectory.removeRec(delDirectory);
				unzipper.unzip(zipFilePath, destDirectory);
				Runtime.getRuntime().exec(tomcatPath + "/bin/startup.sh"); // start tomcat again
			}

			Runtime.getRuntime().exec(tomcatPath + "/bin/shutdown.bat"); // stop tomcat
			DeleteDirectory.removeRec(delDirectory);
			unzipper.unzip(zipFilePath, destDirectory);
			Runtime.getRuntime().exec(tomcatPath + "/bin/startup.bat"); // start tomcat again


		} catch (Exception ex) {
			// some errors occurred
			ex.printStackTrace();
		}
	}

}

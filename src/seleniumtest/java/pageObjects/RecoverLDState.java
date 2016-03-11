package pageObjects;

import org.junit.Test;

import pageObjects.OS.OS_TYPE;

public class RecoverLDState {

	
	@Test
    public void main() {
    	String tomcatPath = "/LogicalDOC-Community/tomcat";
    	String FilePath = "/Users/johannesh/Documents";
        String zipFilePath = FilePath + "/logicaldoc.zip";
        String delDirectory = FilePath + "/logicaldoc";
        String destDirectory = FilePath + "/";
//        String ldDestDirectory = destDirectory + "/logicaldotc";
        UnzipUtility unzipper = new UnzipUtility();
        try {

            Runtime.getRuntime().exec(tomcatPath + "/bin/shutdown.sh"); // stop tomcat
        	
//        	if (OS.getOsType() == OS_TYPE.MAC)
        	
        	DeleteDirectory.removeRec(delDirectory);
            

//            Runtime.getRuntime().exec("rm -rf " + FilePath + "logicaldoc" ); // delete LD folder
//            Runtime.getRuntime().exec("cd " + destDirectory );	// move to BackUp
//            Runtime.getRuntime().exec("mv " + ldDestDirectory + " " + FilePath ); // move BackUp to installation path
            unzipper.unzip(zipFilePath, destDirectory);
            
            Runtime.getRuntime().exec(tomcatPath + "/bin/startup.sh"); // start tomcat again
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }

}

package pageObjects;


public class RecoverLDState {

    public void main(String[] args) {
    	String tomcatPath = System.getProperty("catalina.base");
    	String FilePath = "/Users/johannesh/Documents";
        String zipFilePath = FilePath + "/logicaldoc.zip";
        String destDirectory = FilePath + "/logicaldoctemp";
        String ldDestDirectory = destDirectory + "/logicaldotc";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
            Runtime.getRuntime().exec(tomcatPath + "/bin/shutdown.sh"); // stop tomcat
//            Runtime.getRuntime().exec("rm -rf " + FilePath + "logicaldoc" ); // delete LD folder
//            Runtime.getRuntime().exec("cd " + destDirectory );	// move to BackUp
//            Runtime.getRuntime().exec("mv " + ldDestDirectory + " " + FilePath ); // move BackUp to installation path
            
            Runtime.getRuntime().exec(tomcatPath + "/bin/startup.sh"); // start tomcat again
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }

}

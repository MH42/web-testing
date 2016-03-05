package pageObjects;

import org.junit.BeforeClass;

public class RecoverLDState {

	 
    @BeforeClass
    public void main(String[] args) {
    	String FilePath = "/Users/johannesh/Documents";
        String zipFilePath = FilePath + "/logicaldoc.zip";
        String destDirectory = FilePath + "/logicaldoctemp";
        String ldDestDirectory = destDirectory + "/logicaldoc";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
            Runtime.getRuntime().exec("rm -rf " + FilePath + "logicaldoc" );
            Runtime.getRuntime().exec("cd " + destDirectory );
            Runtime.getRuntime().exec("mv " + ldDestDirectory + " " + FilePath );
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }

}

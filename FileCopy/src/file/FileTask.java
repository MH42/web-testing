package file;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileTask {
	private static final String ORIG = "Orig";
	private static final String SEEDED = "Seeded";
	
	/**
	 * Copies a file given in a fileList with a predefined path.
	 * Convention: use relative paths in fileList!
	 * @param fileList path/to/fileList
	 * @param suffix constant: either ORIG or SEEDED
	 */
	public void copy(Path fileList, String suffix) {
		final String currentDir = System.getProperty("user.dir")+File.separator+"/src";
		try {
			for(String relativeSource : getFiles(fileList)) {
				final File absoluteSource = new File(currentDir+File.separator+relativeSource+suffix+".txt");
				System.out.println("Copying '"+absoluteSource+"' ...");
				if(!absoluteSource.exists())
					System.err.println("Source '"+absoluteSource+"' is not a valid path!");
				else {
					Files.copy(absoluteSource.toPath(), new File(currentDir+File.separator+relativeSource+".java").toPath(), REPLACE_EXISTING);
					System.out.println("DONE.");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private List<String> getFiles(Path fileList) throws IOException {
		List<String> filesToCopy = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileList.toFile())));
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			filesToCopy.add(line);
		}
		return filesToCopy;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final FileTask fileTask = new FileTask();
		// Examples:
		fileTask.copy(new File("errorSeeding/faultList.txt").toPath(), ORIG);
//		fileTask.copy(new File("errorSeeding/faultList.txt").toPath(), SEEDED);
	}

}

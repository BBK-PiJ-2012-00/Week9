import java.io.File;

public class FileDirectory {
	private String path = ".";
	private String files;
	private File folder = new File(path);
	private File[] fileList = folder.listFiles();	
	
	public static void main(String[] args) {
	
		FileDirectory fileDirectory = new FileDirectory();
		fileDirectory.launch();
		
	}
	
	private void launch() {
	
		for (int i = 0; i < fileList.length; i++) {
			//if (fileList[i].isFile()) {
				files = fileList[i].getName();
				System.out.println(files);
			//}
		}		
		
	}
}
	
		

	








/**
Write a program that shows on screen the names of the files in the current directory. (Hint: look at methods from
class File).
*/
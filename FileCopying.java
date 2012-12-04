import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileCopying {

	public static void main(String[] args) {
	
		String query1 = args[0];
		String query2 = args[1];
		String line = "";
		
		File file1 = new File(query1);
		File file2 = new File(query2);
		BufferedReader in = null;
		PrintWriter out = null;
		
		if (file1.exists()) {
			System.out.println("Are you sure you want to overwrite " + query1 + "? Y/N");
			String yn = System.console().readLine();
			if (yn.equals("y") || yn.equals("Y")) {
				try {
					in = new BufferedReader(new FileReader(file1));
					out = new PrintWriter(file2);
					while ((line = in.readLine()) != null) {
					out.write(line + "\n"); //separates lines
					}	
				}
				catch (IOException exIO) {
					exIO.printStackTrace();
				}
				//catch (FileNotFoundException exFNF) {
				//	System.out.println("File not found");
				//}			
				finally {
					out.close();
					try {
						if (in != null) {
							in.close();
						}
					}
					catch (IOException ex) {
						ex.printStackTrace();
					}
				}			
			}
			else {
				System.out.println("Aborted.");
			}
		}
		else {
			System.out.println("File not found.");
		}
	}
		
		
}
					
				
			
	
		
		/**File file = new File("testWrite.txt");
		PrintWriter out = null;
		try {
			out = new PrintWriter(file);
			out.write("Testing writing......");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			out.close();
		}
	}
}
*/

		
		
		
		
		

	









/**
Write a program that takes two names from the user at the command line. If a file with the first name exists, the
program must copy it into a file with the second name.
If the first file does not exist, the program must say so. If the second file does exists, the program must ask the
user whether to overwrite it or not, and act accordingly.
*/
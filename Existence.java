/** 
* Day 18: Ex 3a, 3b(*)
* 3a is without the for loop.
*/
import java.io.File;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Existence {
	private static String query;
	

	
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			String line = "";
			query = args[i];
			File file = new File(query);
			if (file.exists()) {
				BufferedReader in = null;
				try {
					in = new BufferedReader(new FileReader(file));
					while ((line = in.readLine()) != null) {
						System.out.println(line);
					}
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				finally {
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
				System.out.println("File not found.");
			}
			
		}
	
	}
	
}



					
			
			
	









/**
Write a program that takes a name from the user at the command line. If a file with that name exists, the program
must show its contents on screen. If it does not, the program must say so.
*/



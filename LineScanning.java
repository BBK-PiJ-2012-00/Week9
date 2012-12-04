import java.util.Scanner;
import java.io.*;

public class LineScanning { 

	public static void main(String[] args) {
	
		LineScanning ls = new LineScanning();
		ls.launch();
		
	}
	
	private void launch() {
		
		File file = new File("basic.csv");
		BufferedReader in = null;
		Scanner sc;
		String line;
		int total = 0;
		int i = 0;
		int mean;
		try {
			in = new BufferedReader(new FileReader(file));
			while ((line = in.readLine()) != null) {
				//System.out.println(line);
				sc = new Scanner(line);
				sc.useDelimiter(", ");
				while (sc.hasNextInt()) {
					total = total + sc.nextInt();
					System.out.println(total);
					i++;
				}
			mean = total / i;
			System.out.print("The mean is: " + mean);
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
}
			
		
		
/**
* Day 18, ex 8
* Fully functional.
*/

import java.io.*;
import java.util.Scanner;

public class TemperatureAverage {
	

	
			
	public static void main(String[] args) {
		
		TemperatureAverage ta = new TemperatureAverage();
		ta.launch();
		
	}
	
	private void launch() {
	
		File file = new File("temps.csv");
		Scanner lineSc;
		BufferedReader in = null;
		String line;
		int lineTotal;
		int total = 0;
		int j = 0;
		int i;
		int mean;
		int grandMean;
		if (file.exists()) {
			try {
			in = new BufferedReader(new FileReader(file));
			while ((line = in.readLine()) != null) {
				lineSc = new Scanner(line);
				lineSc.useDelimiter(", ");
				lineTotal = 0;
				i = 0;
				while (lineSc.hasNextInt()) {
					lineTotal = lineTotal + lineSc.nextInt();
					i++;
					j++;
				}
				System.out.println("The total for this line is: " + lineTotal);
				mean = lineTotal / i;
				System.out.println("The average for this line is: " + mean);
				total = total + lineTotal;
			}
			System.out.println("The grand total is: " + total);
			grandMean = total / j;
			System.out.println("The overall mean is: " + grandMean);
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
				
		
		
	
		

	














/**
Write a program that reads a file from disk in comma-separated format (CSV). Every line must contain a list of
number separated by commas.
The program must output the average for every line plus the average for the whole file. A file may look like the
following:

*/
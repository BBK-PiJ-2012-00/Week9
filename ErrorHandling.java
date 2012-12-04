/**
* Day 17, ex 3
* Fully functional!
*/
public class ErrorHandling {
	public IllegalArgumentException argEx = new IllegalArgumentException();

	public int verifySize(String s) {
		int requestedSize = 0;
		try {
			requestedSize = Integer.parseInt(s);
			if (requestedSize < 1) {
				throw argEx;
			}
		}
		catch (NumberFormatException ex) {
			System.out.println("Numbers only, please!");
		}
		catch (IllegalArgumentException argEx) {
			System.out.println("Please enter a valid number i.e. > 0");
		}
		return requestedSize;
	}		

	public static void main(String[] args) {
	
		ErrorHandling errorHandling = new ErrorHandling();
		errorHandling.launch();
		
	}
	
	private void launch() {
		System.out.print("How many numbers do you want to enter? ");
		String request = System.console().readLine();
		int requestedSize = verifySize(request);
		while (requestedSize < 1) {
			System.out.print("Please re-enter the size: "); //have an alternate message for if the user enters a number less than 0! IllegalArgumentException
			request = System.console().readLine();
			requestedSize = verifySize(request);
		}			
		Integer[] array = new Integer[requestedSize];			
		int i = 0;
		//System.out.println("Please enter ten numbers and I will calculate the mean.");
		System.out.println("Now enter the numbers: ");
		while (array[requestedSize - 1] == null) { //to compare with null, you need Integer, not int
			String s = System.console().readLine();
			try {
				int num = Integer.parseInt(s);
				array[i] = num;
				i++;
			}
			catch (NumberFormatException ex) {
				System.out.println("ERROR: Can't you read? You're supposed to enter numbers!");
			}
		}
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum = sum + array[j];
		}
			double total = (double) sum;
			System.out.println("The total of the numbers you entered is: " + total);
			double mean = total / array.length;
			System.out.println("The mean of the numbers you entered is: " + mean);
			
	}
	
}
		
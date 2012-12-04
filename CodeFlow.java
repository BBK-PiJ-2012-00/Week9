import java.util.List;
import java.util.ArrayList;

public class CodeFlow {
	
	public static void main(String[] args) {
	
		CodeFlow codeFlow = new CodeFlow();
		codeFlow.launch(6);
	}
	
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput)); 
			intList.remove(0);  
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}	
	}
 }
 
/**
UserInput = 0: Line 22 outputs 2.
	Line 24: 3
	Line 26: 4
	Line 28: 5
	Line 30: 6
	Line 32: IndexOutOfBoundsException
	1, 2, 3, 4, 5, 6
	2, 3, 4, 5, 6
	3, 4, 5, 6
	4, 5, 6
	5, 6
	6,
	null

UserInput = 2
	Line 22: 4
	Line 24: 5
	Line 26: 6
	iLne 28: IndexOutOfBoundsException
	
UserInput = 4
	Line 22 = 6
	Line 24 = IndexOutOfBounds
	
UserInput = 6
	Line 22 = IndexOutOfBounds
	
Ex2: You cannot write just catch (Exception ex) {} - you need to be more specific.
*/
	
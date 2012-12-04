import java.io.File;

public class MakeDirectory {
	private static String directory;
		

	public static void main(String[] args) {
	
		for (int i = 0; i < args.length; i++) {
			directory = args[i];
			File dName = new File(directory);
			dName.mkdir();
		}
	}
}

			











/**
Write a program that takes a name from the user at the command line and creates a directory with that name.
Remember that the only argument of method main is an array of Strings, each of them an argument written after
the name of the class. For example, if you write java myClass this That 0, the elements in args will be three
strings of values “this”, “That”, and “0”.
*/
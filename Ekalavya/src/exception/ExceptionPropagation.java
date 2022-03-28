package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("F");
		try {
			doStuff();
		} catch (FileNotFoundException e) {
		
			
			/// read file from D drive
		}
		System.out.println("X");

	}

	public static void doStuff() throws FileNotFoundException{
		
		doMoreStuff();
		
	
		System.out.println("P");
	}

	public static void doMoreStuff() throws FileNotFoundException {
		
		System.out.println("L");
		
		File file = new File("C:/abc.txt");
		
		FileInputStream inputStream = new FileInputStream(file);
		
	}
}

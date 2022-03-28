package exception;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileReadUtility.readContentFromFile("E:\\Learning\\abc.txt");
		} catch (IOException e) {
			try {
				System.out.println("Exception aayi");
				FileReadUtility.readContentFromFile("C:\\Learning\\Student_Crud.txt");
			} catch (IOException e1) {
				System.out.println("No File found");
			}
		}
		

	}

}

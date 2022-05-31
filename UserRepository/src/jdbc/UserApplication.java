package jdbc;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type 1 for save record or Type 2 for search");
		int option = scanner.nextInt();

		if (option == 1) {
			scanner.nextLine();
			System.out.println("Please Enter First Name");
			String firstName = scanner.nextLine();

			System.out.println("Please Enter Last Name");
			String lastName = scanner.nextLine();

			System.out.println("Please Enter City");
			String city = scanner.nextLine();

			String userName = (firstName + lastName).toLowerCase();

			UserDetails userDetails = new UserDetails(0, userName, firstName, lastName, city);

			DBUtility.saveUserDetails(userDetails);
		} else {
			
			System.out.println("Please enter userId");
			
			int userId = scanner.nextInt();
			
			UserDetails userDetails = DBUtility.getUserDetails(userId);
			
			System.out.println(userDetails);
		}

	}

}

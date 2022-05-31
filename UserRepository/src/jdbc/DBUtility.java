package jdbc;

import java.sql.*;

public class DBUtility {

	public static void saveUserDetails(UserDetails userDetails) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapplications", "root",
					"Lukesh@06101990");

			PreparedStatement stmt = connection
					.prepareStatement("insert into Users (USER_NAME,FIRST_NAME,LAST_NAME,CITY) values(?,?,?,?)");

			stmt.setString(1, userDetails.getUserName());// 1 specifies the first parameter in the query
			stmt.setString(2, userDetails.getFirstName());
			stmt.setString(3, userDetails.getLastName());
			stmt.setString(4, userDetails.getCity());

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static UserDetails getUserDetails(int userId) {
		UserDetails userDetails = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapplications", "root",
					"Lukesh@06101990");

			PreparedStatement stmt = connection.prepareStatement("Select * from Users where USER_ID = ?");

			stmt.setInt(1, userId);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int dbuserId = rs.getInt(1);
				String userName = rs.getString(2);
				String firstName = rs.getString(3);
				String lastName = rs.getString(4);
				String city = rs.getString(6);
				userDetails = new UserDetails(dbuserId, userName, firstName, lastName, city);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return userDetails;
	}

}

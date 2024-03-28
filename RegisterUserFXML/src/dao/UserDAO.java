package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import application.User;

public class UserDAO {
	public static List<User> listAllUsers() {
		List<User> listUser = new ArrayList<>();
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String url = "jdbc:ucanaccess://lib/QLNS.accdb";
			Connection con = DriverManager.getConnection(url);
			
			String sql = "select * from tbluser";
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				String email = resultSet.getString("email");
				String fullname = resultSet.getString("fullname");
				
				User user = new User(email,fullname);
				listUser.add(user);
				
				resultSet.close();
				statement.close();
				con.close();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listUser;
	}
}

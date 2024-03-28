package application;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
	private List<User> listUser;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
		listUser = new ArrayList<User>();
		listUser.add(new User("abc@gmail.com", "Nguyen Duc Nam"));
		listUser.add(new User("xyz@gmail.com", "Phan Van Duc"));
		listUser.add(new User("opq@gmail.com", "Nguyen Hai Hau"));
	}
	
	public void addUser(User user) {
		listUser.add(user);
	}
	
	public boolean checkUser(String email) {
		for(User user: listUser) {
			if(user.getEmail().equals(email)) {
				return true;
			}
		}
		
		return false;
	}
}

package application;

import java.awt.Label;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class HomeController {
	private String userList;
	@FXML
	private Label userListLabel;
	
	@FXML
	public void initialize() {
		Platform.runLater(() ->{
			userListLabel.setText(userList);
		});
	}
	
	public void setUserList(String userList) {
		this.userList = userList;
	}
	
	public String getUserList() {
		return userList;
	}
	
	public void setUserListLabel(Label userList) {
		this.userListLabel = userList;
	}

	public Label getUserListLabel() {
		return userListLabel;
	}

}

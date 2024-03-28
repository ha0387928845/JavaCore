package application;

import java.io.IOException;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegisterController {
	@FXML
	private TextField emailTF;
	@FXML
	private TextField passwordTF;
	@FXML
	private Label errorLabel;
	
	@FXML
	public void onClickRegisterBtn() {
		UserModel userModel = new UserModel();
		
		if(userModel.checkUser(emailTF.getText())){
			errorLabel.setText("Email đã tồn tại!");
		} else {
			userModel.addUser(new User(emailTF.getText(), passwordTF.getText()));
			
			Scene regisScene = emailTF.getScene();
			regisScene.getWindow().hide();
			
			String userList = userModel.toString();
			goToHomeScreen(userList);
		}
	}
	
	public void goToHomeScreen(String userList) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
			Parent root = (Parent)fxmlLoader.load();
			
			HomeController controller = fxmlLoader.getController();
			
			controller.setUserList(userList);
			
			Stage homeStage = new Stage();
			homeStage.setTitle("Home Screen");
			homeStage.setScene(new Scene(root));
			homeStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

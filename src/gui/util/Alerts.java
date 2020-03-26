package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {

	public static void showAlert(String title, String reader, String content, AlertType type) {

		Alert alert = new Alert(type);

		alert.setTitle(title);
		alert.setHeaderText(reader);
		alert.setContentText(content);
		alert.setAlertType(type);

		alert.show();

	}

}

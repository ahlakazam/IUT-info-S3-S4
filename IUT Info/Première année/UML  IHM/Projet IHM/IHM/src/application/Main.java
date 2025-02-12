 package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("acceuil.fxml"));
	        primaryStage.setTitle("Acceuil");
	        primaryStage.setScene(new Scene(root, 400, 400));
	        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

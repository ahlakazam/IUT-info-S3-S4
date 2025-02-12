package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Acceuil {

    @FXML
    private Button bouttonConnexion;

    @FXML
    private Hyperlink onclickSubscribe;

    @FXML
    private AnchorPane boutonConexion;

    @FXML
    private TextField textfieldIdentifiant;

    @FXML
    private TextField textfieldMotdepasse;

    @FXML
    void onConnexionClicked(ActionEvent event) {

    }

    @FXML
    void actionConnexion(ActionEvent event) {
    	if (textfieldIdentifiant.getText().equals("admin") && textfieldMotdepasse.getText().equals("admin"))
    	{
	    	try {
	            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("admin.fxml"));
	            Parent root = fxmlLoader.load();
	            Stage stage=(Stage) bouttonConnexion.getScene().getWindow();
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    	}
    	else if (textfieldIdentifiant.getText().isEmpty()|| textfieldMotdepasse.getText().isEmpty())
    	{
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Erreur dans l'application");
    		alert.setHeaderText("Veuillez remplir les deux champs svp.");
    		alert.show();

    	}
    	else 
    	{
    		Student s = null;
    		try {
				s = Student.load("C:\\Users\\Thomas\\OneDrive\\IUT Info\\UML  IHM\\Projet IHM\\IHM\\Sauvegardes\\" + textfieldIdentifiant.getText());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Erreur dans l'application");
	    		alert.setHeaderText("Adresse mail inexistante, veuillez vous inscrire");
	    		alert.show();
			}
    		if (s.getNaissance().equals(textfieldMotdepasse.getText()))
    		{
    			try {
    	            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("informationList.fxml"));
    	            Parent root = fxmlLoader.load();
    	            Stage stage=(Stage) bouttonConnexion.getScene().getWindow();
    	            Scene scene = new Scene(root);
    	            stage.setScene(scene);
    	            ((InformationList)fxmlLoader.getController()).initData(s);
    	            stage.show();
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
    		}
    		else
    		{
    			Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Erreur dans l'application");
	    		alert.setHeaderText("Mot de passe erron�");
	    		alert.show();
    		}
    		
    	}

    }

    @FXML
    void goToSubscribe(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("generalForm.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) onclickSubscribe.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

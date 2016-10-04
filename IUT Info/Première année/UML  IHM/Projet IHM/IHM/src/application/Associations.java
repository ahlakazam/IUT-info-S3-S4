package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Associations {

    @FXML
    private Button modifierBDS;

    @FXML
    private Button modifierTuteur;

    @FXML
    private Button modifierBDE;

    @FXML
    private Button modifierALUMNICE;

    @FXML
    void modifierTuteur(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("choiceList.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) modifierTuteur.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modifierBDE(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("choiceList.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) modifierTuteur.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modifierBDS(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("choiceList.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) modifierTuteur.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modifierAlumnice(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("choiceList.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) modifierTuteur.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

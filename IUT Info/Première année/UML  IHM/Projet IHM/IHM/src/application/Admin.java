package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Admin {

    @FXML
    private TableView<?> tableStudentList;

    @FXML
    private TableColumn<?, ?> tableViewAdmin;

    @FXML
    private Button boutonGererAssociations;

    @FXML
    private Button bouttonDeconnexion;

    @FXML
    void disconnect(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("acceuil.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) bouttonDeconnexion.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onAttribuChampsClicked(ActionEvent event) {

    }

    @FXML
    void goToAssociations(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("associations.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) boutonGererAssociations.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onDeconnexionClicked(ActionEvent event) {
    	
    }

}

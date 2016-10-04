package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class ChoiceList {

    @FXML
    private CheckBox choiceEvents;

    @FXML
    private CheckBox choiceSchoolCareer;

    @FXML
    private CheckBox choiceName;

    @FXML
    private CheckBox choiceAdress;

    @FXML
    private CheckBox choicePhoneNumber;

    @FXML
    private CheckBox choiceBirthday;

    @FXML
    private CheckBox choiceSports;

    @FXML
    private CheckBox choiceMail;

    @FXML
    private CheckBox choiceYear;

    @FXML
    private CheckBox choiceLastName;

    @FXML
    private Button boutonSuivant;

    @FXML
    private CheckBox choiceScience;

    @FXML
    private CheckBox choiceCompanies;

    @FXML
    void goForward(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("adminValidation.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) boutonSuivant.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GeneralForm {
	
	Student currentStudent = new Student();

    @FXML
    private TextField fieldNom;

    @FXML
    private Button goToTutor;

    @FXML
    private TextField fieldPrenom;

    @FXML
    private TextField fieldMail;

    @FXML
    private ComboBox<String> fieldYear;

    @FXML
    private TextField fieldBirthday;
    
    public void renewData (Student s1) {
    	this.currentStudent = s1;
    	fieldNom.setText(s1.getNom());
    	fieldPrenom.setText(s1.getPrenom());
    	fieldMail.setText(s1.getMail());
    	fieldBirthday.setText(s1.getNaissance());
    	fieldYear.setValue(s1.getPromotion());
    }

    @FXML
    void toTutor(ActionEvent event) {
    	currentStudent.setNom(fieldNom.getText());
    	currentStudent.setPrenom(fieldPrenom.getText());
    	currentStudent.setMail(fieldMail.getText());
    	currentStudent.setNaissance(fieldBirthday.getText());
    	currentStudent.setPromotion((String) fieldYear.getSelectionModel().getSelectedItem());
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("tutorForm.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) goToTutor.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            ((TutorForm)fxmlLoader.getController()).initData(currentStudent);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    @FXML
    public void initialize() {
    	fieldYear.getItems().addAll(
    		    "Informatique",
    		    "Economie",
    		    "Communication",
    		    "M�canique"
    		);
    }

}

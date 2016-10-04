package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TutorForm {
	
	private Student currentStudent;

    @FXML
    private Button goToEvents;

    @FXML
    private TextField fieldPhoneNumber;

    @FXML
    private TextField fieldAdress;

    @FXML
    private TextField fieldSchoolCareer;
    
    void initData(Student student){
    	this.currentStudent = student;
    	fieldPhoneNumber.setText(student.getTelephone());
    	fieldAdress.setText(student.getAdresse());
    	fieldSchoolCareer.setText(student.getParcours());
    	
    	
    }

    @FXML
    void toEvents(ActionEvent event) {
    	this.currentStudent.setTelephone(fieldPhoneNumber.getText());
    	this.currentStudent.setAdresse(fieldAdress.getText());
    	this.currentStudent.setParcours(fieldSchoolCareer.getText());
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("eventsForm.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) goToEvents.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            ((EventsForm)fxmlLoader.getController()).initData(currentStudent);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

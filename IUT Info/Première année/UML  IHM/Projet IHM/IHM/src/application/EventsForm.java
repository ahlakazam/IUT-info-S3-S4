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

public class EventsForm {
	
	private Student currentStudent;

    @FXML
    private CheckBox checkIntegration;

    @FXML
    private CheckBox checkPolytech;

    @FXML
    private Button goToSports;

    @FXML
    private CheckBox checkYearEnd;
    
    void initData(Student student){
    	this.currentStudent = student;
    }

    @FXML
    void toNextPage(ActionEvent event) {
    	if (checkIntegration.isSelected() == true)
    		this.currentStudent.addEvent(new Evenement("Week End d'Int�gration"));
    	if (checkPolytech.isSelected() == true)
    		this.currentStudent.addEvent(new Evenement("Soir�e Polytech"));
    	if (checkYearEnd.isSelected() == true)
    		this.currentStudent.addEvent(new Evenement("Soir�e de fin d'ann�e"));
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("sports.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) goToSports.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            ((Sports)fxmlLoader.getController()).initData(currentStudent);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void goToWeb(ActionEvent event) {

    }

}

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class ScienceForm {
	
	private Student currentStudent;

    @FXML
    private CheckBox checkBoxChimie;

    @FXML
    private Button goToValidation;

    @FXML
    private CheckBox checkBoxInformatique;

    @FXML
    private ComboBox<String> comboBoxEntreprise;

    @FXML
    private CheckBox checkBoxMaths;

    @FXML
    private CheckBox checkBoxM�canique;

    @FXML
    private CheckBox checkBoxPhysique;

    @FXML
    private CheckBox checkBoxBiologie;

    @FXML
    private Hyperlink toWeb;
    
    void initData(Student student){
    	this.currentStudent = student;
    }

    @FXML
    void toNextPage(ActionEvent event) {
    	if (checkBoxBiologie.isSelected() == true)
    		this.currentStudent.addScience(new Science("Biologie"));
    	if (checkBoxPhysique.isSelected() == true)
    		this.currentStudent.addScience(new Science("Physique"));
    	if (checkBoxM�canique.isSelected() == true)
    		this.currentStudent.addScience(new Science("M�canique"));
    	if (checkBoxMaths.isSelected() == true)
    		this.currentStudent.addScience(new Science("Maths"));
    	if (checkBoxInformatique.isSelected() == true)
    		this.currentStudent.addScience(new Science("Informatique"));
    	if (checkBoxChimie.isSelected() == true)
    		this.currentStudent.addScience(new Science("Chimie"));
    	this.currentStudent.setEntreprise(comboBoxEntreprise.getSelectionModel().getSelectedItem());
    	
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("formValidation.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) goToValidation.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            ((FormValidation)fxmlLoader.getController()).initData(currentStudent);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    @FXML
    public void initialize() {
    	comboBoxEntreprise.getItems().addAll(
    			"Orange",
    			"Thales",
    			"Argos",
    			"HP"
    		);
    }

    @FXML
    void goToWeb(ActionEvent event) {

    }

    @FXML
    void comboBoxEntreprise(ActionEvent event) {

    }

}

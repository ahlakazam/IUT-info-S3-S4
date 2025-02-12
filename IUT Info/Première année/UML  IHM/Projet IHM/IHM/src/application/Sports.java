package application;

import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Sports {
	
	private Student currentStudent;
	
	void initData(Student student){
    	this.currentStudent = student;
    }

    @FXML
    private ComboBox<String> comboBoxNiveau;

    @FXML
    private ComboBox<String> comboBoxNiveau2;

    @FXML
    private Button boutonSuivant;

    @FXML
    private ComboBox<String> comboBoxSport2;

    @FXML
    private ComboBox<String> comboBoxSport;

    @FXML
    void goToScience(ActionEvent event) {
    	if (!comboBoxSport.getSelectionModel().getSelectedItem().equals("Aucun") && !comboBoxNiveau.getSelectionModel().getSelectedItem().equals("Aucun"))
    		this.currentStudent.addSport(comboBoxSport.getSelectionModel().getSelectedItem(), comboBoxNiveau.getSelectionModel().getSelectedItem());
    	if(!comboBoxSport2.getSelectionModel().getSelectedItem().equals("Aucun") && !comboBoxNiveau2.getSelectionModel().getSelectedItem().equals("Aucun"))
    		this.currentStudent.addSport(comboBoxSport2.getSelectionModel().getSelectedItem(), comboBoxNiveau2.getSelectionModel().getSelectedItem());
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("scienceForm.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) boutonSuivant.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            ((ScienceForm)fxmlLoader.getController()).initData(currentStudent);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    @FXML
    public void initialize() {
    	comboBoxSport.getItems().addAll(
    		    "Foot",
    		    "Rugby",
    		    "Handball",
    		    "Volley",
    		    "Aucun"
    		);
    	comboBoxSport.setValue("Aucun");
    	
    	comboBoxSport2.getItems().addAll(
    		    "Natation",
    		    "Equitation",
    		    "Tir",
    		    "Aucun"
    		);
    	comboBoxSport2.setValue("Aucun");
    	
    	comboBoxSport.valueProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				
				if (!comboBoxSport.getSelectionModel().getSelectedItem().equals("Aucun"))
				{
					comboBoxNiveau.getItems().setAll(
					"Debutant",
	    		    "Moyen",
	    		    "Confirmé",
	    		    "Compétiteur"
	    		);
				}
				else
					comboBoxNiveau.getItems().setAll();
			}
			
			
		});
    	
    	comboBoxSport2.valueProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				
				if (!comboBoxSport2.getSelectionModel().getSelectedItem().equals("Aucun"))
				{
					comboBoxNiveau2.getItems().setAll(
					"Debutant",
	    		    "Moyen",
	    		    "Confirmé",
	    		    "Compétiteur"
	    		);
				}
				else
					comboBoxNiveau2.getItems().setAll();
			}
			
			
		});
    }

}

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FormValidation {
	
	private Student currentStudent;

	@FXML
    private Label naissance;

    @FXML
    private Label mail;

    @FXML
    private Label sports;

    @FXML
    private Label parcours;

    @FXML
    private Button changeAnswers;

    @FXML
    private Label telephone;

    @FXML
    private Button confirmAnswers;

    @FXML
    private Label nom;

    @FXML
    private Label sciences;

    @FXML
    private Label entreprise;

    @FXML
    private Label adresse;

    @FXML
    private Label evenements;

    @FXML
    private Label prenom;

    @FXML
    private Label promotion;
    
    void initData(Student student){
    	this.currentStudent = student;
    	this.nom.setText(student.getNom());
    	this.prenom.setText(student.getPrenom());
    	this.promotion.setText(student.getPromotion());
    	this.telephone.setText(student.getTelephone());
    	this.mail.setText(student.getMail());
    	this.naissance.setText(student.getNaissance());
    	this.adresse.setText(student.getAdresse());
    	this.parcours.setText(student.getParcours());
    	this.evenements.setText(student.getListeEvents());
    	this.sports.setText(student.getListeSports());
    	this.sciences.setText(student.getListeScience());
    	this.entreprise.setText("Entreprise partenaire : " + student.getEntreprise());
    }

    @FXML
    void validateData(ActionEvent event){
    	try {
			Student.save("C:\\Users\\Thomas\\OneDrive\\IUT Info\\UML  IHM\\Projet IHM\\IHM\\Sauvegardes\\"+currentStudent.getMail(), this.currentStudent);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("acceuil.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) confirmAnswers.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modifyData(ActionEvent event) {
    	try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getClassLoader().getResource("generalForm.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage=(Stage) changeAnswers.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            ((GeneralForm)fxmlLoader.getController()).renewData(currentStudent);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   
    

}

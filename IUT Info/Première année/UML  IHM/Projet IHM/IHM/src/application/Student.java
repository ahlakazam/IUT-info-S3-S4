package application;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String nom;
	private String prenom;
	private String mail;
	private String naissance;
	private String promotion;
	private String telephone;
	private String adresse;
	private String parcours;
	private String entreprise;
	private HashMap<String, String> listeSports;
	private ArrayList<Evenement> listeEvents;
	private ArrayList<Science> listeScience;
	
	public Student () {
		this.nom = "";
		this.prenom = "";
		this.mail = "";
		this.naissance = "";
		this.promotion = "";
		this.adresse = "";
		this.telephone = "";
		this.parcours = "";
		this.listeSports = new HashMap<String, String>();
		this.listeEvents  = new ArrayList<Evenement>();
		this.listeScience = new ArrayList<Science>();
		this.entreprise = "";
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNaissance() {
		return naissance;
	}
	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getParcours() {
		return parcours;
	}
	public void setParcours(String parcours) {
		this.parcours = parcours;
	}

	
	public String getListeScience() {
		String s = "";
		for (Science object: listeScience) {
		    s = s + object.getNom() + "\n";
		}
		return s;
	}
	public void addScience(Science s) {
		this.listeScience.add(s);
	}

	public String getListeEvents() {
		String s = "";
		for (Evenement object: listeEvents) {
		    s = s + object.getNom() + "\n";
		}
		return s;
	}
	
	public void addEvent(Evenement e)
	{
		this.listeEvents.add(e);
	}
	
	public void addSport(String key, String value)
	{
		this.listeSports.put(key, value);
	}

	public String getListeSports() {
		String s = "";
		for(Entry<String, String> entry : listeSports.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    
		    s = s + key + " : " + value + "\n";
		}
		return s;
	}

	public void setListeSports(HashMap<String, String> listeSports) {
		this.listeSports = listeSports;
	}

	public void setListeEvents(ArrayList<Evenement> listeEvents) {
		this.listeEvents = listeEvents;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	public static void save(String fileName, Student s) throws IOException
	{
	FileOutputStream fos = new FileOutputStream(fileName);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	ObjectOutputStream oos = new ObjectOutputStream(bos);
	try{ oos.writeObject(s); }
	finally{ oos.close(); }
	}
	
	public static Student load (String fileName) throws IOException
	{
	Student s = null;
	ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
	try {
	s = (Student) ois.readObject();
	}
	catch(Exception e){ }
	finally { ois.close(); }
	return s;
	}
}

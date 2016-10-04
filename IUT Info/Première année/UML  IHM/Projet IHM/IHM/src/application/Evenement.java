package application;

public class Evenement {
	private String nom;
	
	public Evenement(String nom)
	{
		this.setNom(nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

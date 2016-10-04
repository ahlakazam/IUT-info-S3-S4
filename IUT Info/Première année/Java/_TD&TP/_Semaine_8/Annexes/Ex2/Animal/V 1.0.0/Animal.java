/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Animal - exercice 2
*
*
*    + Version 0.0.0	: Version initiale
*    + Version 1.0.0	: Généralisation de la classe Chien
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/

import java.util.*;
import java.lang.*;
import java.text.*;

public class Animal
{
	protected String nom;
	protected String race;
	protected Character sexe;
	protected int[] dateNaissance = new int[3];
	private int[] age = new int[3];

/**
* Constructeur par défaut
**/
	public Animal()
	{
		nom = "INCONNU";
		race = "INCONNU";
		sexe = 'I';
	}

/**
* Constructeur normal
**/
	public Animal(String nom, String race, Character sexe, int jour, int mois, int annee) throws Throwable
	{
		// verification validité paramètres
		if (nom == null || nom.equals("")) throw new Throwable ("-1");
		if (race == null || race.equals("")) throw new Throwable ("-2");
		if (!sexe.equals('F') && !sexe.equals('M')) throw new Throwable ("-3");
		if (!(jour>=1 && jour<=31)) throw new Throwable ("-4");
		if (!(mois>=1 && mois<=12)) throw new Throwable ("-5");
		if (annee > Calendar.getInstance().get(Calendar.YEAR)) throw new Throwable ("-6");
		// traitement
		this.nom = nom.toUpperCase();
		this.race = race.toUpperCase();
		this.sexe = Character.toUpperCase(sexe);
		dateNaissance[0] = jour;
		dateNaissance[1] = mois;
		dateNaissance[2] = annee;

	}

/**
* Accesseurs de consultation
* @return Retourne le nom
**/
	public String getNom() { return this.nom; }

/**
* Accesseurs de modification du nom
**/
	public void setNom(String aNom) { this.nom = aNom.toUpperCase(); }

/**
* Accesseurs de consultation
* @return Retourne la race
**/
	public String getRace() { return this.race; }

/**
* Accesseurs de consultation
* @return Retourne le jour de naissance
**/
	public int getJour() {return dateNaissance[0];}

/**
* Accesseurs de consultation
* @return Retourne le mois de naissance
**/
	public int getMois() {return dateNaissance[1];}

/**
* Accesseurs de consultation
* @return Retourne l'année de naissance
**/
	public int getAnnee() {return dateNaissance[2];}

/* Accesseurs de consultation
* @return Retourne l'age calculé sous la forme a an(s) m mois j jour(s)
**/
  	public String getAge()
  	{
  		// date du jour
     	Calendar aujourdhui = Calendar.getInstance();

  		// obtention des éléments de la date du jour
     	int annee = aujourdhui.get(Calendar.YEAR);
     	int num_mois = aujourdhui.get(Calendar.MONTH);
     	int jour = aujourdhui.get(Calendar.DAY_OF_MONTH);
     	int num_jour = aujourdhui.get(Calendar.DAY_OF_WEEK);

  		//  date de naissance
     	Calendar datedenaissance = new GregorianCalendar(getAnnee(),getMois()-1,getJour());

  		//  obtention des éléments de la date de naissance
     	int annee_dn = datedenaissance.get(Calendar.YEAR);
    	int num_mois_dn = datedenaissance.get(Calendar.MONTH);
     	int jour_dn = datedenaissance.get(Calendar.DAY_OF_MONTH);
     	int num_jour_dn = datedenaissance.get(Calendar.DAY_OF_WEEK);

     	int nbAnnees = aujourdhui.get(Calendar.YEAR) - datedenaissance.get(Calendar.YEAR);
     	age[2] = nbAnnees;
     	datedenaissance.add(Calendar.YEAR,nbAnnees);

     	int nbMois = aujourdhui.get(Calendar.MONTH) - datedenaissance.get(Calendar.MONTH);
     	if(nbMois <0)
        	nbMois*= -1;
     	age[1] = nbMois;
     	datedenaissance.add(Calendar.MONTH,nbAnnees);

     	int nbJours = aujourdhui.get(Calendar.DAY_OF_MONTH) - datedenaissance.get(Calendar.DAY_OF_MONTH);
     	if(nbJours <0)
        	nbJours*= -1;
     	age[0] = nbJours;

		// resultat sous la forme d'une chaine de caractères
		String age = "";
     	age+= nbAnnees + " an" + (nbAnnees>1?"s":"") + " ";
     	age+= nbMois + " mois ";
     	age+= nbJours + " jour" + (nbJours>1?"s":"");
		return age;
	 }

/**
* Methode standard toString
* @return Retourne une forme externe de l'objet support
**/
	public String toString()
	{
		return getClass().getName() + " " + nom + ", " + race + ", " + sexe + ", "
			+ toStringDate(dateNaissance[0], dateNaissance[1], dateNaissance[2]);
	}

/**
* Methode standard toStringDate
* @return Retourne une date de naissance sous la forme jj/mm/aaaa
**/
	public static String toStringDate(int j, int m, int a)
	{
		return String.format("%1$02d/%2$02d/%3$04d", j, m, a);
	}

/**
* Methode standard clone
* @return Retourne un nouveau chien qui a le même contenu que l'objet support
*
**/

	public Object clone()
	{
		Animal c = null;
		try{
			c = new Animal(nom, race, sexe, getJour(), getMois(), getAnnee());
		}
        catch(Throwable t){ c = new Animal();}
        return c;
	}

/**
* Methode standard equals
* @return Retourne vrai si le contenu de l'objet en paramètre
* est égal au contenu de l'objet support, faux sinon
*
**/
	public boolean equals(Object o)
	{
		if (!(o instanceof Animal)) return false;
		Animal c = (Animal) o;
		if (!this.nom.equals(c.nom)) return false;
		if (!this.race.equals(c.race)) return false;
		if (!this.sexe.equals(c.sexe)) return false;
		if (!toStringDate(dateNaissance[0], dateNaissance[1], dateNaissance[2]).equals(toStringDate(c.dateNaissance[0], c.dateNaissance[1], c.dateNaissance[2]))) return false;
		return true;
	}

/**
* Methode standard accouplementPossible
* @return Retourne vrai si l'animal (objet support) et l'animal passé en paramètre peuvent s'accoupler
*
**/
	public boolean accouplementPossible(Animal c)
	{
		if (!this.race.equals(c.race)) return false;
		if (this.sexe.equals(c.sexe)) return false;
		return true;
	}

}
/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Chien - exercice
*
*
*    + Version 1.0.0	: Version initiale
*    + Version 1.1.0	: Rajout de la catégorie
*    + Version 2.0.0	: Herite de Animal
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/

import java.util.*;
import java.lang.*;
import java.text.*;

public class Chien extends Animal
{
	public enum Categorie { ATTAQUE, DEFENSE, COMPAGNIE, SECOURS, INDETERMINE }
	private Categorie categorie;

/**
* Constructeur par défaut
**/
	public Chien()
	{
		super();
		categorie = Categorie.INDETERMINE;
	}

/**
* Constructeur normal
**/
	public Chien(String nom, String race, Character sexe, int jour, int mois, int annee, Categorie categorie) throws Throwable
	{
		super(nom, race, sexe, jour, mois, annee);
		this.categorie = categorie;

	}

/**
* Accesseurs de consultation
* @return Retourne la categorie
**/
	public Categorie getCategorie() {return categorie;}

/**
* Methode standard toString héritée de Animal et redefinie ici
* @return Retourne une forme externe de l'objet support
**/
	public String toString()
	{
		return super.toString() + " : " + categorie.toString();
	}

/**
* Methode standard clone
* @return Retourne un nouveau chien qui a le même contenu que l'objet support
*
**/

	public Object clone()
	{
		Chien c = null;
		try{
			c = new Chien(nom, race, sexe, getJour(), getMois(), getAnnee(), getCategorie());
		}
        catch(Throwable t){ c = new Chien();}
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
		if (o == null) return false;
		if (!(o instanceof Chien)) return false;
		return super.equals(o);
	}

}
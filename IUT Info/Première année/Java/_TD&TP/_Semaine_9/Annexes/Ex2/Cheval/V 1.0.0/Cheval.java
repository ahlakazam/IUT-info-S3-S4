/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Cheval - exercice
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/

import java.util.*;
import java.lang.*;
import java.text.*;

public class Cheval extends Animal
{
	public enum Robe { NOIR, ALEZAN, BAI, AUTRE, INDETERMINE }
	private Robe robe;
	private boolean marque;

/**
* Constructeur par défaut
**/
	public Cheval()
	{
		super();
		robe = Robe.INDETERMINE;
		marque = false;
	}

/**
* Constructeur normal
**/
	public Cheval(String nom, String race, Character sexe, int jour, int mois, int annee, Robe robe, boolean marque) throws Throwable
	{
		super(nom, race, sexe, jour, mois, annee);
		this.robe = robe;
		this.marque = marque;
	}

/**
* Accesseurs de consultation
* @return Retourne la robe
**/
	public Robe getRobe() {return robe;}

/**
* Accesseurs de consultation
* @return Retourne la marque
**/
	public boolean getMarque() {return marque;}

/**
* Methode standard toString héritée de Animal et redefinie ici
* @return Retourne une forme externe de l'objet support
**/
	public String toString()
	{
		return super.toString() + " : " + robe.toString() + ", " + marque;
	}

/**
* Methode standard clone
* @return Retourne un nouveau Cheval qui a le même contenu que l'objet support
*
**/

	public Object clone()
	{
		Cheval c = null;
		try{
			c = new Cheval(nom, race, sexe, getJour(), getMois(), getAnnee(), getRobe(), marque);
		}
        catch(Throwable t){ c = new Cheval();}
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
		if (!(o instanceof Cheval)) return false;
		Cheval c = (Cheval) o;
		return super.equals(o) && this.robe.equals(c.robe) && this.marque==c.marque;
	}

}
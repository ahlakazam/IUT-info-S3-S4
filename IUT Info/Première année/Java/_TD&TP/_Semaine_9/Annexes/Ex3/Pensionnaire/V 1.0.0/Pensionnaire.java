/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Pensionnaire - IE1
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/
import java.util.*;

public class Pensionnaire
{
	private Animal animal;
	private int[] dateArrivee = new int[3];
	private int nbJours;

	public Pensionnaire()
	{
		animal = null;
		dateArrivee[0] = 1;
		dateArrivee[1] = 1;
		dateArrivee[2] = 1970;
		nbJours = 0;
	}

	public Pensionnaire (Animal a, int jour, int mois, int annee, int nbJours) throws Throwable
	{
		if (a == null) throw new Throwable("-1");
		if (!Temps.verifierDate(jour, mois, annee))throw new Throwable ("-2");
		if (annee > Calendar.getInstance().get(Calendar.YEAR)) throw new Throwable ("-3");
		if (nbJours <= 0) throw new Throwable ("-4");
		animal = a;
		dateArrivee[0] = jour;
		dateArrivee[1] = mois;
		dateArrivee[2] = annee;
		this.nbJours = nbJours;

	}

	public Animal getAnimal()
	{
		return animal;
	}

	public int[] getDateArrivee() {
		return this.dateArrivee;
	}

	public int getNbJours() {
		return this.nbJours;
	}

	public String toString()
	{
		if (animal != null)
		return animal.toString() + ", Séjour de " + nbJours +
			" jour(s) à partir du " + Temps.toStringDate(dateArrivee[0], dateArrivee[1], dateArrivee[2]);
		else return "null, Séjour de " + nbJours +
			" jour(s) à partir du " + Temps.toStringDate(dateArrivee[0], dateArrivee[1], dateArrivee[2]);

	}

	public Object clone()
	{
		Pensionnaire p = null;
		try
		{
			p = new Pensionnaire((Animal)this.animal.clone(), this.dateArrivee[0], this.dateArrivee[1], this.dateArrivee[2], this.nbJours);
		}
        catch(Throwable t){ p = new Pensionnaire();}
        return p;
	}

	public boolean equals(Object o)
	{
		if (o == null) return false;
		if (!(o instanceof Pensionnaire)) return false;
		Pensionnaire p = (Pensionnaire) o;
		if (this.animal == null) return (this.animal == p.animal);
		if (!this.animal.equals(p.animal)) return false;
		if (!Temps.equals(this.dateArrivee[0], this.dateArrivee[1], this.dateArrivee[2], p.dateArrivee[0], p.dateArrivee[1], p.dateArrivee[2])) return false;
		if (this.nbJours != p.nbJours) return false;
		return true;
	}

	public float coutSejour(float tarif)
	{
		return tarif * nbJours;
	}

}
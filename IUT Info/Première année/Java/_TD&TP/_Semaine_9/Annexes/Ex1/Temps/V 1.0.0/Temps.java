/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Temps - Regroupe des services autour du temps
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

public abstract class Temps
{
/**
* Methode standard toStringDate
* @return Retourne une date sous la forme jj/mm/aaaa
**/
	public static String toStringDate(int[] date)
	{
		return String.format("%1$02d/%2$02d/%3$04d", date[0], date[1], date[2]);
	}

/**
* Methode standard toStringDate
* @return Retourne une date sous la forme jj/mm/aaaa
**/
	public static String toStringDate(int j, int m, int a)
	{
		return String.format("%1$02d/%2$02d/%3$04d", j, m, a);
	}

/**
* Methode standard verifierDate
* @return Retourne un booléen indiquant que la date est syntaxiquement correcte
**/
	public static boolean verifierDate(int jour, int mois, int annee)
	{
		if (!(jour>=1 && jour<=31)) return false;
		if (!(mois>=1 && mois<=12)) return false;
		if (annee < 1900) return false;
		return true;
	}

/**
* Methode standard nbJours
* @return Retourne le nombre de jours entre 2 dates
**/
	public static int nbJours(int jour1, int mois1, int annee1, int jour2, int mois2, int annee2) throws Throwable
	{
		if (!verifierDate(jour1, mois1, annee1)) throw new Throwable("-1");
		if (!verifierDate(jour2, mois2, annee2)) throw new Throwable("-2");

		Calendar d1 = GregorianCalendar.getInstance();
		d1.set (annee1, mois1, jour1, 0, 0, 0);

		Calendar d2 = GregorianCalendar.getInstance();
		d2.set (annee2, mois2, jour2, 0, 0, 0);

		if (d1.equals(d2)) return 0;

		return (int) (Math.abs(d1.getTimeInMillis() - d2.getTimeInMillis()) / 86400000);
	}

/**
* Methode standard equals : teste l'égalité de 2 dates
* @return Retourne un booléen
**/
	public static boolean equals(int jour1, int mois1, int annee1, int jour2, int mois2, int annee2)
	{
		Calendar d1 = GregorianCalendar.getInstance();
		d1.set (annee1, mois1, jour1, 0, 0, 0);

		Calendar d2 = GregorianCalendar.getInstance();
		d2.set (annee2, mois2, jour2, 0, 0, 0);

		return (d1.equals(d2));
	}


}
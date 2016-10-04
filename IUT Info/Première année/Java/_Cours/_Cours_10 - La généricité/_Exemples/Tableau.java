/**
 * @(#)Tableau.java
 *
 *
 * @author
 * @version 1.00 2013/3/26
 */

import java.util.*;
public class Tableau
{
    public Tableau() {}

	public static <T> T getMilieu(T[] tab){return tab[tab.length / 2];}
	public static <T> T getMilieu(ArrayList<T> tab){return tab.get(tab.size() / 2);}

	public static <T> void afficher(T[] tab)
	{
		for (int i=0; i<tab.length; i++)
			System.out.printf("%s ", tab[i]);
		System.out.println();
	}
	public static <T> void afficher(ArrayList<T> tab)
	{
		for (T element : tab)
			System.out.printf("%s ", element);
		System.out.println();
	}

    public static <T> void afficher(Collection<T> c)
	{
		for (T e : c) System.out.println(e);
	}

	public static <T extends Comparable> void trier(T[] tab)
    {
		for (int i = 0; i < tab.length-1; i++)
			for (int j = i+1; j < tab.length; j++)
				if (tab[j].compareTo(tab[i])<=0)
				{
					T x = tab[i]; tab[i] = tab[j]; tab[j] = x;
				}
	}
    public static <T extends Comparable> void trier(ArrayList<T> tab)
    {
		for (int i = 0; i < tab.size()-1; i++)
			for (int j = i+1; j < tab.size(); j++)
				if (tab.get(j).compareTo(tab.get(i))<=0)
				{
					T x = tab.get(i); tab.set(i, tab.get(j)); tab.set(j, x);
				}
	}

	public static void main(String[] args)
	{
		String[] noms= {"Marie", "Jean", "Paul"};
		Integer[] valeurs= {3, 7, 5, 2};


		String a = Tableau.<String>getMilieu(noms) ;
		// Ou simplement
		a = Tableau.getMilieu(noms) ;
		System.out.println(a);

		Integer b = Tableau.getMilieu(valeurs);
		System.out.println(b);

		afficher(noms);
		afficher(valeurs);
		trier(noms);

		trier(valeurs);

		System.out.println("Liste de String");
		ArrayList<String> ls= new ArrayList<String>();
		ls.add("toto"); ls.add("titi");
		//for(String str : ls) System.out.println(str);
		afficher(ls);
		trier(ls);
		afficher(ls);

		System.out.println("\nListe de float");
		ArrayList<Float> lf = new ArrayList<Float>();
		lf.add(12.25f); lf.add(15.25f);
		afficher(lf);
		trier(lf);
		afficher(lf);

		System.out.println("\nListe de float collection");
		Collection<Float> c = lf;
		afficher(c);

		System.out.println("\nEnsemble trié de String");
		TreeSet<String> s = new TreeSet<String>();
		s.add("Marie");
		s.add("Jean");
		s.add("Paul");
		afficher(s);
		Comparator t = s.comparator();
		if (t == null) System.out.println("ordre naturel");


		System.out.println("\nEnsemble trié de String");
		Decroissant d = new Decroissant();
		TreeSet<String> ss = new TreeSet<String>(d);
		ss.add("Marie");
		ss.add("Jean");
		ss.add("Paul");
		afficher(ss);
		Comparator ts = ss.comparator();
		if (ts == d) System.out.println("ordre decroissant");

	}

}
//
// Annee 2011_2012 - Module DUT/S2 APO_Java
//
// Classe Ville - Support a la correction de l'IE_1 DUT/S2T
//
public class Ville
{
private String nom;
private Integer laPopulation;

	// Constructeur par defaut
   	public Ville ()
   	{
      this.nom     = "NICE";
      laPopulation = new Integer(345000);
   	}

	// Constructeur normal
   	public Ville (String nom, int population)
   	{
      this.nom     = nom.toUpperCase();
      laPopulation = new Integer(population);
   	}

	// Accesseurs
   	public String  getNom        () {return nom;}
   	public Integer getPopulation () {return laPopulation;}
   	public void    setPopulation (int population) {laPopulation=new Integer(population);}
}

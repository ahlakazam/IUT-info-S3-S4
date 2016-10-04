//
// Annee 2012_2013 - Module Java
//
//	Classe Ville
//

public class Ville
{
	private String m_nom;
	protected Integer m_population;

   	// --- Constructeur par defaut
   	public Ville ()
   	{
   		System.out.println("appel constructeur par defaut");
      	m_nom = "NICE";
      	m_population = new Integer(345000);
   	}

   // --- Constructeur normal
   	public Ville (String nom, int population)
   	{
      	m_nom = nom.toUpperCase();
      	m_population = new Integer(population);
   	}

   // --- Accesseurs
   	public final String  getNom        () {return m_nom;}
   	public Integer getPopulation () {return m_population;}

   	public String toString()  	    {return m_nom + ", " + m_population.toString();}
   	public String toString(String mes)  	    {return mes + " " + m_nom + ", " + m_population.toString();}

   	protected void setPopulation (int population) {m_population=new Integer(population);}
}

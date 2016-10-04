//
// Annee 2012_2013 - Module Java
//
//	Classe Capitale
//

public class Capitale extends Ville
{
	private String m_pays;

	public Capitale(String pays)
	{
		m_pays=pays.toUpperCase();
	}

	public Capitale(String nom, int pop, String pays)
	{
		super(nom, pop);
		m_pays=pays.toUpperCase();
	}

	public String toString()
	{
		//System.out.println(m_nom);
		System.out.println(getNom());
		return super.toString()+ ", Pays : " + m_pays ;
	}

	public char categorie()
	{
		 return 'C';
	}

	//public String getNom() {return "toto";	}
}
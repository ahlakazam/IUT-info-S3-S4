//
// Annee 2011_2012 - Module S3_Java - Feuille_1 / Ville.java
//
public class Ville {
private String nom;
private Integer laPopulation;

   public Ville () {				// Constructeur par defaut
      this.nom     = "NICE";
      laPopulation = new Integer(345000);
   }

   public Ville (String nom, int population) {	// Constructeur normal
      this.nom     = nom.toUpperCase();
      laPopulation = new Integer(population);
   }
						// Accesseurs
   public String  getNom        () {return nom;}
   public Integer getPopulation () {return laPopulation;}
   public void    setPopulation (int population) {
      laPopulation=new Integer(population);
   }

   public String toString() {

      return nom + "/" + laPopulation;
   }

   protected Object clone(Object source) {
   	System.out.println("clone");

      return new Ville(nom, laPopulation.intValue());
   }
}

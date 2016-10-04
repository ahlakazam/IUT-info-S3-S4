//
// Annee 2012_2013 - Module S3_Java
//
// Classe Test_Ville - Module de tests unitaires
//
public class Test_Ville
{

   public static void main (String[] args)
   {
	   Ville Nice   = new Ville();
	   Ville Nantes = new Ville ("Nantes",250000);

	   Tests.Begin("Ville", "1.0.0");

	      Tests.Design("Toutes les fonctions",3);
	         Tests.Case ("Controle des accesseurs");

	            Tests.Unit("NICE", Nice.getNom());
	            Tests.Unit(new Integer(345000), Nice.getPopulation());

	            Tests.Unit("NANTES", Nantes.getNom());
	            Tests.Unit(new Integer(250000), Nantes.getPopulation());

	            Nice.setPopulation(375000);
	            Tests.Unit(new Integer(375000), Nice.getPopulation());

	   Tests.End();

   }
}

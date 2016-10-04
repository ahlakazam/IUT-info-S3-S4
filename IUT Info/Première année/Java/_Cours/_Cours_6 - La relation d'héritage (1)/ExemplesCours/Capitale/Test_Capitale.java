//
// Annee 2012_2013 - Module S3_Java - Feuille_1
//
// Classe Test_Capitale - Module de tests unitaires
//
public class Test_Capitale
{

   public static void main (String[] args)
   {
	   Tests.Begin("Capitale", "1.0.0");

   	   	Capitale x = new Capitale("Italie");
	   	Capitale Paris   = new Capitale("Paris", 2234105, "France");

	      Tests.Design("Controle des constructeurs",3);
	      {
	         Tests.Case ("Premier constructeur");
	         {
	            Tests.Unit("NICE, 345000, Pays : ITALIE", x.toString());
	         }

	         Tests.Case ("Constructeur normal");
	         {
	            Tests.Unit("PARIS, 2234105, Pays : FRANCE", Paris.toString());
	         }
	      }

	      Tests.Design("Controle des accesseurs",3);
	      {
	         Tests.Case ("Tous les accesseurs");
	         {
	            Tests.Unit("PARIS", Paris.getNom());
	            Tests.Unit(new Integer(2234105), Paris.getPopulation());

	            Paris.setPopulation(2250000);
	            Tests.Unit(new Integer(2250000), Paris.getPopulation());

	         }
	      }

	      Tests.Design("Transtypage implicite ascendant",3);
	      {
	         Tests.Case ("Exemple");
	         {
	         	Ville v = Paris;
	            Tests.Unit("PARIS, 2250000, Pays : FRANCE", v.toString());
	         }
	      }

	   Tests.End();

   }
}

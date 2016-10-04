/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Chien - Tests unitaires des constructeurs
*                  (cas d'anomalies)
*
*
*    + Version 1.0.0	: Version initiale
*    + Version 1.1.0	: Rajout de la catégorie
*    + Version 2.0.0	: Herite de Animal
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Chien_A1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Chien", "2.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Construction d'un chien avec sexe indéterminé");
            {
            	Chien c1 = null;
            	try{
            		c1 = new Chien("Medor", "Cocker", 'X', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	}
            	catch(Throwable t){Tests.Unit("-3",  t.getMessage());}

            }
      }
      Tests.End();
   }
}
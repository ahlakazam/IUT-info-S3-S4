/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Chien - Tests unitaires des méthodes clone et equals
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*    + Version 1.1.0	: Rajout de la catégorie
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/

import java.text.*;

public class T_Chien_N2
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Chien", "1.1.0");
      	Tests.Design("Controle des methodes clone et equals", 3);
        {
            Tests.Case("Méthode clone");
            {
            	Chien c0= new Chien();
            	Chien cc0 = (Chien) c0.clone();
	            Tests.Unit(c0.toString(),  cc0.toString());

            	Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	Chien cc1 = (Chien) c1.clone();
	            Tests.Unit(c1.toString(),  cc1.toString());
            }

            Tests.Case("Méthode equals");
            {
            	Chien c0= new Chien();
            	Chien cc0 = (Chien) c0.clone();
	            Tests.Unit(true,  cc0.equals(c0));

            	Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	Chien c2 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	Chien c3 = new Chien("Medor", "Cocker", 'M', 3, 5, 2014, Chien.Categorie.COMPAGNIE);
	            Tests.Unit(true, c1.equals(c2));
	            Tests.Unit(false, c1.equals(c3));
	            Tests.Unit(false, c1.equals(new String("Medor")));

            }

      }
      Tests.End();
   }
}
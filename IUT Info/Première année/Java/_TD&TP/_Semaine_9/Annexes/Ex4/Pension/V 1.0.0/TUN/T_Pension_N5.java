/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pension - Tests unitaires des ajouts et suppressions de pensionnaires
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/

import java.text.*;

public class T_Pension_N5
{

   public static void main (String[] args) throws Throwable
   	{

		Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
		Cheval c2 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
		Cheval c3 = new Cheval("Buzz", "Poney", 'F', 3, 4, 2016, Cheval.Robe.ALEZAN, true);
	    Pension p1 = new Pension("Les remparts", 10, 20);
        p1.ajouterPensionnaire (c1, 12, 4, 2016, 3);
        p1.ajouterPensionnaire (c2, 12, 4, 2016, 3);
        p1.ajouterPensionnaire (c3, 12, 4, 2016, 3);

	    Tests.Begin("Pension", "1.0.0");
      	Tests.Design("Controle de la méthode enleverPensionnaire", 3);
        {
            Tests.Case("Suppression du chien");
            {
	            p1.enleverPensionnaire(c1);
	            Tests.Unit(0, p1.nbAnimaux("Chien"));
	            Tests.Unit(2, p1.nbAnimaux("Cheval"));
	            Tests.Unit(2, p1.nbAnimaux());
            }
            Tests.Case("Suppression d'un cheval");
            {
	            p1.enleverPensionnaire(c2);
	            Tests.Unit(0, p1.nbAnimaux("Chien"));
	            Tests.Unit(1, p1.nbAnimaux("Cheval"));
	            Tests.Unit(1, p1.nbAnimaux());
            }
      }
      Tests.End();
   }
}
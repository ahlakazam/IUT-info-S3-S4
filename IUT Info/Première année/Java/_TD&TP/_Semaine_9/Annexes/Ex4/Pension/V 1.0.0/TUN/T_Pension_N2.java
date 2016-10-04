/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pension - Tests unitaires des méthodes clone et equals
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

public class T_Pension_N2
{

   public static void main (String[] args) throws Throwable
   	{
		Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
		Cheval c2 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
		Cheval c3 = new Cheval("Buzz", "Poney", 'F', 3, 4, 2016, Cheval.Robe.ALEZAN, true);

        Pension p0= new Pension();
	    Pension p1 = new Pension("Les remparts", 10, 20);
	    Pension p2 = new Pension("Les remparts2", 10, 20);

      	Tests.Begin("Pension", "2.0.0");
      	Tests.Design("Controle des methodes clone et equals", 3);
        {
            Tests.Case("Méthode clone");
            {
            	Pension p00 = (Pension) p0.clone();
	            Tests.Unit(p0.toString(),  p00.toString());

            	Pension p11 = (Pension) p1.clone();
	            Tests.Unit(p1.toString(),  p11.toString());

            }

            Tests.Case("Méthode equals");
            {
            	Pension p00 = (Pension) p0.clone();
            	Pension p11 = (Pension) p1.clone();

	            Tests.Unit(true, p0.equals(p00));
	            Tests.Unit(true, p1.equals(p11));

	            Tests.Unit(false, p0.equals(p1));
	            Tests.Unit(false, p1.equals(new String("Medor")));
	            Tests.Unit(false, p1.equals(p2));

            }

            Tests.Case("Méthode clone après ajout de pensionnaires");
            {
	            p1.ajouterPensionnaire (c1, 12, 4, 2016, 3);
	            p1.ajouterPensionnaire (c2, 12, 4, 2016, 3);
	            p1.ajouterPensionnaire (c3, 12, 4, 2016, 3);
            	Pension p11 = (Pension) p1.clone();
	            Tests.Unit(p1.toString(),  p11.toString());
	            Tests.Unit(c1.toString(),  p11.getPensionnaire(c1).getAnimal().toString());
            }
      }
      Tests.End();
   }
}
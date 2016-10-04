/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pension - Tests unitaires des accesseurs
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

public class T_Pension_N3
{

   public static void main (String[] args) throws Throwable
   	{

		Pension p0= new Pension();
        Pension p1 = new Pension("Les remparts", 10, 20);
		Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
		Cheval c2 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);

      	Tests.Begin("Pension", "1.0.0");
      	Tests.Design("Controle des accesseurs", 3);
        {
            Tests.Case("Accesseur getCapacite");
            {
	            Tests.Unit(0,  p0.getCapacite());
	            Tests.Unit(30,  p1.getCapacite());
	            Tests.Unit(10,  p1.getCapacite("Cheval"));
	            Tests.Unit(20,  p1.getCapacite("Chien"));
            }
            Tests.Case("Accesseur nbAnimaux");
            {
	            Tests.Unit(0,  p0.nbAnimaux());
	            Tests.Unit(0,  p1.nbAnimaux());
	            Tests.Unit(0,  p1.nbAnimaux("Cheval"));
	            Tests.Unit(0,  p1.nbAnimaux("Chien"));
            }
            Tests.Case("Accesseur CAJour");
            {
	            Tests.Unit(0,  p0.CAJour());
	            Tests.Unit(0,  p1.CAJour());
            }
            Tests.Case("Accesseur getPensionnaire");
            {
	            p1.ajouterPensionnaire (c1, 12, 4, 2016, 3);
	            p1.ajouterPensionnaire (c2, 12, 4, 2016, 3);
	            Tests.Unit(c1.toString(),  p1.getPensionnaire(c1).getAnimal().toString());
	            Tests.Unit(c2.toString(),  p1.getPensionnaire(c2).getAnimal().toString());
            }
      }
      Tests.End();
   }
}
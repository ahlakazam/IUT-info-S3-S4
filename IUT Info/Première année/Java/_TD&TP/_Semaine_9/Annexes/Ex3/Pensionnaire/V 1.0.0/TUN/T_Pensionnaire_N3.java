/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pensionnaire - Tests unitaires des accesseurs
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

public class T_Pensionnaire_N3
{

   public static void main (String[] args) throws Throwable
   	{

	Pensionnaire p0= new Pensionnaire();

	Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
	Pensionnaire p1 = new Pensionnaire(c1, 24, 3, 2016, 10);

	Cheval c2 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
	Pensionnaire p2 = new Pensionnaire(c2, 24, 3, 2016, 3);

      Tests.Begin("Pensionnaire", "1.0.0");
      	Tests.Design("Controle des accesseurs", 3);
        {
            Tests.Case("Accesseur getAnimal");
            {
	            Tests.Unit(null,  p0.getAnimal());
	            Tests.Unit(c1.toString(),  p1.getAnimal().toString());
	            Tests.Unit(c2.toString(),  p2.getAnimal().toString());
            }
            Tests.Case("Accesseur getDateArrivee");
            {
	            Tests.Unit("01/01/1970",  Temps.toStringDate(p0.getDateArrivee()));
	            Tests.Unit("24/03/2016",  Temps.toStringDate(p1.getDateArrivee()));
            }
            Tests.Case("Accesseur getNbJours");
            {
	            Tests.Unit(0,  p0.getNbJours());
	            Tests.Unit(10,  p1.getNbJours());
	            Tests.Unit(3,  p2.getNbJours());
            }
            Tests.Case("Accesseur coutSejour");
            {
	            Tests.Unit(0,  p0.coutSejour(0));
	            Tests.Unit(10*5,  p1.coutSejour(5));
	            Tests.Unit(3*15,  p2.coutSejour(15));
            }
      }
      Tests.End();
   }
}
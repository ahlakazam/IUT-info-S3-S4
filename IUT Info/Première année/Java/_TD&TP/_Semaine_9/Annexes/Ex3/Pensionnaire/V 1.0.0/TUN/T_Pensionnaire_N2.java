/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pensionnaire - Tests unitaires des méthodes clone et equals
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

public class T_Pensionnaire_N2
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Pensionnaire", "2.0.0");
      	Tests.Design("Controle des methodes clone et equals", 3);
        {
            Tests.Case("Méthode clone");
            {
            	Pensionnaire p0= new Pensionnaire();
            	Pensionnaire p00 = (Pensionnaire) p0.clone();
	            Tests.Unit(p0.toString(),  p00.toString());

            	Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	Pensionnaire p1 = new Pensionnaire(c1, 24, 3, 2016, 10);
            	Pensionnaire p11 = (Pensionnaire) p1.clone();
	            Tests.Unit(p1.toString(),  p11.toString());
            	Cheval c2 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
            	Pensionnaire p2 = new Pensionnaire(c2, 24, 3, 2016, 3);
            	Pensionnaire p22 = (Pensionnaire) p2.clone();
	            Tests.Unit(p2.toString(),  p22.toString());

            }

            Tests.Case("Méthode equals");
            {
            	Pensionnaire p0= new Pensionnaire();
            	Pensionnaire p00 = (Pensionnaire) p0.clone();

            	Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	Pensionnaire p1 = new Pensionnaire(c1, 24, 3, 2016, 10);
            	Pensionnaire p11 = (Pensionnaire) p1.clone();

            	Cheval c2 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
            	Pensionnaire p2 = new Pensionnaire(c2, 24, 3, 2016, 3);
            	Pensionnaire p22 = (Pensionnaire) p2.clone();

	            Tests.Unit(true, p0.equals(p00));
	            Tests.Unit(true, p1.equals(p11));
	            Tests.Unit(true, p2.equals(p22));

	            Tests.Unit(false, p0.equals(p1));
	            Tests.Unit(false, p1.equals(new String("Medor")));
	            Tests.Unit(false, p1.equals(p2));

            }
      }
      Tests.End();
   }
}
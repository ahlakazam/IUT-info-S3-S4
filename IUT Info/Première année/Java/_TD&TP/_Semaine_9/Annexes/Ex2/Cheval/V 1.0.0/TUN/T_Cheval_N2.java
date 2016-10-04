/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Cheval - Tests unitaires des méthodes clone et equals
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

public class T_Cheval_N2
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Cheval", "2.0.0");
      	Tests.Design("Controle des methodes clone et equals", 3);
        {
            Tests.Case("Méthode clone");
            {
            	Cheval c0= new Cheval();
            	Cheval cc0 = (Cheval) c0.clone();
	            Tests.Unit(c0.toString(),  cc0.toString());

            	Cheval c1 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);

            	Cheval cc1 = (Cheval) c1.clone();
	            Tests.Unit(c1.toString(),  cc1.toString());
            }

            Tests.Case("Méthode equals");
            {
            	Cheval c0= new Cheval();
            	Cheval cc0 = (Cheval) c0.clone();
	            Tests.Unit(true,  cc0.equals(c0));

            	Cheval c1 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
	            Tests.Unit(true, c1.equals(c1.clone()));

            }

      }
      Tests.End();
   }
}
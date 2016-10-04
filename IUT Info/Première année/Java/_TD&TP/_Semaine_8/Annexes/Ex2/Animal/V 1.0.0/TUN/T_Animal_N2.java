/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Animal - Tests unitaires des méthodes clone et equals
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

public class T_Animal_N2
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Animal", "1.0.0");
      	Tests.Design("Controle des methodes clone et equals", 3);
        {
            Tests.Case("Méthode clone");
            {
            	Animal c0= new Animal();
            	Animal cc0 = (Animal) c0.clone();
	            Tests.Unit(c0.toString(),  cc0.toString());

            	Animal c1 = new Animal("Medor", "Cocker", 'M', 3, 5, 2015);
            	Animal cc1 = (Animal) c1.clone();
	            Tests.Unit(c1.toString(),  cc1.toString());
            }
            Tests.Case("Méthode equals");
            {
            	Animal c0= new Animal();
            	Animal cc0 = (Animal) c0.clone();
	            Tests.Unit(true,  cc0.equals(c0));

            	Animal c1 = new Animal("Medor", "Cocker", 'M', 3, 5, 2015);
            	Animal c2 = new Animal("Medor", "Cocker", 'M', 3, 5, 2015);
            	Animal c3 = new Animal("Medor", "Cocker", 'M', 3, 5, 2014);
	            Tests.Unit(true, c1.equals(c2));
	            Tests.Unit(false, c1.equals(c3));
	            Tests.Unit(false, c1.equals(new String("Medor")));

            }
      }
      Tests.End();
   }
}
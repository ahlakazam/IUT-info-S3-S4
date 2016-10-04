/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Animal - Tests unitaires des accesseurs
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

public class T_Animal_N3
{

   public static void main (String[] args)
   	{

      Tests.Begin("Animal", "1.0.0");
      	Tests.Design("Controle des accesseurs", 3);
        {
            Tests.Case("Accesseur getAge");
            {
            	Animal c1 = null;
            	Animal c2 = null;
            	try{
            		c1 = new Animal("Medor", "Cocker", 'M', 2, 2, 2010);
	               	Tests.Unit("6 ans 1 mois 2 jours",  c1.getAge());

            		c2 = new Animal("Brutus", "Chihuahua", 'M', 1, 3, 2016);
	               	Tests.Unit("0 an 0 mois 3 jours",  c2.getAge());
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}

            }
      }
      Tests.End();
   }
}
/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Cheval - Tests unitaires des accesseurs
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

public class T_Cheval_N3
{

   public static void main (String[] args)
   	{

      Tests.Begin("Cheval", "2.0.0");
      	Tests.Design("Controle des accesseurs", 3);
        {
            Tests.Case("Accesseur getAge");
            {
            	Cheval c1 = null;
            	Cheval c2 = null;
            	try{
            		c1 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
	               	Tests.Unit("1 an 1 mois 13 jours",  c1.getAge());
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}

            }
      }
      Tests.End();
   }
}
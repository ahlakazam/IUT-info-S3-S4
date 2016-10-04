/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Chien - Tests unitaires des accesseurs
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

public class T_Chien_N3
{

   public static void main (String[] args)
   	{

      Tests.Begin("Chien", "1.1.0");
      	Tests.Design("Controle des accesseurs", 3);
        {
            Tests.Case("Accesseur getAge");
            {
            	Chien c1 = null;
            	Chien c2 = null;
            	try{
            		c1 = new Chien("Medor", "Cocker", 'M', 2, 2, 2010, Chien.Categorie.COMPAGNIE);
	               	Tests.Unit("6 ans 1 mois 3 jours",  c1.getAge());

            		c2 = new Chien("Brutus", "Chihuahua", 'M', 1, 3, 2016, Chien.Categorie.SECOURS);
	               	Tests.Unit("0 an 0 mois 4 jours",  c2.getAge());
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}

            }
      }
      Tests.End();
   }
}
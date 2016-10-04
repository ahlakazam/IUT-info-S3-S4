/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Animal - Tests unitaires des constructeurs
*                  (cas d'anomalies)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Animal_A1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Animal", "1.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Construction d'un Animal avec sexe indéterminé");
            {
            	Animal c1 = null;
            	try{
            		c1 = new Animal("Medor", "Cocker", 'X', 3, 5, 2015);
            	}
            	catch(Throwable t){Tests.Unit("-3",  t.getMessage());}

            }
      }
      Tests.End();
   }
}
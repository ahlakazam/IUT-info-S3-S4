/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Cheval - Tests unitaires des constructeurs
*                  (cas d'anomalies)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Cheval_A1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Cheval", "2.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Construction d'un Cheval avec sexe indéterminé");
            {
            	Cheval c1 = null;
            	try{
            		c1 = new Cheval("Eclair", "Poney", 'X', 3, 5, 2015, Cheval.Robe.NOIR, false);
            	}
            	catch(Throwable t){Tests.Unit("-3",  t.getMessage());}

            }
      }
      Tests.End();
   }
}
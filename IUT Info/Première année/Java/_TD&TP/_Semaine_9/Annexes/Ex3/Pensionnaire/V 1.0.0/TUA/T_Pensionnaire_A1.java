/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pensionnaire - Tests unitaires des constructeurs
*                  (cas d'anomalies)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Pensionnaire_A1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Pensionnaire", "2.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Construction d'un pensionnaire sans animal");
            {
            	Pensionnaire p1 = null;
            	try{
            		p1 = new Pensionnaire(null, 24, 3, 2016, 10);
            	}
            	catch(Throwable t){Tests.Unit("-1",  t.getMessage());}

            }
      }
      Tests.End();
   }
}
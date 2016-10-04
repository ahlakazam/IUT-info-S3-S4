/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Temps - Tests unitaires des services
*                  (cas d'anomalies)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Temps_A1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Temps", "1.0.0");
      	Tests.Design("Controle de nbJours avec date incorrecte", 3);
        {
            Tests.Case("mois = 13");
            {
            	int n = 0;
            	try
            	{
               		 n= Temps.nbJours(17, 13, 2015, 17,3,2014);
            	}
            	catch(Throwable t){Tests.Unit("-1",  t.getMessage());}

            }
      }
      Tests.End();
   }
}
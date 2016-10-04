/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Temps - Tests unitaires des services
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Temps_N1
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Temps", "1.0.0");
      	Tests.Design("Controle des services", 3);
        {
            Tests.Case("verifierDate");
            {
               	Tests.Unit(true,  Temps.verifierDate(24,3,2016));
            }
            Tests.Case("toStringDate");
            {
               	Tests.Unit("24/03/2016",  Temps.toStringDate(24,3,2016));
               	Tests.Unit("24/03/2016",  Temps.toStringDate(new int[]{24,3,2016}));
            }
            Tests.Case("nbJours");
            {
               	Tests.Unit(0, Temps.nbJours(24, 3, 2016, 24,3,2016));
               	Tests.Unit(1, Temps.nbJours(25, 3, 2016, 24,3,2016));
               	Tests.Unit(1, Temps.nbJours(24, 3, 2016, 25,3,2016));
               	Tests.Unit(7, Temps.nbJours(17, 3, 2016, 24,3,2016));
               	Tests.Unit(365, Temps.nbJours(17, 3, 2015, 17,3,2014));
            }

            Tests.Case("equals");
            {
               	Tests.Unit(true, Temps.equals(24, 3, 2016, 24,3,2016));
               	Tests.Unit(false, Temps.equals(25, 3, 2016, 24,3,2016));
            }
      }
      Tests.End();
   }
}
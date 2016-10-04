/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Pension - Tests unitaires des constructeurs
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Pension_N1
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Pension", "1.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Constructeur par defaut");
            {
            	Pension p0= new Pension();
               	Tests.Unit("Pension : INCONNU, Capacité : 0, Pensionnaires : 0",  p0.toString());
            }

            Tests.Case("Constructeur normal");
            {
            	Pension p1 = new Pension("Les remparts", 10, 20);
               	Tests.Unit("Pension : Les remparts, Capacité : 30, Pensionnaires : 0",  p1.toString());
            }
      }
      Tests.End();
   }
}
/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Cheval - Tests unitaires de la méthode accouplementPossible
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Cheval_N4
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Cheval", "2.0.0");
      	Tests.Design("Controle de la méthode accouplementPossible", 3);
        {

        	Cheval c1 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
        	Cheval c2 = new Cheval("Belle", "Poney", 'F', 3, 5, 2015, Cheval.Robe.NOIR, false);
        	Cheval c3 = new Cheval("Lune", "Trait", 'F', 3, 5, 2015, Cheval.Robe.NOIR, false);

            Tests.Case("Cas OK");
            {
               	Tests.Unit(true,  c1.accouplementPossible(c2));
            }

            Tests.Case("Cas KO");
            {
               	Tests.Unit(false,  c1.accouplementPossible(c3));
            }

      }
      Tests.End();
   }
}
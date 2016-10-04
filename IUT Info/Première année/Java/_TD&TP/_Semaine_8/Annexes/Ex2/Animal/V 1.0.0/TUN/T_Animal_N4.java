/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Animal - Tests unitaires de la méthode accouplementPossible
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Animal_N4
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Animal", "1.0.0");
      	Tests.Design("Controle de la méthode accouplementPossible", 3);
        {

        	Animal c1 =  new Animal("Medor", "Cocker", 'M', 2, 2, 2010);
        	Animal c2 =  new Animal("Titine", "Cocker", 'F', 2, 2, 2008);
         	Animal c3 = new Animal("Brutus", "Chihuahua", 'M', 1, 3, 2016);

            Tests.Case("Cas OK");
            {
               	Tests.Unit(true,  c1.accouplementPossible(c2));
            }

            Tests.Case("Cas KO");
            {
               	Tests.Unit(false,  c2.accouplementPossible(c3));
            }

      }
      Tests.End();
   }
}
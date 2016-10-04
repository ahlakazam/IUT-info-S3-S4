/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Chien - Tests unitaires de la méthode accouplementPossible
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


public class T_Chien_N4
{

   public static void main (String[] args) throws Throwable
   	{

      Tests.Begin("Chien", "1.1.0");
      	Tests.Design("Controle de la méthode accouplementPossible", 3);
        {

        	Chien c1 =  new Chien("Medor", "Cocker", 'M', 2, 2, 2010, Chien.Categorie.COMPAGNIE);
        	Chien c2 =  new Chien("Titine", "Cocker", 'F', 2, 2, 2008, Chien.Categorie.COMPAGNIE);
         	Chien c3 = new Chien("Brutus", "Chihuahua", 'M', 1, 3, 2016, Chien.Categorie.SECOURS);

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
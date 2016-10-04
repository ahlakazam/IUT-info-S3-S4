/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Chien - Tests unitaires des constructeurs
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*    + Version 1.1.0	: Rajout de la catégorie
*    + Version 2.0.0	: Herite de Animal
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Chien_N1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Chien", "2.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Constructeur par defaut");
            {
            	Chien c0= new Chien();
               	Tests.Unit("Chien INCONNU, INCONNU, I, 00/00/0000, INDETERMINE",  c0.toString());
            }

            Tests.Case("Constructeur normal");
            {
            	Chien c1 = null;
            	try{
            		c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}
               	Tests.Unit("Chien MEDOR, COCKER, M, 03/05/2015, COMPAGNIE",  c1.toString());
            }
      }
      Tests.End();
   }
}
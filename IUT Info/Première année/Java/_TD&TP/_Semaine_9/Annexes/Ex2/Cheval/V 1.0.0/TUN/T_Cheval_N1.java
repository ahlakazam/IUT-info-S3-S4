/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Cheval - Tests unitaires des constructeurs
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Cheval_N1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Cheval", "2.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Constructeur par defaut");
            {
            	Cheval c0= new Cheval();
               	Tests.Unit("Cheval INCONNU, INCONNU, I, 00/00/0000 : INDETERMINE, false",  c0.toString());
            }

            Tests.Case("Constructeur normal");
            {
            	Cheval c1 = null;
            	try{
            		c1 = new Cheval("Eclair", "Poney", 'M', 3, 5, 2015, Cheval.Robe.NOIR, false);
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}
               	Tests.Unit("Cheval ECLAIR, PONEY, M, 03/05/2015 : NOIR, false",  c1.toString());
            }
      }
      Tests.End();
   }
}
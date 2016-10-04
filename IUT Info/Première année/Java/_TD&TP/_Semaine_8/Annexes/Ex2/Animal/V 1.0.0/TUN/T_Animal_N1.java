/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Animal - Tests unitaires des constructeurs
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Animal_N1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Animal", "1.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Constructeur par defaut");
            {
            	Animal c0= new Animal();
               	Tests.Unit("Animal INCONNU, INCONNU, I, 00/00/0000",  c0.toString());
            }

            Tests.Case("Constructeur normal");
            {
            	Animal c1 = null;
            	try{
            		c1 = new Animal("Medor", "Cocker", 'M', 3, 5, 2015);
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}
               	Tests.Unit("Animal MEDOR, COCKER, M, 03/05/2015",  c1.toString());
            }
      }
      Tests.End();
   }
}
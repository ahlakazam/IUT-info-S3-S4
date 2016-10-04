/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 6
*
* Classe Pensionnaire - Tests unitaires des constructeurs
*                  (cas nominaux)
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Pensionnaire_N1
{

   public static void main (String[] args)
   	{

      Tests.Begin("Pensionnaire", "1.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Constructeur par defaut");
            {
            	Pensionnaire p0= new Pensionnaire();
               	Tests.Unit("null, Séjour de 0 jour(s) à partir du 01/01/1970",  p0.toString());
            }

            Tests.Case("Constructeur normal");
            {
            	Chien c1 = null;
            	Pensionnaire p1 = null;
            	try{
            		c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);
            		p1 = new Pensionnaire(c1, 24, 3, 2016, 10);
            	}
            	catch(Throwable t){ System.out.println(t.getMessage());}
               	Tests.Unit("Chien MEDOR, COCKER, M, 03/05/2015 : COMPAGNIE, Séjour de 10 jour(s) à partir du 24/03/2016",  p1.toString());
            }
      }
      Tests.End();
   }
}
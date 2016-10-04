/**
* IUT de Nice / Departement informatique / Module M2103
* Annee 2015_2016 - Semaine 5
*
* Classe Pension - Tests unitaires anomalies
*
*
*    + Version 1.0.0	: Version initiale
*
*
* @author Lise BRENAC - Universite de Nice/IUT - Departement informatique
*
**/


public class T_Pension_A1
{

   public static void main (String[] args) throws Throwable
   	{
        Pension p1 = new Pension("Les remparts", 10, 20);
		Chien c1 = new Chien("Medor", "Cocker", 'M', 3, 5, 2015, Chien.Categorie.COMPAGNIE);

      	Tests.Begin("Pension", "2.0.0");
      	Tests.Design("Controle des constructeurs", 3);
        {
            Tests.Case("Construction d'une pension sans nom");
            {
            	Pension p0 = null;
            	try{
            		p0 = new Pension(null, 0, 0);
            	}
            	catch(Throwable t){Tests.Unit("-1",  t.getMessage());}

            }
      	}

      	Tests.Design("Controle des accesseurs", 3);
        {
            Tests.Case("getPensionnaire avec paramètre null");
            {
            	Pensionnaire p = null;
            	try{
            		p = p1.getPensionnaire(null);
            	}
            	catch(Throwable t){Tests.Unit("-1",  t.getMessage());}

            }
      	}

      	Tests.End();
   }
}
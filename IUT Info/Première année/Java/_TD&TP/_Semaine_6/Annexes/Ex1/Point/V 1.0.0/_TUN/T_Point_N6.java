//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires de la methode symetrie
//
//

public class T_Point_N6
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle de la methode symetrie", 3);
         {

            Tests.Case("methode symetrie");
            {
            	Point p0 = new Point();
   				Point p1 = new Point(1., 1.);
   				Point p2 = new Point(1., 4.5);

   				Tests.Unit("(-0.0 , -0.0)",  p0.symetrie().toString());
    			Tests.Unit("(-1.0 , -1.0)",  p1.symetrie().toString());
    			Tests.Unit("(-1.0 , -4.5)",  p2.symetrie().toString());
            }
         }
      Tests.End();
   }
}